package cn.edu.pojo;


import java.io.Serializable;

public class EduArticle implements Serializable {
    private Integer articleid;

    private String title;

    private String summary;

    private String keyword;

    private String imageurl;

    private String source;

    private String author;

    private String createtime;

    @Override
    public String toString() {
        return "EduArticle{" +
                "articleid=" + articleid +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", keyword='" + keyword + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", source='" + source + '\'' +
                ", author='" + author + '\'' +
                ", createtime=" + createtime +
                ", publishtime=" + publishtime +
                ", link='" + link + '\'' +
                ", articletype=" + articletype +
                ", clicknum=" + clicknum +
                ", praisecount=" + praisecount +
                ", commentnum=" + commentnum +
                ", sort=" + sort +
                ", favoritnum=" + favoritnum +
                '}';
    }

    private String publishtime;

    private String link;

    private Byte articletype;

    private Integer clicknum;

    private Integer praisecount;

    private Integer commentnum;

    private Integer sort;

    private Integer favoritnum;

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Byte getArticletype() {
        return articletype;
    }

    public void setArticletype(Byte articletype) {
        this.articletype = articletype;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Integer getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(Integer praisecount) {
        this.praisecount = praisecount;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFavoritnum() {
        return favoritnum;
    }

    public void setFavoritnum(Integer favoritnum) {
        this.favoritnum = favoritnum;
    }
}