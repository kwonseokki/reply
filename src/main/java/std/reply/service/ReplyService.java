package std.reply.service;

import std.reply.dto.ReplyDTO;

import java.util.List;

public interface ReplyService {

    public List<ReplyDTO> getReplyListById(Long id);

}
