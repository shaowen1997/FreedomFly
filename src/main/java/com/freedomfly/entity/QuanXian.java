package com.freedomfly.entity;

public class QuanXian {
    private Integer qxId;

    private String qxName;

    private String qxRemarks;

    public Integer getQxId() {
        return qxId;
    }

    public void setQxId(Integer qxId) {
        this.qxId = qxId;
    }

    public String getQxName() {
        return qxName;
    }

    public void setQxName(String qxName) {
        this.qxName = qxName == null ? null : qxName.trim();
    }

    public String getQxRemarks() {
        return qxRemarks;
    }

    public void setQxRemarks(String qxRemarks) {
        this.qxRemarks = qxRemarks == null ? null : qxRemarks.trim();
    }
}