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
}
