package com.hn.dls.entity;

import java.math.BigDecimal;

public class OrderGoodscf {
    private Integer id;

    private Integer fkOrderId;

    private String goodsTitle;

    private String imgUrl;

    private String specText;

    private BigDecimal goodsPrice;

    private BigDecimal realPrice;

    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkOrderId() {
        return fkOrderId;
    }

    public void setFkOrderId(Integer fkOrderId) {
        this.fkOrderId = fkOrderId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getSpecText() {
        return specText;
    }

    public void setSpecText(String specText) {
        this.specText = specText == null ? null : specText.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}