package std.reply.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import std.reply.dto.BoardDTO;
import std.reply.dto.ReplyDTO;

import java.util.List;

@SpringBootTest
@Slf4j
public class ReplyMapperTests {

    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void testSelectAll() {
        Long id = 2L;

        List<ReplyDTO> replyDTOS = replyMapper.selectAll(id);

        replyDTOS.forEach(replyDTO -> {
            log.info(replyDTO.getBoardId() + " 번째 게시물 댓글 내용 " + replyDTO.getContent());
        });
    }

    @Test
    public void testInsert() {
        BoardDTO board = boardMapper.selectById(2L);

        ReplyDTO reply = ReplyDTO.builder()
                .boardId(board.getId())
                .content("insert test")
                .build();

        replyMapper.insert(reply);
    }

    @Test
    public void testUpdate() {
        ReplyDTO firstReply = replyMapper.selectAll(2L).get(0);

        firstReply.setContent("update test");

        replyMapper.update(firstReply);
    }

    @Test
    public void testDelete() {
        replyMapper.delete(1L);
    }
}
