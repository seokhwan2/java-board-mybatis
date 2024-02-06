package com.example.javaboardmybatis.board.service;

import com.example.javaboardmybatis.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getAllBoards();
    BoardDTO getBoardById(Long id);
    void createBoard(BoardDTO boardDto);
    void updateBoard(BoardDTO boardDto);
    void deleteBoard(Long id);
}
