package cn.edu.pojo;

import java.util.Date;

public class SysUser {
    private Integer userid;

    private String loginname;

    private String loginpwd;

    private String username;

    private Boolean status;

    private String lastlogintime;

    private String lastloginip;

    private String creattime;

    private String email;

    private String tel;

    private Integer roleid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userid=" + userid +
                ", loginname='" + loginname + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", username='" + username + '\'' +
                ", status=" + status +
                ", lastlogintime=" + lastlogintime +
                ", lastloginip='" + lastloginip + '\'' +
                ", creattime=" + creattime +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", roleid=" + roleid +
                '}';
    }
}