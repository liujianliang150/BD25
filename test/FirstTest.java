import cn.edu.dao.SysUserMapper;
import cn.edu.pojo.SysUser;
import cn.edu.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname Test
 * @Auther: 周小龙
 * @Description TODO
 * @Date 2019/10/26 17:16
 * @Created by Administrator
 */
public class FirstTest {

    @Test
    public void test01(){
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        List<SysUser> users = sqlSession.getMapper(SysUserMapper.class).getAll();
        for (SysUser user : users) {
            System.out.println(user.getUserid()+"----"+user.getUsername()+"----"+user.getCreattime());
        }

    }
}
