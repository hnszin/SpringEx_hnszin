package org.hsj.mapper;

import java.util.ArrayList;

import org.hsj.domain.BoardDTO;

public interface BoardMapper {
	//게시판 글쓰기와 관련이 되어있는 DB작업에 설계
	public void write(BoardDTO board);
	//게시판 목록리스트와 관련이 되어있는 DB작업에 설계
	public ArrayList<BoardDTO> list();
	//게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지와 관련돼있는 DB작업 설계
	public BoardDTO detail(BoardDTO board);
	
	/*BoardMapper 인터페이스를 구현하는 곳이 xml이라는 건데 
	 *이게 순수 자바로 보았을 땐 안되는 것이지만 
	 *Spring 프레임워크에서 내부적으로 되게끔 만들었음 즉 스프링프레임워크 문법으로 볼 수 있음.
	 * */
	
	//게시판 글수정과 관련이 있는 DB작업에 설계
	public void modify(BoardDTO board);
	//게시판 글삭제와 관련이 있는 DB작업에 설계
	public void remove(BoardDTO board);
}
