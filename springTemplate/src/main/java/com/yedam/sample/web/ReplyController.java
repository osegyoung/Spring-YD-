package com.yedam.sample.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequestMapping("/board/{bno}/replies")
@RestController
@Log4j2
@AllArgsConstructor
public class ReplyController {

	private ReplyService service;

	// 해당 게시글의 댓글 조회
	@GetMapping("")
	public List<ReplyVO> getList(@RequestParam("page") int page, @PathVariable("bno") Long bno) {
		Criteria cri = new Criteria(page, 10);
		
		return service.getList(null, bno);
	}

	// 등록
	@PostMapping("")
	public ResponseEntity<ReplyVO> create(@PathVariable("bno") Long bno, @RequestBody ReplyVO vo) {
		ResponseEntity<ReplyVO> result = null;
		vo.setBno(bno);
		log.info("ReplyVO: " + vo);
		int insertCount = service.register(vo);
		log.info("Reply INSERT COUNT: " + insertCount);
		
		//http status 저장
		if(insertCount == 0) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		return result;
	}
	


}
