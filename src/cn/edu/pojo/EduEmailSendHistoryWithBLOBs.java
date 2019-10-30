package cn.edu.pojo;

public class EduEmailSendHistoryWithBLOBs extends EduEmailSendHistory {
    private String email;

    private String content;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "EduEmailSendHistoryWithBLOBs{" +
                "email='" + email + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}