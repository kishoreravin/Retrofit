package com.example.kaitest2.Model;

import com.google.gson.annotations.SerializedName;

public class WinterSaleBanner {
    @SerializedName("categoryId")
    private String categoryId;
    @SerializedName("categoryName")
    private String categoryName;
    @SerializedName("categoryImage")
    private String categoryImage;
    @SerializedName("discount")
    private String discount;

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDiscount() {
        return discount;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
