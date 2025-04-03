package com.example.mybatis1.entity;

import lombok.*;
import org.springframework.format.annotation.*;

import java.time.*;
@AllArgsConstructor
@Getter
public class Supply {
    // 번호 : Supply 객체들을 구별(기본키, 예를 들어 주소, 주민번호)
    //       기본키값을 주면 객체가 1개만 나온다
    private Integer sno;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate regDate;
    private Integer count;

}
