package com.personal.todolist.domain;

import lombok.Data;

// 서버가 클라이언트로 데이터를 전송할 때 사용되는 객체
@Data
public class MemberResDto {
    private Long id;
    private String name;
    private String email;
}
