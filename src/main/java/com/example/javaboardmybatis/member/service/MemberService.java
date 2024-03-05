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

    public boolean isUsernameUnique(String username) {
        int count = memberMapper.countByUsername(username);
        return count == 0;
    }

    public boolean isEmailUnique(String email) {
        int count = memberMapper.countByEmail(email);
        return count == 0;
    }
}