package com.akbaranjas.app.mypremierleague.presenter.detail;

import com.akbaranjas.app.mypremierleague.model.pojos.detailpojos.SquadList;

import rx.Observable;

/**
 * Created by Asus A450C on 25/05/2017.
 */
public interface DetailPresenter {
    Observable<SquadList> getResult(int id);
}
