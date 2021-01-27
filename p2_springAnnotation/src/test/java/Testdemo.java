import ppppp.bean.Person;
import ppppp.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author lppppp
 * @create 2021-01-17 20:40
 */
public class Testdemo {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);


   @Test
   public void T2(){
       Object person = context.getBean("personName");
       Object person2 = context.getBean("personName");
       System.out.println(person==person2);
   }

    @Test
    public void T_allBean(){
        printBeanNames();
    }

    @Test
    public void T_多实例bean_conditional(){
        String[] names = context.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }
        Map<String, Person> personMap = context.getBeansOfType(Person.class);
        personMap.entrySet().forEach(System.out::println);
    }

    public void printBeanNames(){
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
