package cn.edu.usst.gaoxing.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/*
 *@ClassName ApplicationContextUtils
 *@Author GaoXilong
 *@Date 2019/9/16 17:26
 */
@Component
public class ApplicationContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext =null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtils.applicationContext=applicationContext;
    }

    public static ApplicationContext getApplicationContext (){
        return ApplicationContextUtils.applicationContext;
    }

    public static <T> T getBean(String name){
        return (T)applicationContext.getBean(name);
    }
}
