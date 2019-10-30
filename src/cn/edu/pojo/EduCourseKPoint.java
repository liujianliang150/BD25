package cn.edu.pojo;

import java.util.Date;

public class EduCourseKPoint {
    private Integer kpointid;

    private Integer courseid;

    private String name;

    private Integer parentid;

    @Override
    public String toString() {
        return "EduCourseKPoint{" +
                "kpointid=" + kpointid +
                ", courseid=" + courseid +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                ", addtime=" + addtime +
                ", sort=" + sort +
                ", playcount=" + playcount +
                ", isfree=" + isfree +
                ", videourl='" + videourl + '\'' +
                ", teachearid=" + teachearid +
                ", playtime='" + playtime + '\'' +
                ", kpointtype=" + kpointtype +
                ", videotype='" + videotype + '\'' +
                ", filetype='" + filetype + '\'' +
                ", countent='" + countent + '\'' +
                '}';
    }

    private String addtime;

    private Integer sort;

    private Integer playcount;

    private Boolean isfree;

    private String videourl;

    private Integer teachearid;

    private String playtime;

    private Integer kpointtype;

    private String videotype;

    private String filetype;

    private String countent;

    public Integer getKpointid() {
        return kpointid;
    }

    public void setKpointid(Integer kpointid) {
        this.kpointid = kpointid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public Boolean getIsfree() {
        return isfree;
    }

    public void setIsfree(Boolean isfree) {
        this.isfree = isfree;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public Integer getTeachearid() {
        return teachearid;
    }

    public void setTeachearid(Integer teachearid) {
        this.teachearid = teachearid;
    }

    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime == null ? null : playtime.trim();
    }

    public Integer getKpointtype() {
        return kpointtype;
    }

    public void setKpointtype(Integer kpointtype) {
        this.kpointtype = kpointtype;
    }

    public String getVideotype() {
        return videotype;
    }

    public void setVideotype(String videotype) {
        this.videotype = videotype == null ? null : videotype.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getCountent() {
        return countent;
    }

    public void setCountent(String countent) {
        this.countent = countent == null ? null : countent.trim();
    }
}