package cn.edu.usst.gaoxing.service.impl;


import cn.edu.usst.gaoxing.bean.User;
import cn.edu.usst.gaoxing.dao.UserMapper;
import cn.edu.usst.gaoxing.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

   private Logger logegr = LoggerFactory.getLogger("UserServiceImpl.class");

    @Autowired
    private UserMapper userMapper;


    @Override
    public int deleteUser(String userid) {
        return userMapper.deleteByPrimaryKey(Integer.valueOf(userid));
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteByUserIds(String userIds) {
        List<String> userIdList= Arrays.asList(userIds.split(","));
        List<Integer> userIdIntegerList=new ArrayList<>();
        for(String userId:userIdList){
            userIdIntegerList.add(Integer.parseInt(userId));
        }
        return userMapper.deleteByUserIds(userIdIntegerList);
    }

    @Override
    public int insertUser(User user) {
        int a=userMapper.insert(user);
        return a;
    }

    @Override
    //@Cacheable(value = "user",key = "#user")查询参数不定，不适用缓存
    public User getUser(User user) {
        return userMapper.selectSelective(user);
    }

    @Override
    public Page<User> findByPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return userMapper.findByPage();
    }

    @Override
    public User getUser(String username) {
        logegr.info("查询名称为 "+username+" 的员工");
        return userMapper.selectUserByUserName(username);
    }

    @Override
    public User getUserById(String userid) {
        int intUserId=Integer.valueOf(userid);
        return userMapper.selectByPrimaryKey(intUserId);
    }


}
