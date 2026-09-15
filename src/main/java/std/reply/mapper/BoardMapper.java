package std.reply.mapper;

import org.apache.ibatis.annotations.Mapper;
import std.reply.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardDTO> select();
}
