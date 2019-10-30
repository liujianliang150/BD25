package cn.edu.pojo;

import java.util.Date;

public class EduStatisticsComputer {
    private Integer id;

    private String statisticstime;

    private String cpuusage;

    private String memoryusage;

    private String netusage;

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

    public String getCpuusage() {
        return cpuusage;
    }

    public void setCpuusage(String cpuusage) {
        this.cpuusage = cpuusage == null ? null : cpuusage.trim();
    }

    public String getMemoryusage() {
        return memoryusage;
    }

    public void setMemoryusage(String memoryusage) {
        this.memoryusage = memoryusage == null ? null : memoryusage.trim();
    }

    public String getNetusage() {
        return netusage;
    }

    public void setNetusage(String netusage) {
        this.netusage = netusage == null ? null : netusage.trim();
    }

    @Override
    public String toString() {
        return "EduStatisticsComputer{" +
                "id=" + id +
                ", statisticstime=" + statisticstime +
                ", cpuusage='" + cpuusage + '\'' +
                ", memoryusage='" + memoryusage + '\'' +
                ", netusage='" + netusage + '\'' +
                '}';
    }
}