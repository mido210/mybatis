package com.example.mybatis1.entity;

// Value Object: 값을 저장한 클래스
// Entity : DB 테이블과 동일하게 작성한 클래스

import lombok.*;
import org.springframework.cglib.core.*;

import java.time.*;

@AllArgsConstructor
@Getter
public class Todo {
    private int tno;
    private String title;
    private LocalDate regDate;
    private boolean finish;
}
