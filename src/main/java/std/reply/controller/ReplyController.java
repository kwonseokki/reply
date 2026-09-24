package std.reply.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import std.reply.dto.ReplyDTO;
import std.reply.service.ReplyService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/replies")
public class ReplyController {

    private final ReplyService replyService;

    @GetMapping("/{id}")
    public List<ReplyDTO> getRepliesById(@PathVariable("id") Long id) {
        return replyService.getReplyListById(id);
    }
}
