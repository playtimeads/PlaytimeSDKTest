package com.playtime.sdk.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
@Keep
public class ResponseModel {
    @Expose
    private String message;
    @Expose
    private String status;
    @Expose
    private String points;
    @Expose
    private String uuid;
    @Expose
    private String earningPoint;

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public String getPoints() {
        return points;
    }

    public String getUuid() {
        return uuid;
    }

    public String getEarningPoint() {
        return earningPoint;
    }
}
