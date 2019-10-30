package cn.edu.pojo;

import java.util.Date;

public class EduCourseFavorites {
    private Integer id;

    private Integer courseid;

    private Integer userid;

    @Override
    public String toString() {
        return "EduCourseFavorites{" +
                "id=" + id +
                ", courseid=" + courseid +
                ", userid=" + userid +
                ", addtime=" + addtime +
                '}';
    }

    private String addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }
}