
package com.akbaranjas.app.mypremierleague.model.pojos.mainpojos;

import com.google.gson.annotations.SerializedName;


public class Standing {

    @SerializedName("away")
    private Away mAway;
    @SerializedName("crestURI")
    private String mCrestURI;
    @SerializedName("draws")
    private Long mDraws;
    @SerializedName("goalDifference")
    private Long mGoalDifference;
    @SerializedName("goals")
    private Long mGoals;
    @SerializedName("goalsAgainst")
    private Long mGoalsAgainst;
    @SerializedName("home")
    private Home mHome;
    @SerializedName("losses")
    private Long mLosses;
    @SerializedName("playedGames")
    private int mPlayedGames;
    @SerializedName("points")
    private int mPoints;
    @SerializedName("position")
    private int mPosition;
    @SerializedName("teamName")
    private String mTeamName;
    @SerializedName("wins")
    private Long mWins;
    @SerializedName("_links")
    private _links m_links;

    public Away getAway() {
        return mAway;
    }

    public void setAway(Away away) {
        mAway = away;
    }

    public String getCrestURI() {
        return mCrestURI;
    }

    public void setCrestURI(String crestURI) {
        mCrestURI = crestURI;
    }

    public Long getDraws() {
        return mDraws;
    }

    public void setDraws(Long draws) {
        mDraws = draws;
    }

    public Long getGoalDifference() {
        return mGoalDifference;
    }

    public void setGoalDifference(Long goalDifference) {
        mGoalDifference = goalDifference;
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

    public Home getHome() {
        return mHome;
    }

    public void setHome(Home home) {
        mHome = home;
    }

    public Long getLosses() {
        return mLosses;
    }

    public void setLosses(Long losses) {
        mLosses = losses;
    }

    public int getPlayedGames() {
        return mPlayedGames;
    }

    public void setPlayedGames(int playedGames) {
        mPlayedGames = playedGames;
    }

    public int getPoints() {
        return mPoints;
    }

    public void setPoints(int points) {
        mPoints = points;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int position) {
        mPosition = position;
    }

    public String getTeamName() {
        return mTeamName;
    }

    public void setTeamName(String teamName) {
        mTeamName = teamName;
    }

    public Long getWins() {
        return mWins;
    }

    public void setWins(Long wins) {
        mWins = wins;
    }

    public _links get_links() {
        return m_links;
    }

    public void set_links(_links _links) {
        m_links = _links;
    }

}
