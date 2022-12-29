package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.model.Country;
import java.util.List;

public class CountryMapperTest extends BaseMapperTest {
    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> countryList = sqlSession.selectList("selectAll");
            System.out.println(countryList);
        } finally {
            sqlSession.close();
        }
    }
}
