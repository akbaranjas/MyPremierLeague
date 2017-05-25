
package com.akbaranjas.app.mypremierleague.model.pojos.mainpojos;

import com.google.gson.annotations.SerializedName;

public class Home {

    @SerializedName("draws")
    private Long mDraws;
    @SerializedName("goals")
    private Long mGoals;
    @SerializedName("goalsAgainst")
    private Long mGoalsAgainst;
    @SerializedName("losses")
    private Long mLosses;
    @SerializedName("wins")
    private Long mWins;

    public Long getDraws() {
        return mDraws;
    }

    public void setDraws(Long draws) {
        mDraws = draws;
    }

    public Long getGoals() {
        return mGoals;
    }

    public void setGoals(Long goals) {
        mGoals = goals;
    }

    public Long getGoalsAgainst() {
        return mGoalsAgainst;
    }

    public void setGoalsAgainst(Long goalsAgainst) {
        mGoalsAgainst = goalsAgainst;
    }

    public Long getLosses() {
        return mLosses;
    }

    public void setLosses(Long losses) {
        mLosses = losses;
    }

    public Long getWins() {
        return mWins;
    }

    public void setWins(Long wins) {
        mWins = wins;
    }

}
