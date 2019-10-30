package cn.edu.pojo;

import java.util.Date;

public class EduQuestionsComment {
    private Integer id;

    private Integer cusid;

    private Integer questionid;

    private String content;

    private Integer isbest;

    private Integer replycount;

    private Integer praisecount;

    private String addtime;

    private Integer commentid;

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

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsbest() {
        return isbest;
    }

    public void setIsbest(Integer isbest) {
        this.isbest = isbest;
    }

    public Integer getReplycount() {
        return replycount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
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

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    @Override
    public String toString() {
        return "EduQuestionsComment{" +
                "id=" + id +
                ", cusid=" + cusid +
                ", questionid=" + questionid +
                ", content='" + content + '\'' +
                ", isbest=" + isbest +
                ", replycount=" + replycount +
                ", praisecount=" + praisecount +
                ", addtime=" + addtime +
                ", commentid=" + commentid +
                '}';
    }
}