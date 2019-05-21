package kr.co.board.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.board.entity.Board;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BoardMapperTest {

	@Autowired
	BoardMapper boardMapper;

	Board board = null;
	
	@Before
	public void setTestParam() {
		board = Board.builder()
				.boardAuthor("최용석")
				.boardTitle("제목테스트")
				.boardContent("내용테스트")
				.boardCreateDate(new Date())
				.boardUpdateDate(new Date())
				.build();
	}
	
	@Test
	public void insertBoardTest() {
		log.info("insertBoardTest : " + board.toString());
		assertThat(boardMapper.createBoard(board)).isEqualTo(1); 
	}
	
//	@Test
	public void getBoardByIdTest() {
		
	}
}
