package com.yedam.board.web;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

/**
 * 게시글 관리 작성자 작성일자 수정내용 홍길동 20250525 최초작성 홍길동 20250530 페이징
 */
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

	final BoardService boardService;

	/**
	 * 게시글 조회
	 * 
	 * @param model : 검색
	 * @param board 검색조건
	 * @return 목록페이지명
	 */
	// 목록
	@GetMapping("/list")
	public String getMethodName(Model model, BoardVO board) {
		model.addAttribute("list", boardService.getList());
		return "board/list";
	}

	// 등록페이지로 이동
	@GetMapping("/register")
	public void register() {
	}

	// 등록 처리하고 목록으로 이동
	@PostMapping("register")
	public String register(BoardVO vo) {
		boardService.insert(vo);
		return "redirect:list";
	}

	// 단건조회
	@GetMapping("get")
	public String get(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.read(bno));
		return "board/get";
	}

	// 수정페이지로 이동
	@GetMapping("modify")
	public void modify(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.read(bno));
	}

	// 수정 처리
	@PostMapping("modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		boardService.update(board);
		// return "redirect:list";
		rttr.addAttribute("bno", board.getBno());
		return "redirect:get";
	}

	// 삭제처리
	@GetMapping("remove")
	public String remove(@RequestParam("bno") Long bno) {
		boardService.delete(bno);
		return "redirect:list"; // 상대경로('/'가 없는 경우)
	}
}