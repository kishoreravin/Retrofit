package com.example.kaitest2.Model;

import com.google.gson.annotations.SerializedName;

public class WinterSaleResponse {
    @SerializedName("updatedOn")
    private Integer updatedOn;
    @SerializedName("serviceStatus")
    private ServiceStatus serviceStatus;
    @SerializedName("result")
    private Result result;

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setUpdatedOn(Integer updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getUpdatedOn() {
        return updatedOn;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
