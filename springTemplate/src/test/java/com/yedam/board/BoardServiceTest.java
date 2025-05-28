package com.yedam.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BoardServiceTest {
	
	@Autowired BoardService boardservice; 
	
	@Test
	public void update() {
		BoardVO vo = boardservice.read(1L);
		vo.setTitle("제목 변경");
		boardservice.update(vo);
	}
}
