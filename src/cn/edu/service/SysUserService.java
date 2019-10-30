package cn.edu.service;

import cn.edu.pojo.SysUser;

/**
 * @Classname SysUserService
 * @Auther: 周小龙
 * @Description TODO
 * @Date 2019/10/28 10:44
 * @Created by Administrator
 */
public interface SysUserService {
    /**
     *
     * @param loginName 传入登录名
     * @return 得到一个管理员对象
     */
    boolean selectByUserName(String loginName);

    /**
     *
     * @param loginName 登录名
     * @param password  登录密码
     * @return  返回一个布尔值，登录名和密码都对得上就返回true，否则返回false
     */
    boolean canOrNotLogin(String loginName, String password);


}
