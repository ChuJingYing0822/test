package com.shopping.impl;

import com.shopping.mapper.MyorderMapper;
import com.shopping.pojo.Customer;
import com.shopping.pojo.Myorder;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyOrderImpl implements MyorderMapper {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.delete("com.shopping.mapper.MyorderMapper.delete",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insert(Myorder record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.MyorderMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int insertSelective(Myorder record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.insert("com.shopping.mapper.MyorderMapper.insert",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public Myorder selectByPrimaryKey(Integer id) {
       SqlSession sqlSession = MybatisUtil.getSession();
        Myorder  myorder = sqlSession.selectOne("com.shopping.mapper.MyorderMapper.select",id);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return myorder;
    }

    @Override
    public int updateByPrimaryKeySelective(Myorder record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.MyorderMapper.update",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

    @Override
    public int updateByPrimaryKey(Myorder record) {
        SqlSession sqlSession = MybatisUtil.getSession();
        int rows = sqlSession.update("com.shopping.mapper.MyorderMapper.update",record);
        sqlSession.commit();
        MybatisUtil.closeSession();
        return rows;
    }

}
