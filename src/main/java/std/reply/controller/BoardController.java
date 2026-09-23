package std.reply.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import std.reply.dto.BoardDTO;
import std.reply.service.BoardService;

import java.util.List;

@RestController
@RequestMapping("/board")
@AllArgsConstructor
@Slf4j
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/list")
    public List<BoardDTO> getBoardList() {
      return boardService.getBoardList();
    }

    @RequestMapping("/{id}")
    public BoardDTO getBoardDetail(@PathVariable("id") int id) {
        return boardService.getBoard(id);
    }
}
