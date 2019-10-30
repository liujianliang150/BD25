package cn.edu.pojo;

public class EduWebSiteImages {
    private Integer imageid;

    private String imageurl;

    private String linkaddress;

    private String title;

    private Integer typeid;

    private Integer seriesnumber;

    private String previewurl;

    private String color;

    private String describe;

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getLinkaddress() {
        return linkaddress;
    }

    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress == null ? null : linkaddress.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getSeriesnumber() {
        return seriesnumber;
    }

    public void setSeriesnumber(Integer seriesnumber) {
        this.seriesnumber = seriesnumber;
    }

    public String getPreviewurl() {
        return previewurl;
    }

    public void setPreviewurl(String previewurl) {
        this.previewurl = previewurl == null ? null : previewurl.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    @Override
    public String toString() {
        return "EduWebSiteImages{" +
                "imageid=" + imageid +
                ", imageurl='" + imageurl + '\'' +
                ", linkaddress='" + linkaddress + '\'' +
                ", title='" + title + '\'' +
                ", typeid=" + typeid +
                ", seriesnumber=" + seriesnumber +
                ", previewurl='" + previewurl + '\'' +
                ", color='" + color + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}