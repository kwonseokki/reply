package std.reply.mapper;

import org.apache.ibatis.annotations.Mapper;
import std.reply.dto.ReplyDTO;

import java.util.List;

@Mapper
public interface ReplyMapper {

    public List<ReplyDTO> selectAll(Long id);

    public void insert(ReplyDTO reply);

    public void update(ReplyDTO reply);

    public void delete(Long id);

}
