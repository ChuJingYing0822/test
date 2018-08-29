package com.shopping.impl;

import com.shopping.mapper.GoodsCategoryMapper;
import com.shopping.mapper.GoodsMapper;
import com.shopping.pojo.Customer;
import com.shopping.pojo.GoodsCategory;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsCategoryImpl implements GoodsCategoryMapper{
    @Override
    public int deleteByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.delete("com.shopping.mapper.GoodsCategoryMapper.delete",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insert(GoodsCategory record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.GoodsCategoryMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(GoodsCategory record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.GoodsCategoryMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public GoodsCategory selectByPrimaryKey(String id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        GoodsCategory goodsCategory = sqlSession.selectOne("com.shopping.mapper.GoodsCategoryMapper.select",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return goodsCategory;
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsCategory record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.GoodsCategoryMapper.update",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int updateByPrimaryKey(GoodsCategory record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.GoodsCategoryMapper.update",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

}
