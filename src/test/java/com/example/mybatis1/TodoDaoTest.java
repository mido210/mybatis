package com.example.mybatis1;

import com.example.mybatis1.dao.*;
import com.example.mybatis1.entity.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.transaction.annotation.*;

import java.time.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

// TodoDao가 생성되고 동작하는 지를 확인 -> 단위 테스트
// JUnit은 스프링을 몰라 -> 스프링이 junit을 어노테이션으로 지원
@SpringBootTest
public class TodoDaoTest{
    @Autowired
    private  TodoDao todoDao;
    @Autowired
    private SupplyDao supplyDao;

    //@Test
//    public void initTest(){
//        // assert문을 사용하지만 junit의 실행 결과는 무조건 성공으로 출력
//        assertNotNull(todoDao);
//    }
//    @Test
//    public void findAllTest(){
//        int size= todoDao.findAll().size();
//        assertEquals(0, size);
//    }
//    @Test
//    public void findAllTest(){
//        System.out.println("DB에서 가져온 데이터 개수: " + supplies.size());
//        System.out.println("조회된 데이터: " + supplies);
//
//        assertEquals(7, supplies.size());  // 기대값과 실제값 비교
//    }
//    @Test
//    public void saveTest(){
//        Todo todo = new Todo(0,"문학야구장 가기", LocalDate.of(2025,4,5),false);
//        int result = todoDao.save(todo);
//        assertEquals(1,result);
//    }
    @Test
        public void saveTest(){
        Supply supply = new Supply(9, "콜라",LocalDate.of(2025,4,5),4);
        int result = supplyDao.save(supply);
        assertEquals(1,result);
    }
    // 실패하는 것도 테스트 해라
//    @Test
//    public void finishTest(){
//       assertEquals(0,todoDao.finish(10));
//        assertEquals(1,todoDao.finish(2));
//    }
//    @Transactional
//    @Test
//    public void deleteTest(){
//        assertEquals(0,todoDao.finish(10));
//        assertEquals(1,todoDao.finish(2));
//    }
}
