package ppppp.acutuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;


@Component
public class AppInfoInfoContributor implements InfoContributor {


    @Override
    public void contribute(Info.Builder builder) {

        builder.withDetail("中文测试 定义的信息","你好")
                .withDetail("InfoContributor类","mmmmm")
                .withDetails(Collections.singletonMap("world","666600"));
    }
}
