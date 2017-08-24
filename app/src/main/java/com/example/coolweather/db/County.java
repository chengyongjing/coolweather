package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 陈勇劲 on 2017/7/26.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountryName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weathrId) {
        this.weatherId = weathrId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
