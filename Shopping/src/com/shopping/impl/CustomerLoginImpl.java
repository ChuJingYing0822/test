package com.shopping.impl;

import com.shopping.mapper.CustomerLoginMapper;
import com.shopping.pojo.Customer;
import com.shopping.pojo.CustomerLogin;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerLoginImpl implements CustomerLoginMapper{
    @Override
    public int deleteByPrimaryKey(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.delete("com.shopping.mapper.CustomerLoginMapper.delete",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insert(CustomerLogin record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.CustomerLoginMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(CustomerLogin record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.CustomerLoginMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public CustomerLogin selectByPrimaryKey(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerLogin customerLogin = sqlSession.selectOne("com.shopping.mapper.CustomerLoginMapper.selectByPrimaryKey",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return customerLogin;
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerLogin record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.selectOne("com.shopping.mapper.CustomerLoginMapper.updateByPrimaryKeySelective",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int updateByPrimaryKey(CustomerLogin record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.selectOne("com.shopping.mapper.CustomerLoginMapper.updateByPrimaryKey",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

}
