package com.example.customadapter;

public class CountryCapitalList {
    private String mCountry;
    private String mCapital;

    CountryCapitalList(String country, String capital){
        mCountry = country;
        mCapital = capital;
    }

    public String getmCountry() {
        return mCountry;
    }
    public String getmCapital() {
        return mCapital;
    }


}
