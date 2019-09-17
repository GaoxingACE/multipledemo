package cn.edu.usst.gaoxing.common;

import org.springframework.stereotype.Component;

/*
 *@ClassName TestBean
 *@Author GaoXilong
 *@Date 2019/9/16 17:50
 */
@Component
public class TestBean {
    public void hello(){
        System.out.println("hello, applicationcontext");
    }
}
