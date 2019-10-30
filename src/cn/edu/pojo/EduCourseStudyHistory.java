package cn.edu.pojo;

import java.util.Date;

public class EduCourseStudyHistory {
    private Integer id;

    private Integer userid;

    @Override
    public String toString() {
        return "EduCourseStudyHistory{" +
                "id=" + id +
                ", userid=" + userid +
                ", courseid=" + courseid +
                ", kpointid=" + kpointid +
                ", playercount=" + playercount +
                ", coursename='" + coursename + '\'' +
                ", kpointname='" + kpointname + '\'' +
                ", updatetime=" + updatetime +
                ", databack='" + databack + '\'' +
                '}';
    }

    private Integer courseid;

    private Integer kpointid;

    private Integer playercount;

    private String coursename;

    private String kpointname;

    private String updatetime;

    private String databack;

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

    public Integer getPlayercount() {
        return playercount;
    }

    public void setPlayercount(Integer playercount) {
        this.playercount = playercount;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getKpointname() {
        return kpointname;
    }

    public void setKpointname(String kpointname) {
        this.kpointname = kpointname == null ? null : kpointname.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getDataback() {
        return databack;
    }

    public void setDataback(String databack) {
        this.databack = databack == null ? null : databack.trim();
    }
}