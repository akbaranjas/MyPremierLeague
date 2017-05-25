
package com.akbaranjas.app.mypremierleague.model.pojos.detailpojos;

import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("contractUntil")
    private String mContractUntil;
    @SerializedName("dateOfBirth")
    private String mDateOfBirth;
    @SerializedName("jerseyNumber")
    private int mJerseyNumber;
    @SerializedName("marketValue")
    private Object mMarketValue;
    @SerializedName("name")
    private String mName;
    @SerializedName("nationality")
    private String mNationality;
    @SerializedName("position")
    private String mPosition;

    public String getContractUntil() {
        return mContractUntil;
    }

    public void setContractUntil(String contractUntil) {
        mContractUntil = contractUntil;
    }

    public String getDateOfBirth() {
        return mDateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        mDateOfBirth = dateOfBirth;
    }

    public int getJerseyNumber() {
        return mJerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        mJerseyNumber = jerseyNumber;
    }

    public Object getMarketValue() {
        return mMarketValue;
    }

    public void setMarketValue(Object marketValue) {
        mMarketValue = marketValue;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNationality() {
        return mNationality;
    }

    public void setNationality(String nationality) {
        mNationality = nationality;
    }

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        mPosition = position;
    }

}
