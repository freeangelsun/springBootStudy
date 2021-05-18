package com.example.springbootstudy.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;


@SpringBootTest
public class ConnectionTests {
    private static final Logger log = LoggerFactory.getLogger(ConnectionTests.class);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void connectTest(){
        try(Connection con = sqlSessionFactory.openSession().getConnection()){
            log.debug("커넥션 성공!");
        }catch(Exception e){
            e.printStackTrace();
        }
        log.debug("테스트 종료!");
    }

    @Test
    public void mapperTest(){
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            log.debug("UserMapper.selectTest");
            log.debug("LIST DATA : " + sqlSession.selectList("UserMapper.selectTest").toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}