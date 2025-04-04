package com.example.mybatis1;

import com.example.mybatis1.todo.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
public class TodoDaoTest {
    @Autowired
    private TodoDao todoDao;
   // @Test
    public void initTest(){
        todoDao.findAll();
    }
}
