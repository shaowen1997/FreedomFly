package entity;

public class QuanXian {
    private int qxID;//id
    private String qxName;//权限名
    private String qxRremarks;//备注

    public int getQxID() {
        return qxID;
    }

    public void setQxID(int qxID) {
        this.qxID = qxID;
    }

    public String getQxName() {
        return qxName;
    }

    public void setQxName(String qxName) {
        this.qxName = qxName;
    }

    public String getQxRremarks() {
        return qxRremarks;
    }

    public void setQxRremarks(String qxRremarks) {
        this.qxRremarks = qxRremarks;
    }

    @Override
    public String toString() {
        return "QuanXian{" +
                "qxID=" + qxID +
                ", qxName='" + qxName + '\'' +
                ", qxRremarks='" + qxRremarks + '\'' +
                '}';
    }
}
