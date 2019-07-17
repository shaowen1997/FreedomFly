package entity;

import java.util.Date;

public class FlightInfo {
    private int id;//ID
    private String airNum;//航班编号
    private String airline;//航空公司
    private String airSpace;//舱位类型
    private String airType;//航班类型
    private String fromCity;//起飞城市
    private Date fromTime;//起飞时间
    private String landCity;//降落城市
    private Date landTime;//降落时间
    private double price;//金额
    private int type;//往返类型（1：单程，2：往返，3：多程）
    private int specialPassengers;//特殊乘客（1：有，2：无）
    private int airFood;//航空餐
    private int state;//状态
    private Date createTime;//创建时间
    private Date updateTime;//最后一次修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirNum() {
        return airNum;
    }

    public void setAirNum(String airNum) {
        this.airNum = airNum;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirSpace() {
        return airSpace;
    }

    public void setAirSpace(String airSpace) {
        this.airSpace = airSpace;
    }

    public String getAirType() {
        return airType;
    }

    public void setAirType(String airType) {
        this.airType = airType;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
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
        this.landCity = landCity;
    }

    public Date getLandTime() {
        return landTime;
    }

    public void setLandTime(Date landTime) {
        this.landTime = landTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSpecialPassengers() {
        return specialPassengers;
    }

    public void setSpecialPassengers(int specialPassengers) {
        this.specialPassengers = specialPassengers;
    }

    public int getAirFood() {
        return airFood;
    }

    public void setAirFood(int airFood) {
        this.airFood = airFood;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
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

    @Override
    public String toString() {
        return "FlightInfo{" +
                "id=" + id +
                ", airNum='" + airNum + '\'' +
                ", airline='" + airline + '\'' +
                ", airSpace='" + airSpace + '\'' +
                ", airType='" + airType + '\'' +
                ", fromCity='" + fromCity + '\'' +
                ", fromTime=" + fromTime +
                ", landCity='" + landCity + '\'' +
                ", landTime=" + landTime +
                ", price=" + price +
                ", type=" + type +
                ", specialPassengers=" + specialPassengers +
                ", airFood=" + airFood +
                ", state=" + state +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
