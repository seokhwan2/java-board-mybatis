package com.example.javaboardmybatis.member.service;

import com.example.javaboardmybatis.member.dto.MemberDTO;
import com.example.javaboardmybatis.mapper.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public void saveMember(MemberDTO member) {
        memberMapper.saveMember(member);
    }
}
