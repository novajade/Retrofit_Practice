package com.example.zzong.Retrofit_practice.retro;

import com.google.gson.annotations.SerializedName;

public class ApiObject {

    @SerializedName("title")
    private String title;

    @SerializedName("pubDate")
    private String pubDate;

    @SerializedName("director")
    private String director;

    @SerializedName("actor")
    private String actor;

    @SerializedName("userRating")
    private String userRating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
}
