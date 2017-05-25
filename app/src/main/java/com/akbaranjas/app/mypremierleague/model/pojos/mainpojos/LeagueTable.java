
package com.akbaranjas.app.mypremierleague.model.pojos.mainpojos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LeagueTable {

    @SerializedName("leagueCaption")
    private String mLeagueCaption;
    @SerializedName("matchday")
    private Long mMatchday;
    @SerializedName("standing")
    private List<Standing> mStanding;
    @SerializedName("_links")
    private _links m_links;

    public String getLeagueCaption() {
        return mLeagueCaption;
    }

    public void setLeagueCaption(String leagueCaption) {
        mLeagueCaption = leagueCaption;
    }

    public Long getMatchday() {
        return mMatchday;
    }

    public void setMatchday(Long matchday) {
        mMatchday = matchday;
    }

    public List<Standing> getStanding() {
        return mStanding;
    }

    public void setStanding(List<Standing> standing) {
        mStanding = standing;
    }

    public _links get_links() {
        return m_links;
    }

    public void set_links(_links _links) {
        m_links = _links;
    }

}
