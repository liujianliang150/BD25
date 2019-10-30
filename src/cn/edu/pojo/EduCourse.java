package cn.edu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class EduCourse {
    private Integer courseid;

    private String coursename;

    private Integer isavaliable;

    private Integer subjectid;

    @Override
    public String toString() {
        return "EduCourse{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", isavaliable=" + isavaliable +
                ", subjectid=" + subjectid +
                ", subjectlink='" + subjectlink + '\'' +
                ", addtime=" + addtime +
                ", sourceprice=" + sourceprice +
                ", currentprice=" + currentprice +
                ", title='" + title + '\'' +
                ", lessionnum=" + lessionnum +
                ", logo='" + logo + '\'' +
                ", updatetime=" + updatetime +
                ", pagebuycount=" + pagebuycount +
                ", pageviewcount=" + pageviewcount +
                ", endtime=" + endtime +
                ", losetype=" + losetype +
                ", loseTime='" + loseTime + '\'' +
                ", sequence=" + sequence +
                ", courseGrossIncome=" + courseGrossIncome +
                ", context='" + context + '\'' +
                '}';
    }

    private String subjectlink;

    private Date addtime;

    private BigDecimal sourceprice;

    private BigDecimal currentprice;

    private String title;

    private Integer lessionnum;

    private String logo;

    private Date updatetime;

    private Integer pagebuycount;

    private Integer pageviewcount;

    private Date endtime;

    private Integer losetype;

    private String loseTime;

    private Integer sequence;

    private BigDecimal courseGrossIncome;

    private String context;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Integer getIsavaliable() {
        return isavaliable;
    }

    public void setIsavaliable(Integer isavaliable) {
        this.isavaliable = isavaliable;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectlink() {
        return subjectlink;
    }

    public void setSubjectlink(String subjectlink) {
        this.subjectlink = subjectlink == null ? null : subjectlink.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public BigDecimal getSourceprice() {
        return sourceprice;
    }

    public void setSourceprice(BigDecimal sourceprice) {
        this.sourceprice = sourceprice;
    }

    public BigDecimal getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(BigDecimal currentprice) {
        this.currentprice = currentprice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLessionnum() {
        return lessionnum;
    }

    public void setLessionnum(Integer lessionnum) {
        this.lessionnum = lessionnum;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getPagebuycount() {
        return pagebuycount;
    }

    public void setPagebuycount(Integer pagebuycount) {
        this.pagebuycount = pagebuycount;
    }

    public Integer getPageviewcount() {
        return pageviewcount;
    }

    public void setPageviewcount(Integer pageviewcount) {
        this.pageviewcount = pageviewcount;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getLosetype() {
        return losetype;
    }

    public void setLosetype(Integer losetype) {
        this.losetype = losetype;
    }

    public String getLoseTime() {
        return loseTime;
    }

    public void setLoseTime(String loseTime) {
        this.loseTime = loseTime == null ? null : loseTime.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public BigDecimal getCourseGrossIncome() {
        return courseGrossIncome;
    }

    public void setCourseGrossIncome(BigDecimal courseGrossIncome) {
        this.courseGrossIncome = courseGrossIncome;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}