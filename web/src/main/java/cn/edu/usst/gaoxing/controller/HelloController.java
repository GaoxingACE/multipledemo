package cn.edu.usst.gaoxing.controller;

import cn.edu.usst.gaoxing.common.TestBean;
import cn.edu.usst.gaoxing.config.ApplicationContextUtils;
import cn.edu.usst.gaoxing.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/*
 *@ClassName HelloController
 *@Author GaoXilong
 *@Date 2019/7/10 13:13
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Reference
    private HelloService helloService;

    @PostMapping("/sayhello")
    public String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }

    @GetMapping("/testHello")
    public void sayHello(){
        TestBean testBean=(TestBean) ApplicationContextUtils.getBean("testBean");
        testBean.hello();
    }
}
