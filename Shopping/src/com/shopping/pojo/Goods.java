package com.shopping.pojo;

import java.io.Serializable;

/**
 * goods
 * @author 
 */
public class Goods implements Serializable {
    private String goodsId;

    private String goodsName;

    private String goodsDesc;

    private Double goodsPrice;

    private Integer goodsSaleCount;

    private String goodsImgPath;

    private Integer goodsClicks;

    private Integer goodsInventory;

    private String goodsStatus;

    private String categoryId;

    private static final long serialVersionUID = 1L;

    public Goods(){

    }



    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsSaleCount() {
        return goodsSaleCount;
    }

    public void setGoodsSaleCount(Integer goodsSaleCount) {
        this.goodsSaleCount = goodsSaleCount;
    }

    public String getGoodsImgPath() {
        return goodsImgPath;
    }

    public void setGoodsImgPath(String goodsImgPath) {
        this.goodsImgPath = goodsImgPath;
    }

    public Integer getGoodsClicks() {
        return goodsClicks;
    }

    public void setGoodsClicks(Integer goodsClicks) {
        this.goodsClicks = goodsClicks;
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    public Goods(String goodsId, String goodsName, String goodsDesc, Double goodsPrice, Integer goodsSaleCount, String goodsImgPath, Integer goodsClicks, Integer goodsInventory, String goodsStatus, String categoryId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsDesc = goodsDesc;
        this.goodsPrice = goodsPrice;
        this.goodsSaleCount = goodsSaleCount;
        this.goodsImgPath = goodsImgPath;
        this.goodsClicks = goodsClicks;
        this.goodsInventory = goodsInventory;
        this.goodsStatus = goodsStatus;
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Goods other = (Goods) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsDesc() == null ? other.getGoodsDesc() == null : this.getGoodsDesc().equals(other.getGoodsDesc()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsSaleCount() == null ? other.getGoodsSaleCount() == null : this.getGoodsSaleCount().equals(other.getGoodsSaleCount()))
            && (this.getGoodsImgPath() == null ? other.getGoodsImgPath() == null : this.getGoodsImgPath().equals(other.getGoodsImgPath()))
            && (this.getGoodsClicks() == null ? other.getGoodsClicks() == null : this.getGoodsClicks().equals(other.getGoodsClicks()))
            && (this.getGoodsInventory() == null ? other.getGoodsInventory() == null : this.getGoodsInventory().equals(other.getGoodsInventory()))
            && (this.getGoodsStatus() == null ? other.getGoodsStatus() == null : this.getGoodsStatus().equals(other.getGoodsStatus()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsDesc() == null) ? 0 : getGoodsDesc().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsSaleCount() == null) ? 0 : getGoodsSaleCount().hashCode());
        result = prime * result + ((getGoodsImgPath() == null) ? 0 : getGoodsImgPath().hashCode());
        result = prime * result + ((getGoodsClicks() == null) ? 0 : getGoodsClicks().hashCode());
        result = prime * result + ((getGoodsInventory() == null) ? 0 : getGoodsInventory().hashCode());
        result = prime * result + ((getGoodsStatus() == null) ? 0 : getGoodsStatus().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsSaleCount=").append(goodsSaleCount);
        sb.append(", goodsImgPath=").append(goodsImgPath);
        sb.append(", goodsClicks=").append(goodsClicks);
        sb.append(", goodsInventory=").append(goodsInventory);
        sb.append(", goodsStatus=").append(goodsStatus);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}