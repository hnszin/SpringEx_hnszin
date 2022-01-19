package org.hsj.controller;

import org.hsj.domain.BoardDTO;
import org.hsj.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired //BoardService.java
	// private BoardService service = new BoardService();
	private BoardService service;
	
	// 글쓰기 화면으로
	@GetMapping("write")
	public void write() {
		System.out.println("board/write");
	}
	
	// 글쓰기 버튼을 클릭하면
	@PostMapping("write") // url주소를 분석하는 역할 get방식과 post방식의 write라 같아도 상관없음 
	public String writePost(BoardDTO board) {
		service.write(board);
		System.out.println("write post....."+board);
		
		return "redirect:list";
	}
	
	// 게시판 목록 리스트
	@GetMapping("list")
	public void list(Model model) {
		System.out.println("board/list");
		System.out.println("list 결과는"+service.list());
		model.addAttribute("list", service.list());
	}
	
	// 게시판 목록 리스트에서 제목을 클릭하면
	@GetMapping("detail")
	public void detail(BoardDTO board,Model model){
		model.addAttribute("detail",service.detail(board));
	}
	
	// 글수정 화면으로
	@GetMapping("modify")
	public void modify(BoardDTO board,Model model) {
		System.out.println("board/modify");
		model.addAttribute("detail",service.detail(board));
	}
	
	// 글수정 버튼을 클릭하면
	@PostMapping("modify")					//RedirectAttributes 를 통해  bno값을 detail.jsp로 가지고 감.
	public String modifyPost(BoardDTO board,RedirectAttributes rttr) {
		//update
		service.modify(board);//bno		//5
		rttr.addAttribute("bno", board.getBno()); //http://localhost:8080/board/detail?bno=5
		return "redirect:/board/detail";
	}
	
	// 글삭제 버튼을 클릭하면
	@GetMapping("remove")
	public String remove(BoardDTO board) {
		System.out.println(board);
		service.remove(board);
		return "redirect:/board/list";
	}
	

}
