package com.personal.todolist.domain;

import lombok.Data;

// 클라이언트가 서버로 데이터를 전송할 때 사용되는 객체
@Data
public class MemberReqDto {

    private String name;
    private String email;
    private String password;
}
