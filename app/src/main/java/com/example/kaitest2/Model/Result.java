package com.example.kaitest2.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("header")
    private String header;
    @SerializedName("subHeader")
    private String subHeader;
    @SerializedName("description")
    private String description;
    @SerializedName("bgImageName")
    private String bgImageName;
    @SerializedName("catImgVersion")
    private String catImgVersion;
    @SerializedName("categoryFlag")
    private boolean categoryFlag;
    @SerializedName("list")
    private List<WinterSaleBanner> winterSaleBannerListSale;

    public List<WinterSaleBanner> getWinterSaleBannerListSale() {
        return winterSaleBannerListSale;
    }

    public boolean isCategoryFlag() {
        return categoryFlag;
    }

    public String getBgImageName() {
        return bgImageName;
    }

    public String getCatImgVersion() {
        return catImgVersion;
    }

    public String getDescription() {
        return description;
    }

    public String getHeader() {
        return header;
    }

    public String getSubHeader() {
        return subHeader;
    }

    public void setBgImageName(String bgImageName) {
        this.bgImageName = bgImageName;
    }

    public void setCategoryFlag(boolean categoryFlag) {
        this.categoryFlag = categoryFlag;
    }

    public void setCatImgVersion(String catImgVersion) {
        this.catImgVersion = catImgVersion;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    public void setWinterSaleBannerListSale(List<WinterSaleBanner> winterSaleBannerListSale) {
        this.winterSaleBannerListSale = winterSaleBannerListSale;
    }

}
