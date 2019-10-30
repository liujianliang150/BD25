package cn.edu.pojo;

import java.util.Date;

public class EduCourseNote {
    private Integer id;

    private Integer userid;

    @Override
    public String toString() {
        return "EduCourseNote{" +
                "id=" + id +
                ", userid=" + userid +
                ", courseid=" + courseid +
                ", kpointid=" + kpointid +
                ", updatetime=" + updatetime +
                ", status=" + status +
                ", content='" + content + '\'' +
                '}';
    }

    private Integer courseid;

    private Integer kpointid;

    private String updatetime;

    private Byte status;

    private String content;

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

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getKpointid() {
        return kpointid;
    }

    public void setKpointid(Integer kpointid) {
        this.kpointid = kpointid;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}