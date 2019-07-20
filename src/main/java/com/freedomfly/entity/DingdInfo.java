package com.freedomfly.entity;

import java.util.Date;

public class DingdInfo {
    private Integer dingdId;

    private String dNum;

    private String state;

    private Double price;

    private Integer consign;

    private String priceType;

    private String evaluate;

    private Date createTime;

    private Date updateTime;

    public Integer getDingdId() {
        return dingdId;
    }

    public void setDingdId(Integer dingdId) {
        this.dingdId = dingdId;
    }

    public String getdNum() {
        return dNum;
    }

    public void setdNum(String dNum) {
        this.dNum = dNum == null ? null : dNum.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getConsign() {
        return consign;
    }

    public void setConsign(Integer consign) {
        this.consign = consign;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType == null ? null : priceType.trim();
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}