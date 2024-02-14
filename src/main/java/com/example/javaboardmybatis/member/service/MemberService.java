package com.example.javaboardmybatis.member.service;

import com.example.javaboardmybatis.member.dto.Member;
import com.example.javaboardmybatis.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public void saveMember(Member member) {
        memberMapper.saveMember(member);
    }
}
