package cn.edu.pojo;

import java.util.Date;

public class EduUserLoginLog {
    private Integer logid;

    private String logintime;

    private String ip;

    private Integer userid;

    private String osname;

    private String useragent;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOsname() {
        return osname;
    }

    public void setOsname(String osname) {
        this.osname = osname == null ? null : osname.trim();
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    @Override
    public String toString() {
        return "EduUserLoginLog{" +
                "logid=" + logid +
                ", logintime=" + logintime +
                ", ip='" + ip + '\'' +
                ", userid=" + userid +
                ", osname='" + osname + '\'' +
                ", useragent='" + useragent + '\'' +
                '}';
    }
}