package multi.javaoracle.dept;

import java.util.Date;

public class DeptVO {
    private int depNum;
    private int schNum;
    private String depName;
    private int depPhoneNumber;
    private Date depDate;

    // Getters and Setters
    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }

    public int getSchNum() {
        return schNum;
    }

    public void setSchNum(int schNum) {
        this.schNum = schNum;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepPhoneNumber() {
        return depPhoneNumber;
    }

    public void setDepPhoneNumber(int depPhoneNumber) {
        this.depPhoneNumber = depPhoneNumber;
    }

    public java.sql.Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }
}
