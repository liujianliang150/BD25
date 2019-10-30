package cn.edu.pojo;

import java.util.Date;

public class EduTeacher {
    private Integer id;

    private String name;

    private String education;

    private Boolean isstar;

    private String picpath;

    private Byte status;

    private String createtime;

    private String updatetime;

    private Integer subjectid;

    private Integer sort;

    private String career;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Boolean getIsstar() {
        return isstar;
    }

    public void setIsstar(Boolean isstar) {
        this.isstar = isstar;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    @Override
    public String toString() {
        return "EduTeacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", isstar=" + isstar +
                ", picpath='" + picpath + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", subjectid=" + subjectid +
                ", sort=" + sort +
                ", career='" + career + '\'' +
                '}';
    }
}