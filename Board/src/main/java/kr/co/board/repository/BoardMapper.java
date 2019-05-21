package kr.co.board.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.board.entity.Board;

@Mapper
@Repository
public interface BoardMapper {

	public int createBoard(Board board);
	
	public Board getBoardById(long board_no);
}
