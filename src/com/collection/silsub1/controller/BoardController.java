package com.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.silsub1.model.dao.BoardDao;
import com.collection.silsub1.model.dto.BoardDto;

//Controller : View와 Model 사이에서 흐름을 제어.
public class BoardController {
	private BoardDao dao = new BoardDao();
	private Scanner sc = new Scanner(System.in);
	
	public void writeBoard(BoardDto board) {
		
		board.setNo(dao.getLastNo()+1); //저장된 게시글들 중 마지막 게시물의 no값을 가져오겠다.
		
		dao.writeBoard(board);
		
	}
	public ArrayList<BoardDto> dislayAllList(){
		ArrayList<BoardDto> list = dao.displayAllList();
		return list;
	}
	public BoardDto displayBoard(int no) {
		dao.displayBoard(no);
		return dao.displayBoard(no);
	}
	public void updateTitle(int no, String title) {
		dao.updateTitle(no, title);
	}
	public void updateContent(int no, String content) {
		dao.updateContent(no, content);
	}
	public void deleteBoard(int no) {
		dao.deleteboard(no);
		
	}
	public ArrayList<BoardDto> searchBoard(String title){
		return dao.searchBoard(title);
	}
	

	
}
