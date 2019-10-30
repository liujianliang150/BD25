package cn.edu.pojo;

import java.util.Date;

public class Eduquestions {
    private Integer id;

    private Integer cusid;

    private String title;

    private Integer type;

    private Integer status;

    private Integer replycont;

    private Integer browsecount;

    private Integer praisecount;

    private String addtime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReplycont() {
        return replycont;
    }

    public void setReplycont(Integer replycont) {
        this.replycont = replycont;
    }

    public Integer getBrowsecount() {
        return browsecount;
    }

    public void setBrowsecount(Integer browsecount) {
        this.browsecount = browsecount;
    }

    public Integer getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(Integer praisecount) {
        this.praisecount = praisecount;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Eduquestions{" +
                "id=" + id +
                ", cusid=" + cusid +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", replycont=" + replycont +
                ", browsecount=" + browsecount +
                ", praisecount=" + praisecount +
                ", addtime=" + addtime +
                ", content='" + content + '\'' +
                '}';
    }
}