package com.freedomfly.entity;

import java.util.Date;

public class AirInfo {
    private Integer airId;

    private String airNum;

    private String airline;

    private String airType;

    private String airSpace;

    private String fromCity;

    private Date fromTime;

    private String landCity;

    private String landTime;

    private Double price;

    private Integer type;

    private Integer specialpassengers;

    private Integer airFood;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    public Integer getAirId() {
        return airId;
    }

    public void setAirId(Integer airId) {
        this.airId = airId;
    }

    public String getAirNum() {
        return airNum;
    }

    public void setAirNum(String airNum) {
        this.airNum = airNum == null ? null : airNum.trim();
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline == null ? null : airline.trim();
    }

    public String getAirType() {
        return airType;
    }

    public void setAirType(String airType) {
        this.airType = airType == null ? null : airType.trim();
    }

    public String getAirSpace() {
        return airSpace;
    }

    public void setAirSpace(String airSpace) {
        this.airSpace = airSpace == null ? null : airSpace.trim();
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity == null ? null : fromCity.trim();
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public String getLandCity() {
        return landCity;
    }

    public void setLandCity(String landCity) {
        this.landCity = landCity == null ? null : landCity.trim();
    }

    public String getLandTime() {
        return landTime;
    }

    public void setLandTime(String landTime) {
        this.landTime = landTime == null ? null : landTime.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSpecialpassengers() {
        return specialpassengers;
    }

    public void setSpecialpassengers(Integer specialpassengers) {
        this.specialpassengers = specialpassengers;
    }

    public Integer getAirFood() {
        return airFood;
    }

    public void setAirFood(Integer airFood) {
        this.airFood = airFood;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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