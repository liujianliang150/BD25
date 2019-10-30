package cn.edu.pojo;

import java.io.Serializable;
import java.util.Date;

public class EduComment implements Serializable {
    private Integer commentid;

    private Integer userid;

    private Integer pcommentid;

    private String content;

    private String addtime;

    @Override
    public String toString() {
        return "EduComment{" +
                "commentid=" + commentid +
                ", userid=" + userid +
                ", pcommentid=" + pcommentid +
                ", content='" + content + '\'' +
                ", addtime=" + addtime +
                ", otherid=" + otherid +
                ", praisecount=" + praisecount +
                ", repleycount=" + repleycount +
                ", courseid=" + courseid +
                ", articleid=" + articleid +
                '}';
    }

    private Integer otherid;

    private Integer praisecount;

    private Integer repleycount;

    private Integer courseid;

    private Integer articleid;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPcommentid() {
        return pcommentid;
    }

    public void setPcommentid(Integer pcommentid) {
        this.pcommentid = pcommentid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Integer getOtherid() {
        return otherid;
    }

    public void setOtherid(Integer otherid) {
        this.otherid = otherid;
    }

    public Integer getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(Integer praisecount) {
        this.praisecount = praisecount;
    }

    public Integer getRepleycount() {
        return repleycount;
    }

    public void setRepleycount(Integer repleycount) {
        this.repleycount = repleycount;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }
}