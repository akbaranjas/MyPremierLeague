
package com.akbaranjas.app.mypremierleague.model.pojos.detailpojos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SquadList {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("players")
    private List<Player> mPlayers;
    @SerializedName("_links")
    private com.akbaranjas.app.mypremierleague.model.pojos.detailpojos._links m_links;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public List<Player> getPlayers() {
        return mPlayers;
    }

    public void setPlayers(List<Player> players) {
        mPlayers = players;
    }

    public com.akbaranjas.app.mypremierleague.model.pojos.detailpojos._links get_links() {
        return m_links;
    }

    public void set_links(com.akbaranjas.app.mypremierleague.model.pojos.detailpojos._links _links) {
        m_links = _links;
    }

}
