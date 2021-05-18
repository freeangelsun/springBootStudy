package com.example.springbootstudy.study6.mybatis.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TestDao {
    private final static String NAMESPACE = "UserMapper";

    private final SqlSession sqlSession;

    public List selectTest(){
        return sqlSession.selectList(NAMESPACE+".selectTest");
    }
}
