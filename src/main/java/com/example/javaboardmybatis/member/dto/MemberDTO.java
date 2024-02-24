package com.example.javaboardmybatis.member.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MemberDTO {
    private Long id;
    @NotNull(message = "사용자명은 필수 입력 항목입니다")
    private String username;

    @NotNull(message = "비밀번호는 필수 입력 항목입니다")
    private String password;

}