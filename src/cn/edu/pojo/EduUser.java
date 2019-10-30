package cn.edu.pojo;

import java.util.Date;

public class EduUser {
    private Integer userid;

    private String mobile;

    private String email;

    private String password;

    private String username;

    private String showname;

    private Boolean sex;

    private Byte age;

    private String createtime;

    private Boolean isavalible;

    private String picimg;

    private String bannerurl;

    private Integer msgnum;

    private Integer sysmsgnum;

    private String lastsystemtime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsavalible() {
        return isavalible;
    }

    public void setIsavalible(Boolean isavalible) {
        this.isavalible = isavalible;
    }

    public String getPicimg() {
        return picimg;
    }

    public void setPicimg(String picimg) {
        this.picimg = picimg == null ? null : picimg.trim();
    }

    public String getBannerurl() {
        return bannerurl;
    }

    public void setBannerurl(String bannerurl) {
        this.bannerurl = bannerurl == null ? null : bannerurl.trim();
    }

    public Integer getMsgnum() {
        return msgnum;
    }

    public void setMsgnum(Integer msgnum) {
        this.msgnum = msgnum;
    }

    public Integer getSysmsgnum() {
        return sysmsgnum;
    }

    public void setSysmsgnum(Integer sysmsgnum) {
        this.sysmsgnum = sysmsgnum;
    }

    public String getLastsystemtime() {
        return lastsystemtime;
    }

    public void setLastsystemtime(String lastsystemtime) {
        this.lastsystemtime = lastsystemtime;
    }

    @Override
    public String toString() {
        return "EduUser{" +
                "userid=" + userid +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", showname='" + showname + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", createtime=" + createtime +
                ", isavalible=" + isavalible +
                ", picimg='" + picimg + '\'' +
                ", bannerurl='" + bannerurl + '\'' +
                ", msgnum=" + msgnum +
                ", sysmsgnum=" + sysmsgnum +
                ", lastsystemtime=" + lastsystemtime +
                '}';
    }
}