package cn.edu.usst.gaoxing.service.impl;

import cn.edu.usst.gaoxing.bean.Copyration;
import cn.edu.usst.gaoxing.dao.CopyrationMapper;
import cn.edu.usst.gaoxing.service.CopyrationService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CopyrationServiceImpl implements CopyrationService {

    @Autowired
    private CopyrationMapper copyrationMapper;

    @Override
    public List<Copyration> getCopyrationList() {
        return copyrationMapper.getCopyrationList();
    }
}
