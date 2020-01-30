package com.springcloud.service;

import com.springcloud.demo.entity.Dept;

import java.util.List;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/28 4:46
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
