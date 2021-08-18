package cn.edu.usst.gaoxing.dao;

import cn.edu.usst.gaoxing.bean.Copyration;

import java.util.List;

public interface CopyrationMapper {
    int deleteByPrimaryKey(Integer copyrationid);

    int insert(Copyration record);

    int insertSelective(Copyration record);

    Copyration selectByPrimaryKey(Integer copyrationid);

    int updateByPrimaryKeySelective(Copyration record);

    int updateByPrimaryKey(Copyration record);

    List<Copyration> getCopyrationList();
}