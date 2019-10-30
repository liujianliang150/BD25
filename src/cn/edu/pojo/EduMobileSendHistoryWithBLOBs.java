package cn.edu.pojo;

public class EduMobileSendHistoryWithBLOBs extends EduMobileSendHistory {
    private String mobile;

    private String content;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "EduMobileSendHistoryWithBLOBs{" +
                "mobile='" + mobile + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}