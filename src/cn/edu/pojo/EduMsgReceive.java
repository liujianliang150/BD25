package cn.edu.pojo;

import java.util.Date;

public class EduMsgReceive {
    private Integer id;

    private String addtime;

    private Integer cusid;

    private String updatetime;

    private Byte type;

    private Byte status;

    private Integer receivingcusid;

    private Integer groupid;

    private String showname;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getReceivingcusid() {
        return receivingcusid;
    }

    public void setReceivingcusid(Integer receivingcusid) {
        this.receivingcusid = receivingcusid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "EduMsgReceive{" +
                "id=" + id +
                ", addtime=" + addtime +
                ", cusid=" + cusid +
                ", updatetime=" + updatetime +
                ", type=" + type +
                ", status=" + status +
                ", receivingcusid=" + receivingcusid +
                ", groupid=" + groupid +
                ", showname='" + showname + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}