
package com.akbaranjas.app.mypremierleague.model.pojos.detailpojos;

import com.google.gson.annotations.SerializedName;

public class _links {

    @SerializedName("self")
    private Self mSelf;
    @SerializedName("team")
    private Team mTeam;

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
