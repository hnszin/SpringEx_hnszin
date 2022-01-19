package org.hsj.service;

import java.util.ArrayList;

import org.hsj.domain.BoardDTO;
import org.hsj.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//서비스 역할임을 어노테이션을 통해 연결
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper bmapper;
	 
	public void write(BoardDTO board) {
	   bmapper.write(board);
	}

	//게시판 목록리스트 설계된 것을 구현
	@Override
	public ArrayList<BoardDTO> list() {
		return bmapper.list();
	}

	//게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지 설계된 것을 구현
	@Override
	public BoardDTO detail(BoardDTO board) {
		return bmapper.detail(board);
	}
	
	//게시판 글수정 설계된 것을 구현
	public void modify(BoardDTO board) {
		bmapper.modify(board);
	}
	//게시판 글삭제 설계된 것을 구현
	@Override
	public void remove(BoardDTO board) {
		bmapper.remove(board);
	}
	
}