package cn.edu.pojo;

import java.util.Date;

public class SysFunction {
    private Integer functionid;

    private Integer parentid;

    private String functionname;

    private String functionurl;

    private Boolean functiontype;

    private String createtime;

    private Integer sort;

    private String imageurl;

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    public String getFunctionurl() {
        return functionurl;
    }

    public void setFunctionurl(String functionurl) {
        this.functionurl = functionurl == null ? null : functionurl.trim();
    }

    public Boolean getFunctiontype() {
        return functiontype;
    }

    public void setFunctiontype(Boolean functiontype) {
        this.functiontype = functiontype;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    @Override
    public String toString() {
        return "SysFunction{" +
                "functionid=" + functionid +
                ", parentid=" + parentid +
                ", functionname='" + functionname + '\'' +
                ", functionurl='" + functionurl + '\'' +
                ", functiontype=" + functiontype +
                ", createtime=" + createtime +
                ", sort=" + sort +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }
}