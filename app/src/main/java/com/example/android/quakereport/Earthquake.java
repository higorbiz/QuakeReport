package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mDate;
    private String mUrl;


    public Earthquake(Double mMagnitude, String mLocation, String mDate, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mUrl = mUrl;
    }


    public Double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(Double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
