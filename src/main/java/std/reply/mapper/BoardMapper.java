package std.reply.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import std.reply.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardDTO> select();

    public BoardDTO selectById(Long id);

    public void insert(BoardDTO board);

    public void deleteById(Long id);

    public void update(BoardDTO board);

}
