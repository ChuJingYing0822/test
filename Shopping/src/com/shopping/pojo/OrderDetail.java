package com.shopping.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class OrderDetail extends OrderDetailKey implements Serializable {
    private Integer quality;

    private static final long serialVersionUID = 1L;

    public OrderDetail() {

    }

    public OrderDetail(Integer orderId, String goodsId) {
        super(orderId, goodsId);
    }

    public OrderDetail(Integer orderId, String goodsId, Integer quality) {
        super(orderId, goodsId);
        this.quality = quality;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
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
        OrderDetail other = (OrderDetail) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quality=").append(quality);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}