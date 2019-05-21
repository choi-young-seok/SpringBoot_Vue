package kr.co.board.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Alias("board")
@ToString
public class Board {

	private Long boardNo;
	private String boardAuthor;
	private String boardTitle;
	private String boardContent;
	private Date boardCreateDate;
	private Date boardUpdateDate;

	@Builder
	public Board(Long boardNo, String boardAuthor, String boardTitle, String boardContent, Date boardCreateDate,
			Date boardUpdateDate) {
		super();
		this.boardAuthor = boardAuthor;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardCreateDate = boardCreateDate;
		this.boardUpdateDate = boardUpdateDate;
	}
	
	
}
