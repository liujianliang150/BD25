package cn.edu.pojo;

public class EduCourseSubject {
    private Integer id;

    private Integer courseid;

    private Integer subjectid;

    @Override
    public String toString() {
        return "EduCourseSubject{" +
                "id=" + id +
                ", courseid=" + courseid +
                ", subjectid=" + subjectid +
                '}';
    }

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

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }
}