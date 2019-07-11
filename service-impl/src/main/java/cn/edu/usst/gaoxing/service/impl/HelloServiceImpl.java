package cn.edu.usst.gaoxing.service.impl;

/*
 *@ClassName HelloServiceImpl
 *@Author GaoXilong
 *@Date 2019/7/10 13:10
 */

import cn.edu.usst.gaoxing.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
