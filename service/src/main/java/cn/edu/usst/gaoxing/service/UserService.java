package cn.edu.usst.gaoxing.service;


import cn.edu.usst.gaoxing.bean.User;
import com.github.pagehelper.Page;

public interface UserService {
    User getUser(User user);
    Page<User>  findByPage(Integer pageNo, Integer pageSize);
    User getUser(String username);
    User getUserById(String userid);
    int insertUser(User user);
    int deleteUser(String userid);
    int updateUser(User user);
    int deleteByUserIds(String userIds);
}
