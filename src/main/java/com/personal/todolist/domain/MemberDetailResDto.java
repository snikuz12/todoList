package com.personal.todolist.domain;

import lombok.Data;

@Data
public class MemberDetailResDto {

    private Long id;
    private String name;
    private String email;
    private String password;

}

