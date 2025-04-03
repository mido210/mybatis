package com.example.mybatis1.dao;

// 데이터베이스 작업하는 클래스는 Data Access Object 또는 Repository
// 스프링에서 DAO의 어노테이션은 @Repository
// 스프링은 s급 라이브러리들을 지원하는데 ... 마이바티스는 A급에 불과해서 마이바티스가 스프링을 지원했다.
// 마이바티스 DAO는 스프링이 아닌 마티바티스가 객체를 생성해거 스프링빈으로 등록

import com.example.mybatis1.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

@Mapper //<- mybatis의 어노테이션
public interface SupplyDao {
    @Select("select * from supply")
    public List<Todo> findAll();

    // 마이바티스에서 insert, delete, update의 결과값은 "변경된 행의 개수"
    @Insert("insert into supply values (supply_seq.nextval,#{name},#{regDate}, #{count})")
    public int save(Supply supply);
}
