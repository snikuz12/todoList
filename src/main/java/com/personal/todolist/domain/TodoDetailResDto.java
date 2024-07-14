package com.personal.todolist.domain;

import java.time.LocalDateTime;

public class TodoDetailResDto {
    private long id;
    private String title;
    private String contents;
    private boolean completed;
    private LocalDateTime deadLine;
}
