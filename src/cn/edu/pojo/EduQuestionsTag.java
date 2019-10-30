package cn.edu.pojo;

import java.util.Date;

public class EduQuestionsTag {
    private Integer questionstagid;

    private String quesetiontagname;

    private Integer status;

    private String createtime;

    private String parentid;

    public Integer getQuestionstagid() {
        return questionstagid;
    }

    public void setQuestionstagid(Integer questionstagid) {
        this.questionstagid = questionstagid;
    }

    public String getQuesetiontagname() {
        return quesetiontagname;
    }

    public void setQuesetiontagname(String quesetiontagname) {
        this.quesetiontagname = quesetiontagname == null ? null : quesetiontagname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    @Override
    public String toString() {
        return "EduQuestionsTag{" +
                "questionstagid=" + questionstagid +
                ", quesetiontagname='" + quesetiontagname + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                ", parentid='" + parentid + '\'' +
                '}';
    }
}