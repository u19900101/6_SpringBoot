package ppppp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author lppppp
 * @create 2021-03-26 21:19
 */
@Slf4j
@RestController
public class SqlController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

   @GetMapping("/sql")
    public String  slqDemo() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_label", Long.class);
        log.info("测试记录数查询：{}",aLong);
        return "kkkkk";
    }

}
