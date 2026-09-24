package std.reply.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import std.reply.dto.ReplyDTO;
import std.reply.mapper.ReplyMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyMapper replyMapper;

    @Override
    public List<ReplyDTO> getReplyListById(Long id) {
        return replyMapper.selectAll(id);
    }
}
