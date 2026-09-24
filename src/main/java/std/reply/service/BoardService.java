package std.reply.service;

import std.reply.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    public List<BoardDTO> getBoardList();

    public BoardDTO getBoard(Long id);

    public void modify(BoardDTO board);

    public void delete(Long id);

}
