package cn.edu.pojo;

import java.util.Date;

public class History {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.id
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.userId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.courseId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    private Integer courseid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.kpointId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    private Integer kpointid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history.updateTime
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.id
     *
     * @return the value of history.id
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.id
     *
     * @param id the value for history.id
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.userId
     *
     * @return the value of history.userId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.userId
     *
     * @param userid the value for history.userId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.courseId
     *
     * @return the value of history.courseId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.courseId
     *
     * @param courseid the value for history.courseId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.kpointId
     *
     * @return the value of history.kpointId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public Integer getKpointid() {
        return kpointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.kpointId
     *
     * @param kpointid the value for history.kpointId
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public void setKpointid(Integer kpointid) {
        this.kpointid = kpointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history.updateTime
     *
     * @return the value of history.updateTime
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history.updateTime
     *
     * @param updatetime the value for history.updateTime
     *
     * @mbg.generated Mon Oct 28 13:37:55 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}