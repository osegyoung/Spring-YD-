package com.yedam.board.service;

import java.util.List;

import com.yedam.board.service.BoardVO;

import lombok.Data;

public interface BoardService {

	public List<BoardVO> getList(Criteria cri); // 목록

	public void insert(BoardVO vo); // 등록

	public BoardVO read(Long bno); // 조회
	
	public int update(BoardVO board); // 수정
	
	public int delete(Long bno); // 삭제

	public Long getTotal(Criteria cri);
	


	

	

	

}
