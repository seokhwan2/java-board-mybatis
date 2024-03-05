package com.example.javaboardmybatis.mapper.member;

import com.example.javaboardmybatis.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    void saveMember(MemberDTO member);
    int countByUsername(@Param("username") String username);

    int countByEmail(@Param("email") String email);
}