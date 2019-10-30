package cn.edu.pojo;

import java.util.Date;

public class EduMsgSystem {
    private Integer id;

    private String addtime;

    private String updatetime;

    private Byte status;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "EduMsgSystem{" +
                "id=" + id +
                ", addtime=" + addtime +
                ", updatetime=" + updatetime +
                ", status=" + status +
                ", content='" + content + '\'' +
                '}';
    }
}