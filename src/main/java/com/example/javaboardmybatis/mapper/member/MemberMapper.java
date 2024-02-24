package com.example.javaboardmybatis.mapper.member;

import com.example.javaboardmybatis.member.dto.MemberDTO;

public interface MemberMapper {
    void saveMember(MemberDTO member);
}