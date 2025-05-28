package com.yedam.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BoardMapperTest {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;

	@Test
	public void testGetTime() {
		boardMapper.getList().forEach(board -> log.info(board));
	
		}
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 글");
		board.setWriter("newbie");
		
		boardMapper.insert(board);
		
		log.info(board);
	}
	@Test
	public void insertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 글");
		board.setWriter("newbie");
		
		boardMapper.insertSelectKey(board);
		log.info(board);
	}
	
	@Test
	public void testRead() {
		//존재하는 게시물 번호로 테스트
		BoardVO board = boardMapper.read(5L);
		
		log.info(board);
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		//실행전 존재하는 번호인지 확인할 것
		board.setBno(5L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("user00");
		
		int count = boardMapper.update(board);
		log.info("UPDATE COUNT : " + count);
	}
	
	
	
	@Test
	public void testDelete() {
		log.info("Delete COUNT: " + boardMapper.delete(3L));
	}
}
