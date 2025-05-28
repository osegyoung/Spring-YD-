package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
public  class BoardServiceImpl implements BoardService {

    final BoardMapper boardMapper;
    
    @Override
    public List<BoardVO> getList() {
        return boardMapper.getList();
    }
    
    @Override
    public void insert(BoardVO vo) {
    	boardMapper.insert(vo);
    }

	@Override
	public BoardVO read(Long bno) {
		return boardMapper.read(bno);
	}

	@Override
	public int update(BoardVO board) {
		return boardMapper.update(board);
	}

	@Override
	public int delete(Long bno) {
		return boardMapper.delete(bno);
	}

}