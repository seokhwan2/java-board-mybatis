package com.example.javaboardmybatis.member.controller;

import com.example.javaboardmybatis.member.dto.Member;
import com.example.javaboardmybatis.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/signup")
    public void signUp(@RequestBody Member member) {
        memberService.saveMember(member);
    }
}