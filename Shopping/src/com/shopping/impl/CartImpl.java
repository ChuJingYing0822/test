package com.shopping.impl;

import com.shopping.mapper.CartMapper;
import com.shopping.pojo.Cart;
import com.shopping.pojo.Customer;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartImpl implements CartMapper {

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Cart record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.CartMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(Cart record) {
        return 0;
    }

    @Override
    public Cart selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Cart record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Cart record) {
        return 0;
    }
}
