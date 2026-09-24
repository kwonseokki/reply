package std.reply.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardDTO {

    private Long id;

    private String title;

    private String content;

}
