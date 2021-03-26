package ppppp.servlet;

import ch.qos.logback.classic.util.ContextInitializer;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lppppp
 * @create 2021-03-26 9:46
 */
@Slf4j
// @WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("初始化鸟....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("销毁鸟项目....");
    }
}
