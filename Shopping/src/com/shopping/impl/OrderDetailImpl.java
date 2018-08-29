package com.shopping.impl;

import com.shopping.mapper.OrderDetailMapper;
import com.shopping.pojo.Customer;
import com.shopping.pojo.OrderDetail;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDetailImpl implements OrderDetailMapper {
    @Override
    public int deleteByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.delete("com.shopping.mapper.OrderDetailMapper.delete",id);
        sqlSession.commit();;
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insert(OrderDetail record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.OrderDetailMapper.insert",record);
        sqlSession.commit();;
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(OrderDetail record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.OrderDetailMapper.insert",record);
        sqlSession.commit();;
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public OrderDetail selectByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        OrderDetail orderDetail = sqlSession.selectOne("com.shopping.mapper.OrderDetailMapper.insert",id);
        sqlSession.commit();;
        MybatisUtil.closeSession();
        return orderDetail;
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.OrderDetailMapper.insert",record);
        sqlSession.commit();;
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.OrderDetailMapper.insert",record);
        sqlSession.commit();;
        MybatisUtil.closeSession();
        return rows;
    }

}
