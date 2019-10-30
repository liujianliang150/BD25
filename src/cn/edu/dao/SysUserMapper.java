package cn.edu.dao;

import cn.edu.pojo.SysUser;
import cn.edu.pojo.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     * 查找该表所有数据
     */
    List<SysUser> getAll();

    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    /**
     *
     * @param loginName 传入登录名
     * @return 得到一个管理员对象
     */
    SysUser selectByUserName(String loginName);
}