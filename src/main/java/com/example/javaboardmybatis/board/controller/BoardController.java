
package com.example.javaboardmybatis.board.controller;

import com.example.javaboardmybatis.board.dto.BoardDTO;
import com.example.javaboardmybatis.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {
    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardDTO>> getAllBoards() {
        List<BoardDTO> boards = boardService.getAllBoards();
        return ResponseEntity.ok(boards);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<BoardDTO> getBoardById(@PathVariable Long id) {
        BoardDTO board = boardService.getBoardById(id);
        return ResponseEntity.ok(board);
    }

    @PostMapping(value="/save", produces = "application/json;charset=UTF-8")
    public ResponseEntity<String> createBoard(@RequestBody BoardDTO boardDto) {
        try {
            boardService.createBoard(boardDto);
            return ResponseEntity.ok("저장되었습니다");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("실패하였습니다");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBoard(@PathVariable Long id, @RequestBody BoardDTO boardDto) {
        try {
            boardDto.setId(id);
            boardService.updateBoard(boardDto);
            return ResponseEntity.ok("수정되었습니다");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("실패하였습니다");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBoard(@PathVariable Long id) {
        try {
            boardService.deleteBoard(id);
            return ResponseEntity.ok("삭제되었습니다");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("실패하였습니다");
        }
    }
}