package ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "ppppp")
public class P3WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(P3WebAdminApplication.class, args);
    }

}
