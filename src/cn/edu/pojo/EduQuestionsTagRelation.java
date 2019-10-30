package cn.edu.pojo;

public class EduQuestionsTagRelation {
    private Integer id;

    private Integer questionid;

    private Integer questiontagid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getQuestiontagid() {
        return questiontagid;
    }

    public void setQuestiontagid(Integer questiontagid) {
        this.questiontagid = questiontagid;
    }

    @Override
    public String toString() {
        return "EduQuestionsTagRelation{" +
                "id=" + id +
                ", questionid=" + questionid +
                ", questiontagid=" + questiontagid +
                '}';
    }
}