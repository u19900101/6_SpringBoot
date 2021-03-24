package ppppp.bean;
import javax.persistence.*;
import java.io.Serializable;

@Entity
//声明实体类
public class kk_User implements Serializable {
    @Id
    //声明了实体唯一标识对应的属性
    @GeneratedValue
    //自增
    private Integer id;
    @Column(nullable = false, unique = true, length = 32)
    //长度32，唯一索引，nullable表示true可以为空，false不可以
    //用来声明实体属性的表字段的定义
    private String userName;

    private String passWord;

    private String email;

    private String nickName;

    private String regTime;

    @Transient
    //不映射成列的字段
    private String desc;
    //省略get和set方法
}
