package entity;

import java.util.Date;

public class DingdInfo {
    private int id;//id
    private String dNum;//订单编号
    private String state;//订单状态
    private double price;//价格
    private int consign;//是否托运
    private String priceType;//支付方式
    private String evaluate;//评价
    private Date createTime;//创建时间
    private Date updateTime;//最后一次修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdNum() {
        return dNum;
    }

    public void setdNum(String dNum) {
        this.dNum = dNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getConsign() {
        return consign;
    }

    public void setConsign(int consign) {
        this.consign = consign;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
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

    @Override
    public String toString() {
        return "DingdInfo{" +
                "id=" + id +
                ", dNum='" + dNum + '\'' +
                ", state='" + state + '\'' +
                ", price=" + price +
                ", consign=" + consign +
                ", priceType='" + priceType + '\'' +
                ", evaluate='" + evaluate + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
