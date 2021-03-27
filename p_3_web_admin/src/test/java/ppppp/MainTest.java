package ppppp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import ppppp.bean.Label;
import ppppp.mapper.LabelMapper;
import ppppp.mapper.LabelMapperPlug;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class MainTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_label", Long.class);
        log.info("测试记录数查询：{}",aLong);
    }

    @Autowired
    LabelMapperPlug labelMapperPlug;
    @Autowired
    LabelMapper labelMapper;

    @Test
    public void T_mybatis_plus(){

        long  l = System.currentTimeMillis();
        Label labelByAnno = labelMapperPlug.selectById(1L);
        System.out.println("耗时:  "+ (System.currentTimeMillis()-l));
        System.out.println(labelByAnno);
        System.out.println();
    }

    @Test
    public void T_mybatis(){

        long  l = System.currentTimeMillis();
        Label label = labelMapper.getLabel(1L);
        System.out.println("耗时:  "+ (System.currentTimeMillis()-l));
        System.out.println(label);

    }

}
