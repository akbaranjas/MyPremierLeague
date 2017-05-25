package com.akbaranjas.app.mypremierleague.presenter.main;

import com.akbaranjas.app.mypremierleague.model.pojos.mainpojos.LeagueTable;
import com.akbaranjas.app.mypremierleague.model.main.MainModel;
import com.akbaranjas.app.mypremierleague.model.main.MainModelImpl;
import com.akbaranjas.app.mypremierleague.utils.retrofit.APIInterface;
import com.akbaranjas.app.mypremierleague.view.main.MainView;

import rx.Observable;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public class MainPresenterImpl implements MainPresenter{

    MainModel model;
    MainView view;

    public MainPresenterImpl(MainView view) {
        model = new MainModelImpl();
        this.view = view;
    }

    @Override public Observable<LeagueTable> getResult() {
        APIInterface apiInterface = model.build();
        return apiInterface.getStandings();
    }
}
