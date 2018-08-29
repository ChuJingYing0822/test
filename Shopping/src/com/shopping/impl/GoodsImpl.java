package com.shopping.impl;

import com.shopping.mapper.GoodsMapper;
import com.shopping.pojo.Customer;
import com.shopping.pojo.Goods;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsImpl implements GoodsMapper {

    @Override
    public int deleteByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.delete("com.shopping.mapper.GoodsMapper.insert",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insert(Goods record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.GoodsMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(Goods record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.GoodsMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }
    @Override
    public Goods selectByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        Goods goods = sqlSession.selectOne("com.shopping.mapper.GoodsMapper.select",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return goods;
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.GoodsMapper.update",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.GoodsMapper.update",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

}
