package std.reply.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import std.reply.dto.BoardDTO;
import std.reply.mapper.BoardMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getBoardList() {
        return boardMapper.select();
    }

    @Override
    public BoardDTO getBoard(int id) {
        return boardMapper.selectById(id);
    }

    @Override
    public void modify(BoardDTO board) {
        boardMapper.update(board);
    }

    @Override
    public void delete(int id) {
        boardMapper.deleteById(id);
    }
}
