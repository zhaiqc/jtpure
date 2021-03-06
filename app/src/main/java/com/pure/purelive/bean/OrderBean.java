package com.pure.purelive.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/4/5.
 */
public class OrderBean {
    @SerializedName("total")
    private String total;
    @SerializedName("uid")
    private String uid;
    @SerializedName("user_nicename")
    private String user_nicename;
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("sex")
    private String sex;
    @SerializedName("level")
    private String level;
    @SerializedName("orderNo")
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUser_nicename() {
        return user_nicename;
    }

    public void setUser_nicename(String user_nicename) {
        this.user_nicename = user_nicename;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
