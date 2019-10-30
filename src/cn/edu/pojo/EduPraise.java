package cn.edu.pojo;

import java.util.Date;

public class EduPraise {
    private Integer id;

    private Integer userid;

    private Integer targetid;

    private Integer type;

    private String addtime;

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

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        return "EduPraise{" +
                "id=" + id +
                ", userid=" + userid +
                ", targetid=" + targetid +
                ", type=" + type +
                ", addtime=" + addtime +
                '}';
    }
}