
package com.akbaranjas.app.mypremierleague.model.pojos.mainpojos;

import com.google.gson.annotations.SerializedName;

public class Competition {

    @SerializedName("href")
    private String mHref;

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

}
