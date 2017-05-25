package com.akbaranjas.app.mypremierleague.view.detail;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.akbaranjas.app.mypremierleague.R;
import com.akbaranjas.app.mypremierleague.adapter.ListAdapter;
import com.akbaranjas.app.mypremierleague.base.BaseActivity;
import com.akbaranjas.app.mypremierleague.holder.PlayerHolder;
import com.akbaranjas.app.mypremierleague.model.pojos.detailpojos.Player;
import com.akbaranjas.app.mypremierleague.model.pojos.detailpojos.SquadList;
import com.akbaranjas.app.mypremierleague.presenter.detail.DetailPresenter;
import com.akbaranjas.app.mypremierleague.presenter.detail.DetailPresenterImpl;
import com.akbaranjas.app.mypremierleague.utils.svgdecoder.GRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import butterknife.BindView;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class DetailActivity extends BaseActivity implements DetailView {

    private final String TAG = "DetailActivity";
    public static final String EXTRA_TEAM_ID = "id";
    public static final String EXTRA_URL_LOGO = "url_logo";
    public static final String EXTRA_TEAM_NAME = "team_name";

    private String teamID, urlLogo,teamName;

    private DetailPresenter detailPresenter;
    private ListAdapter adapter;

    @BindView(R.id.lst_squads)
    RecyclerView lstSquads;

    @BindView(R.id.img_club_logo_detail)
    ImageView imgClubLogo;

    @BindView(R.id.txt_club_name_detail)
    TextView txtClubName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_detail);
        initView();
        detailPresenter = new DetailPresenterImpl(this);
        subscriber = detailPresenter.getResult(Integer.parseInt(teamID))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

       if(id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView(){
        teamID = getIntent().getStringExtra(EXTRA_TEAM_ID);
        teamName = getIntent().getStringExtra(EXTRA_TEAM_NAME);
        urlLogo = getIntent().getStringExtra(EXTRA_URL_LOGO);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(teamName);
        String ext = urlLogo.substring(urlLogo.length() - 3);
        Uri uri = Uri.parse(urlLogo);
        if(ext.equals("svg")) {
            GRequestBuilder.getRequestBuilder(this)
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .load(uri)
                    .into(imgClubLogo);
        }else if(ext.equals("png")){
            Glide.with(this)
                    .load(uri)
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .into(imgClubLogo);
        }
        txtClubName.setText(teamName);

    }

    @Override
    public void onSuccess(SquadList result) {
        lstSquads.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ListAdapter<Player, PlayerHolder>(R.layout.item_squads, PlayerHolder.class, Player.class, result.getPlayers()) {
            @Override protected void bindView(PlayerHolder holder, Player model, final int position) {
                holder.bind(model.getName(),model.getPosition(),model.getJerseyNumber()
                ,model.getDateOfBirth(),model.getNationality());
            }
        };

        lstSquads.setAdapter(adapter);
    }

    @Override
    public void onError(Throwable err) {
        Log.e(TAG, err.toString());
    }
}
