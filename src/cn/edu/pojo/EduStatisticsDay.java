package cn.edu.pojo;

import java.util.Date;

public class EduStatisticsDay {
    private Integer id;

    private String statisticstime;

    private Integer loginnum;

    private String createtime;

    private Integer registerednum;

    private Integer videoviewingnum;

    private Integer dailyusernumber;

    private Integer dailycoursenumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatisticstime() {
        return statisticstime;
    }

    public void setStatisticstime(String statisticstime) {
        this.statisticstime = statisticstime;
    }

    public Integer getLoginnum() {
        return loginnum;
    }

    public void setLoginnum(Integer loginnum) {
        this.loginnum = loginnum;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getRegisterednum() {
        return registerednum;
    }

    public void setRegisterednum(Integer registerednum) {
        this.registerednum = registerednum;
    }

    public Integer getVideoviewingnum() {
        return videoviewingnum;
    }

    public void setVideoviewingnum(Integer videoviewingnum) {
        this.videoviewingnum = videoviewingnum;
    }

    public Integer getDailyusernumber() {
        return dailyusernumber;
    }

    public void setDailyusernumber(Integer dailyusernumber) {
        this.dailyusernumber = dailyusernumber;
    }

    public Integer getDailycoursenumber() {
        return dailycoursenumber;
    }

    @Override
    public String toString() {
        return "EduStatisticsDay{" +
                "id=" + id +
                ", statisticstime=" + statisticstime +
                ", loginnum=" + loginnum +
                ", createtime=" + createtime +
                ", registerednum=" + registerednum +
                ", videoviewingnum=" + videoviewingnum +
                ", dailyusernumber=" + dailyusernumber +
                ", dailycoursenumber=" + dailycoursenumber +
                '}';
    }
}