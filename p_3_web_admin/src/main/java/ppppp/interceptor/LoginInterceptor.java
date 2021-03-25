package ppppp.interceptor;

/**
 * @author lppppp
 * @create 2021-03-25 20:21
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录检查
 * 1、配置好拦截器要拦截哪些请求
 * 2、把这些配置放在容器中
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        log.info("拦截的请求路径为{}: ",request.getRequestURI());
        Object loginUser = request.getSession().getAttribute("loginUser");
        // 放行的判断
        if(loginUser != null){
            return true;
        }
        request.getSession().setAttribute("msg", "请登录...");
        response.sendRedirect("/");
        return false;
    }
}
