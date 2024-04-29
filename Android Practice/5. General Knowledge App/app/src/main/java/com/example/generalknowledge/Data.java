package com.example.generalknowledge;

public class Data {
    String states, capital;
    int mImageResourceId;

    public Data(String states, String capital, int mImageResourceId) {
        this.states = states;
        this.capital = capital;
        this.mImageResourceId = mImageResourceId;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
