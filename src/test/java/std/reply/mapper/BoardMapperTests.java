package std.reply.mapper;

import jakarta.annotation.Resource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import std.reply.dto.BoardDTO;

import java.util.List;

@SpringBootTest
public class BoardMapperTests {

    private static final Logger log = LogManager.getLogger(BoardMapperTests.class);
    @Resource
    private BoardMapper boardMapper;

    @Test
    public void testSelectBoard() {
        List<BoardDTO> boardList = boardMapper.select();
        boardList.forEach(board -> {
            log.info(board.getTitle());
        });
    }

    @Test
    public void insertBoard() {
        BoardDTO boardDTO = BoardDTO.builder()
                .title("test title")
                .content("test content")
                .build();

        boardMapper.insert(boardDTO);
    }

    @Test
    public void testDeleteBoard() {
        Long id = 1L;

        boardMapper.deleteById(id);
    }

    @Test
    public void testUpdateBoard() {
        BoardDTO boardDTO = boardMapper.selectById(2L);

        boardDTO.setContent("update content");
        boardDTO.setTitle("update title");

        boardMapper.update(boardDTO);
    }
}
