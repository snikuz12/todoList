package com.personal.todolist.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String password;
    private String name;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
}
