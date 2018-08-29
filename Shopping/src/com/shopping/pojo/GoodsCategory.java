package com.shopping.pojo;

import java.io.Serializable;

/**
 * goods_category
 * @author 
 */
public class GoodsCategory implements Serializable {
    private String categoryId;

    private String categoryName;

    private String categoryDesc;

    private String categoryStatus;

    private static final long serialVersionUID = 1L;

    public GoodsCategory(){

    }

    public GoodsCategory(String categoryId, String categoryName, String categoryDesc, String categoryStatus) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.categoryStatus = categoryStatus;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public String getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(String categoryStatus) {
        this.categoryStatus = categoryStatus;
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
        GoodsCategory other = (GoodsCategory) that;
        return (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryDesc() == null ? other.getCategoryDesc() == null : this.getCategoryDesc().equals(other.getCategoryDesc()))
            && (this.getCategoryStatus() == null ? other.getCategoryStatus() == null : this.getCategoryStatus().equals(other.getCategoryStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryDesc() == null) ? 0 : getCategoryDesc().hashCode());
        result = prime * result + ((getCategoryStatus() == null) ? 0 : getCategoryStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryDesc=").append(categoryDesc);
        sb.append(", categoryStatus=").append(categoryStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}