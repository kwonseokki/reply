package std.reply.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import std.reply.dto.BoardDTO;

import java.util.List;

@SpringBootTest
@Slf4j
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    public void testGetBoardList() {
        List<BoardDTO> boardList = boardService.getBoardList();

        boardList.forEach(board -> {
            log.info("board: " + board.toString());
        });
    }
}
