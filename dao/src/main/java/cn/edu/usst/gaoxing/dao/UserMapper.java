package cn.edu.usst.gaoxing.dao;

import cn.edu.usst.gaoxing.bean.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    User selectUserByUserName(String username);
    User selectSelective(User user);

    //Integer selectCopyrationIdByUsername(String username);

    //Integer selectCopyrationIdByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    Page<User> findByPage();

    int deleteByUserIds(List userIdList);
}