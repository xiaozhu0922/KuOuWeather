package com.codekong.kuouweather.model;

/**
 * Created by 尚振鸿 on 2016-09-16.
 * 今天天气基本信息的Model
 */
public class TodayWeatherInfo {
    //城市名称
    private String cityName;
    //天气代号(countyCode)
    private String weatherCode;
    //当前温度
    private String curTemp;
    //风力大小
    private String fengli;
    //天气类型
    private String type;
    //最高温度
    private String hightemp;
    //最低温度
    private String lowtemp;
    //感冒指数
    private String gmIndex;
    //防晒指数
    private String fsIndex;
    //穿衣指数
    private String ctIndex;
    //运动指数
    private String ydIndex;
    //洗车指数
    private String xcIndex;
    //晾晒指数
    private String lsIndex;

    public TodayWeatherInfo(String cityName, String weatherCode, String curTemp, String fengli, String type, String hightemp, String lowtemp, String[] indexs) {
        this.cityName = cityName;
        this.weatherCode = weatherCode;
        this.curTemp = curTemp;
        this.fengli = fengli;
        this.type = type;
        this.hightemp = hightemp;
        this.lowtemp = lowtemp;
        this.gmIndex = indexs[0];
        this.fsIndex = indexs[1];
        this.ctIndex = indexs[2];
        this.ydIndex = indexs[3];
        this.xcIndex = indexs[4];
        this.lsIndex = indexs[5];
    }

    public String getCityName() {
        return cityName;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public String getCurTemp() {
        return curTemp;
    }

    public String getFengli() {
        return fengli;
    }

    public String getType() {
        return type;
    }

    public String getHightemp() {
        return hightemp;
    }

    public String getLowtemp() {
        return lowtemp;
    }

    public String getGmIndex() {
        return gmIndex;
    }

    public String getFsIndex() {
        return fsIndex;
    }

    public String getCtIndex() {
        return ctIndex;
    }

    public String getYdIndex() {
        return ydIndex;
    }

    public String getXcIndex() {
        return xcIndex;
    }

    public String getLsIndex() {
        return lsIndex;
    }
}
