package com.akbaranjas.app.mypremierleague.view.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.akbaranjas.app.mypremierleague.R;
import com.akbaranjas.app.mypremierleague.adapter.ListAdapter;
import com.akbaranjas.app.mypremierleague.base.BaseActivity;
import com.akbaranjas.app.mypremierleague.holder.StandingListHolder;
import com.akbaranjas.app.mypremierleague.model.pojos.mainpojos.LeagueTable;
import com.akbaranjas.app.mypremierleague.model.pojos.mainpojos.Standing;
import com.akbaranjas.app.mypremierleague.presenter.main.MainPresenter;
import com.akbaranjas.app.mypremierleague.presenter.main.MainPresenterImpl;
import com.akbaranjas.app.mypremierleague.view.detail.DetailActivity;

import butterknife.BindView;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements MainView {

    private final String TAG = "MainActivity";

    private MainPresenter mainPresenter;
    private ListAdapter adapter;

    @BindView(R.id.lst_standings)
    RecyclerView lstStanding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_main);
        mainPresenter = new MainPresenterImpl(this);
        subscriber = mainPresenter.getResult()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSuccess(LeagueTable result) {
        lstStanding.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ListAdapter<Standing, StandingListHolder>(R.layout.item_standings, StandingListHolder.class, Standing.class, result.getStanding()) {
            @Override protected void bindView(StandingListHolder holder, Standing model, final int position) {
                holder.bind(model.getTeamName(), model.getPosition()
                        ,model.getCrestURI(), model.getPlayedGames(), model.getPoints());
                holder.getItemStandings().setOnClickListener(v -> {
                    Intent i = new Intent(MainActivity.this, DetailActivity.class);
                    String link_teams = model.get_links().getTeam().getHref();
                    i.putExtra(DetailActivity.EXTRA_TEAM_ID, link_teams.substring(link_teams.indexOf("teams") + 6));
                    i.putExtra(DetailActivity.EXTRA_TEAM_NAME, model.getTeamName());
                    i.putExtra(DetailActivity.EXTRA_URL_LOGO, model.getCrestURI());
                    startActivity(i);
                });
            }
        };

        lstStanding.setAdapter(adapter);
    }

    @Override
    public void onError(Throwable err) {
        Log.e(TAG, err.getMessage());
    }
}
