package com.akbaranjas.app.mypremierleague.view.detail;

import com.akbaranjas.app.mypremierleague.model.pojos.detailpojos.SquadList;

/**
 * Created by Asus A450C on 25/05/2017.
 */
public interface DetailView {
    void onSuccess(SquadList result);
    void onError(Throwable err);
}
