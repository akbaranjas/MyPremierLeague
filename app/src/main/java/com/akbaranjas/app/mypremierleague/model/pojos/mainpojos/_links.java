
package com.akbaranjas.app.mypremierleague.model.pojos.mainpojos;

import com.google.gson.annotations.SerializedName;

public class _links {

    @SerializedName("competition")
    private Competition mCompetition;
    @SerializedName("self")
    private Self mSelf;
    @SerializedName("team")
    private Team mTeam;

    public Competition getCompetition() {
        return mCompetition;
    }

    public void setCompetition(Competition competition) {
        mCompetition = competition;
    }

    public Self getSelf() {
        return mSelf;
    }

    public void setSelf(Self self) {
        mSelf = self;
    }

    public Team getTeam() {
        return mTeam;
    }

    public void setTeam(Team team) {
        mTeam = team;
    }

}
