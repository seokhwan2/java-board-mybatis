
package com.example.javaboardmybatis.board.controller;

import com.example.javaboardmybatis.board.dto.BoardDTO;
import com.example.javaboardmybatis.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<BoardDTO> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/list/{id}")
    public BoardDTO getBoardById(@PathVariable Long id) {
        return boardService.getBoardById(id);
    }

    @PostMapping(value="/save", produces = "application/json;charset=UTF-8")
    public void createBoard(@RequestBody BoardDTO boardDto) {
        boardService.createBoard(boardDto);

    }

    @PutMapping("/{id}")
    public void updateBoard(@PathVariable Long id, @RequestBody BoardDTO boardDto) {
        boardService.updateBoard(boardDto);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
    }
}