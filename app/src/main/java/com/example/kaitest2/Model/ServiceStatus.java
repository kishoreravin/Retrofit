package com.example.kaitest2.Model;

import com.google.gson.annotations.SerializedName;

public class ServiceStatus {
    @SerializedName("status")
    private String status;
    @SerializedName("statusCode")
    private Integer statusCode;
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
