package std.reply.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import std.reply.dto.ReplyDTO;

import java.util.List;

@SpringBootTest
@Slf4j
public class ReplyMapperTests {

    @Autowired
    private ReplyMapper replyMapper;

    @Test
    public void testSelectAll() {
        Long id = 2L;

        List<ReplyDTO> replyDTOS = replyMapper.selectAll(id);

        replyDTOS.forEach(replyDTO -> {
            log.info(replyDTO.getBoardId() + " 번째 게시물 댓글 내용 " + replyDTO.getContent());
        });
    }
}
