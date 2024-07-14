package com.personal.todolist.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Todo {
    private long id;
    private String title;
    private String contents;
    private boolean completed;
    private LocalDateTime deadLine;
}
