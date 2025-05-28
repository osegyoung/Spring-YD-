package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getList();

	public void insert(BoardVO board);

	public void insertSelectKey(BoardVO board);

	public BoardVO read(Long bno); // 단건조회
	
	public int update(BoardVO board); // 수정
	
	public int delete(Long bno);
	

	

}
