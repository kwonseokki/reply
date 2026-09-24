package std.reply.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReplyDTO {

    private Long id;

    private String content;

    private Long boardId;

}
