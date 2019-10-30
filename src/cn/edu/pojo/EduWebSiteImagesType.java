package cn.edu.pojo;

public class EduWebSiteImagesType {
    private Integer typeid;

    private String typename;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    @Override
    public String toString() {
        return "EduWebSiteImagesType{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }
}