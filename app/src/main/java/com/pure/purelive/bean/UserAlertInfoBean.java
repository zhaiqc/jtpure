package com.pure.purelive.bean;

import com.google.gson.annotations.SerializedName;

/**
 * 弹窗用户基本信息
 */
public class UserAlertInfoBean {
    @SerializedName("attention")
    private String attention;
    @SerializedName("fans")
    private String fans;
    @SerializedName("consumption")
    private String consumption;
    @SerializedName("votestotal")
    private String votestotal;
    @SerializedName("isblackto")
    private int isblackto;
    @SerializedName("level")
    private int level;
    @SerializedName("city")
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getIsblackto() {
        return isblackto;
    }

    public void setIsblackto(int isblackto) {
        this.isblackto = isblackto;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getVotestotal() {
        return votestotal;
    }

    public void setVotestotal(String votestotal) {
        this.votestotal = votestotal;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }


    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
    }
}
