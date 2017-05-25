package com.akbaranjas.app.mypremierleague.utils.retrofit;

import com.akbaranjas.app.mypremierleague.model.pojos.mainpojos.LeagueTable;
import com.akbaranjas.app.mypremierleague.model.pojos.detailpojos.SquadList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Asus A450C on 25/05/2017.
 */
public interface APIInterface {
    @GET("competitions/426/leagueTable")
    Observable<LeagueTable> getStandings();

    @GET("teams/{id}/players")
    Observable<SquadList> getSquadList(@Path("id") int id);
}
