package com.shopping.impl;

import com.shopping.mapper.CustomerMapper;
import com.shopping.pojo.Customer;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImpl implements CustomerMapper {

    @Override
    public int deleteByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.delete("com.shopping.mapper.CustomerMapper.delete",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insert(Customer record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.CustomerMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(Customer record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.CustomerMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }


    @Override
    public Customer selectByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        Customer customer = sqlSession.selectOne("com.shopping.mapper.CustomerMapper.selectByPrimaryKey",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return customer;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.CustomerMapper.updateByPrimaryKey",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.CustomerMapper.updateByPrimaryKey",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    }

