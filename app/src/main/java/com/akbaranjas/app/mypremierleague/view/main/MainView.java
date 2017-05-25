package com.akbaranjas.app.mypremierleague.view.main;

import com.akbaranjas.app.mypremierleague.model.pojos.mainpojos.LeagueTable;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public interface MainView {
    void onSuccess(LeagueTable result);
    void onError(Throwable err);
}
