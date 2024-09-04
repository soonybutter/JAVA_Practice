package com.collection.silsub1.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.collection.silsub1.controller.BoardController;
import com.collection.silsub1.model.dto.BoardDto;

//VIEW : 화면, 데이터를 보여주거나 입력 받는 역할
public class BoardMenu {
	private BoardController bc = new BoardController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("*******게시글 프로그램*******");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 한개 보기");
			System.out.println("4. 게시글 제목 수정");
			System.out.println("5. 게시글 내용 수정");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("10. 끝내기");

			System.out.println("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine(); 
			
			switch(num) {
			case 1: writeBoard();break;
			case 2: displayAll();break;
			case 3: displayBoard();break;
			case 4: updateTitle(); break;
			case 5: updateContent();break;
			case 6: deleteBoard();break;
			case 7: searchBoard();break;
			case 0: System.out.println("프로그램 종료!");return;
			}
		}
	}
	
	///////////////////////////////
	public void writeBoard() {
		System.out.println("새 게시글 쓰기");
		System.out.print("글제목: ");
		String title = sc.nextLine();
		
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		// 입력받은것을 여기에 담자!
		BoardDto dto = 
				new BoardDto(0,title,writer,content,new Date()); //필드 멤버변수 순서대로 담음
		
		bc.writeBoard(dto);
		
		
	}
	
	public void displayAll() {
		ArrayList<BoardDto> list = bc.dislayAllList();	
		
		
		for(BoardDto dto : list) {
			System.out.println(list);
		}
		
		
		
		
	}
	
	public void displayBoard() {
		System.out.print("조회할 번호: ");
		int no = sc.nextInt();
		
		
		BoardDto board = bc.displayBoard(no);
		if(board == null) {
			System.out.println("조회한 글이 없습니다.");
		}
		else {
			System.out.println(board);
		}
		
	}
	
	public void updateTitle() {
		System.out.print("수정할 글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		BoardDto board = bc.displayBoard(no);
		if(board == null) {
			System.out.println("조회된 글이 없습니다.");
		}
		else {
			System.out.print("변경할 제목: ");
			String title = sc.nextLine();
			
			bc.updateTitle(no, title);
		}
		
	}
	//내용 구현해보자 !!! 제목이랑 같음
	public void updateContent() {
		System.out.print("수정할 글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		BoardDto board = bc.displayBoard(no);
		if(board == null) {
			System.out.println("조회된 글이 없습니다.");
		}
		else {
			System.out.print("변경할 내용: ");
			String content = sc.nextLine();
			
			bc.updateContent(no, content);
		}
		
	}
	
	public void deleteBoard() {
		System.out.print("삭제할 글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		if(bc.displayBoard(no)== null) {
			System.out.println("조회된 글이 없습니다.");
		}
		else {
			bc.deleteBoard(no);
			System.out.println(no+"번 글이 삭제되었습니다.");
		}
		
	}
	
	public void searchBoard() {
		System.out.println("검색할 제목: ");
		String title = sc.nextLine();
		
		ArrayList<BoardDto> searchList = bc.searchBoard(title); // 컨트롤러한테 타이틀 넘기면서 search하라고 시킴.
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			for(BoardDto dto: searchList) {
				System.out.println(dto);
			}
		}
		
	}
	
}
