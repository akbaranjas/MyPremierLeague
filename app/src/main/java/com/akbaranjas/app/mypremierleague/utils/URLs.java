package com.akbaranjas.app.mypremierleague.utils;

import com.akbaranjas.app.mypremierleague.BuildConfig;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public class URLs {
    private static final String BASE_URL = BuildConfig.URI;
    private static final String STANDING_URL = "/competitions/426/leagueTable";

    public static String getMainURL() {
        return BASE_URL;
    }

    public static String getStanding() {
        return BASE_URL + STANDING_URL;
    }
}
