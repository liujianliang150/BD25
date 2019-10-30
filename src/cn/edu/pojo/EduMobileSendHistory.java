package cn.edu.pojo;

import java.util.Date;

public class EduMobileSendHistory {
    private Integer id;

    private Integer userid;

    private String createtime;

    private String sendtime;

    private Byte status;

    private Byte type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EduMobileSendHistory{" +
                "id=" + id +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", sendtime=" + sendtime +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}