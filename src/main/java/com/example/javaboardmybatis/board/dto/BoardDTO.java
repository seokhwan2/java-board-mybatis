package com.example.javaboardmybatis.board.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;
    private boolean published;

}
