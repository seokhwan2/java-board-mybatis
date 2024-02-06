package com.example.javaboardmybatis.board.serviceImpl;

import com.example.javaboardmybatis.board.dto.BoardDTO;
import com.example.javaboardmybatis.board.mapper.BoardMapper;
import com.example.javaboardmybatis.board.service.BoardService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@MapperScan("com.example.javaboardmybatis.board.mapper")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getAllBoards() {
        return boardMapper.getAllBoards();
    }

    @Override
    public BoardDTO getBoardById(Long id) {
        return boardMapper.getBoardById(id);
    }

    @Override
    public void createBoard(BoardDTO boardDto) {
        boardMapper.createBoard(boardDto);
    }

    @Override
    public void updateBoard(BoardDTO boardDto) {
        boardMapper.updateBoard(boardDto);
    }

    @Override
    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }
}
