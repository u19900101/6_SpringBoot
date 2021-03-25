package ppppp.bean;

/**
 * @author lppppp
 * @create 2021-01-17 20:27
 */
// 将bean 与 配置文件进行绑定

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
@Component
@ConfigurationProperties(prefix = "person")

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode


public class Person {
    private String name;
    private Integer age;
}
