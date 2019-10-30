package cn.edu.pojo;

public class EduWebSiteCourseDetail {
    private Integer id;

    private Integer recommendid;

    private Integer courseid;

    private Integer ordernum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecommendid() {
        return recommendid;
    }

    public void setRecommendid(Integer recommendid) {
        this.recommendid = recommendid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    @Override
    public String toString() {
        return "EduWebSiteCourseDetail{" +
                "id=" + id +
                ", recommendid=" + recommendid +
                ", courseid=" + courseid +
                ", ordernum=" + ordernum +
                '}';
    }
}