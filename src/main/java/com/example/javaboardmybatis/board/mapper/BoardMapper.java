package com.example.javaboardmybatis.board.mapper;

import com.example.javaboardmybatis.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> getAllBoards();
    BoardDTO getBoardById(Long id);
    void createBoard(BoardDTO boardDto);
    void updateBoard(BoardDTO boardDto);
    void deleteBoard(Long id);
}