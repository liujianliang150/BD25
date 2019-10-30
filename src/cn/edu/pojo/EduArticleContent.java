package cn.edu.pojo;

import java.io.Serializable;

public class EduArticleContent implements Serializable {
    private Integer articleid;

    private String content;

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "EduArticleContent{" +
                "articleid=" + articleid +
                ", content='" + content + '\'' +
                '}';
    }
}