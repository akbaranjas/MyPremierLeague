package com.akbaranjas.app.mypremierleague.presenter.detail;

import com.akbaranjas.app.mypremierleague.model.detail.DetailModel;
import com.akbaranjas.app.mypremierleague.model.detail.DetailModelImpl;
import com.akbaranjas.app.mypremierleague.model.pojos.detailpojos.SquadList;
import com.akbaranjas.app.mypremierleague.utils.retrofit.APIInterface;
import com.akbaranjas.app.mypremierleague.view.detail.DetailView;

import rx.Observable;

/**
 * Created by Asus A450C on 25/05/2017.
 */
public class DetailPresenterImpl implements DetailPresenter {

    DetailModel model;
    DetailView view;

    public DetailPresenterImpl(DetailView view) {
        model = new DetailModelImpl();
        this.view = view;
    }

    @Override
    public Observable<SquadList> getResult(int id) {
        APIInterface apiInterface = model.build();
        return apiInterface.getSquadList(id);
    }
}
