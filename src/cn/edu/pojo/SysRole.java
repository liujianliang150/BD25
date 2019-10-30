package cn.edu.pojo;

import java.util.Date;

public class SysRole {
    private Integer roleid;

    private String rolename;

    private String createtime;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}