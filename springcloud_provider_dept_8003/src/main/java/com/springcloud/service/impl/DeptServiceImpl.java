package com.springcloud.service.impl;

import com.springcloud.dao.DeptDao;
import com.springcloud.demo.entity.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/28 4:49
 */
@Service
public class DeptServiceImpl implements DeptService {

     @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
