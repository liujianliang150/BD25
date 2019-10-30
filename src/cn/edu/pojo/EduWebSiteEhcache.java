package cn.edu.pojo;

public class EduWebSiteEhcache {
    private Integer id;

    private String ehcachekey;

    private String ehcachedesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEhcachekey() {
        return ehcachekey;
    }

    public void setEhcachekey(String ehcachekey) {
        this.ehcachekey = ehcachekey == null ? null : ehcachekey.trim();
    }

    public String getEhcachedesc() {
        return ehcachedesc;
    }

    public void setEhcachedesc(String ehcachedesc) {
        this.ehcachedesc = ehcachedesc == null ? null : ehcachedesc.trim();
    }

    @Override
    public String toString() {
        return "EduWebSiteEhcache{" +
                "id=" + id +
                ", ehcachekey='" + ehcachekey + '\'' +
                ", ehcachedesc='" + ehcachedesc + '\'' +
                '}';
    }
}