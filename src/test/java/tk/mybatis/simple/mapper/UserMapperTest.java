package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.model.SysUser;

import java.util.Date;

public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectById() {
        SqlSession sqlSession = getSqlSession();
        try {
            // 获取 UserMapper 接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // 调用 selectById 方法，查询 id = 1 的用户
            SysUser sysUser = userMapper.selectById(1L);
            // sysUser 不为空
            Assert.assertNotNull(sysUser);
            // sysUser = admin
            Assert.assertEquals("admin", sysUser.getUserName());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 创建一个 user 对象
        SysUser sysUser = new SysUser();
        sysUser.setUserName("test1");
        sysUser.setUserPassword("123456");
        sysUser.setUserEmail("test@mybatis.tk");
        sysUser.setUserInfo("test info");
        sysUser.setHeadImg(new byte[]{1,2,3});
        sysUser.setCreateTime(new Date());

    }
}

