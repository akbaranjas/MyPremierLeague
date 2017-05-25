package com.akbaranjas.app.mypremierleague.presenter.main;

import com.akbaranjas.app.mypremierleague.model.pojos.mainpojos.LeagueTable;

import rx.Observable;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public interface MainPresenter {
    Observable<LeagueTable> getResult();
}
