package cn.edu.pojo;

import java.util.Date;

public class Syssubject {
    private Integer subjectid;

    private String subjectname;

    private Boolean status;

    private String createtime;

    private Integer parentid;

    private Integer sort;

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname == null ? null : subjectname.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Syssubject{" +
                "subjectid=" + subjectid +
                ", subjectname='" + subjectname + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                ", parentid=" + parentid +
                ", sort=" + sort +
                '}';
    }
}