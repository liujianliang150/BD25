package cn.edu.pojo;

public class EduCourseTeacher {
    private Integer courseid;

    private Integer teacherid;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    @Override
    public String toString() {
        return "EduCourseTeacher{" +
                "courseid=" + courseid +
                ", teacherid=" + teacherid +
                '}';
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }
}