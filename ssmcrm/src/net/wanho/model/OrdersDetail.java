package net.wanho.model;

public class OrdersDetail {
    private Integer detailId;

    private Integer orderId;

    private Integer storeId;

    private Integer productId;

    private Integer buyNums;

    private Long realPrices;

    private Long realTotalprice;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBuyNums() {
        return buyNums;
    }

    public void setBuyNums(Integer buyNums) {
        this.buyNums = buyNums;
    }

    public Long getRealPrices() {
        return realPrices;
    }

    public void setRealPrices(Long realPrices) {
        this.realPrices = realPrices;
    }

    public Long getRealTotalprice() {
        return realTotalprice;
    }

    public void setRealTotalprice(Long realTotalprice) {
        this.realTotalprice = realTotalprice;
    }
}