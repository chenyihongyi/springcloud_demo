package com.springcloud.dao;

import com.springcloud.demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/28 4:28
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();


}
