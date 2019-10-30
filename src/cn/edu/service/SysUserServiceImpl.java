package cn.edu.service;

import cn.edu.dao.SysUserMapper;
import cn.edu.pojo.SysUser;
import cn.edu.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @Classname SysUserServiceImpl
 * @Auther: 周小龙
 * @Description TODO
 * @Date 2019/10/28 11:00
 * @Created by Administrator
 */
public class SysUserServiceImpl implements SysUserService {
    SysUser user = null;

    /**
     * @param loginName 传入登录名
     * @return 得到一个管理员对象
     */
    @Override
    public boolean selectByUserName(String loginName) {
        boolean flag = false;
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        SysUser sysUser = sqlSession.getMapper(SysUserMapper.class).selectByUserName(loginName);
        if (sysUser != null) {
            if (sysUser.getLoginname().equals(loginName)) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }

    /**
     * @param loginName 登录名
     * @param password  登录密码
     * @return 返回一个布尔值，登录名和密码都对得上就返回true，否则返回false
     */
    @Override
    public boolean canOrNotLogin(String loginName, String password) {
        boolean flag = false;
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        SysUser sysUser = sqlSession.getMapper(SysUserMapper.class).selectByUserName(loginName);
        if (sysUser != null) {
            //用户名和密码都对得上就返回true，否则返回false
            if (sysUser.getLoginname().equals(loginName) && sysUser.getLoginpwd().equals(password)) {
                flag = true;
            }
        }
        return flag;
    }


}
