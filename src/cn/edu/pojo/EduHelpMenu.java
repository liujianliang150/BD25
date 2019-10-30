package cn.edu.pojo;

import java.util.Date;

public class EduHelpMenu {
    private Integer id;

    private Integer parentid;

    private String name;

    private String createtime;

    private Integer sort;

    private String varchar;

    private String linkbuilding;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar == null ? null : varchar.trim();
    }

    public String getLinkbuilding() {
        return linkbuilding;
    }

    public void setLinkbuilding(String linkbuilding) {
        this.linkbuilding = linkbuilding == null ? null : linkbuilding.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "EduHelpMenu{" +
                "id=" + id +
                ", parentid=" + parentid +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", sort=" + sort +
                ", varchar='" + varchar + '\'' +
                ", linkbuilding='" + linkbuilding + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}