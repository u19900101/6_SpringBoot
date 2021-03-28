package ppppp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan(basePackages = "ppppp")
@MapperScan("ppppp.mapper")
@SpringBootApplication(exclude = RedisAutoConfiguration.class)

public class P3WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(P3WebAdminApplication.class, args);
    }

}
