package com.li.hello.common.diyAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Package:
 * @Description:
 * @author:
 * @date:
 */
@Component
@Aspect
public class LogAspectImpl{

    //注入日志service

    //日志切点
    @Pointcut("@annotation(com.li.hello.common.diyAnnotation.LogAspectAnnotation)")
    public void cut(){}


    @Before("cut()")
    public void before(JoinPoint joinPoint){
//        ("已经记录下操作日志@Before 方法执行前");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        System.out.println("sessionId:"+session.getId());
        System.out.println("方法之前执行了--start");
        try {
            System.out.println(getServiceMthodDescription(joinPoint));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @After("cut()")
    public void after() {
//        this.printLog("已经记录下操作日志@After 方法执行后");
        System.out.println("方法之后 执行了");
    }

    @AfterThrowing(pointcut = "cut()")
    public void catchExcetion(){
        System.out.println("操作异常");
    }


    /**
     * 获取注解中对方法的描述信息 用于service层注解
     *
     * @param joinPoint 切点
     * @return 方法描述
     * @throws Exception
     */
    public  static String getServiceMthodDescription(JoinPoint joinPoint)
            throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(LogAspectAnnotation.class).value();
                    break;
                }
            }
        }
        return description;
    }

}
