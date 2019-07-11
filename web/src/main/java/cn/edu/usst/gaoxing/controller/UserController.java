package cn.edu.usst.gaoxing.controller;


import cn.edu.usst.gaoxing.bean.User;
import cn.edu.usst.gaoxing.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private UserService userService;


    @RequestMapping(value = "getUserById",method = RequestMethod.GET)
    public User getUserById(@RequestParam String userid){
        User user=userService.getUserById(userid);
        return user;
    }

}
