package com.example.javaboardmybatis.member.mapper;

import com.example.javaboardmybatis.member.dto.Member;
import org.apache.ibatis.annotations.Insert;

public interface MemberMapper {
    @Insert("INSERT INTO members (username, password) VALUES (#{username}, #{password})")
    void saveMember(Member member);
}