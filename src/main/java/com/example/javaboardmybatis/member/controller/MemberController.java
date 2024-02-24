package com.example.javaboardmybatis.member.controller;

import com.example.javaboardmybatis.member.dto.MemberDTO;
import com.example.javaboardmybatis.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@Valid @RequestBody MemberDTO memberDto, BindingResult result) {
        if (result.hasErrors()) {
            // 유효성 검사 오류가 있을 경우 처리
            StringBuilder errors = new StringBuilder();
            result.getAllErrors().forEach(error -> errors.append(error.getDefaultMessage()).append("\n"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors.toString());
        }

        // 유효성 검사 통과 시 회원 가입 로직 수행
        memberService.saveMember(memberDto);

        return ResponseEntity.status(HttpStatus.CREATED).body("회원 가입이 완료되었습니다.");
    }
}