package com.collection.silsub1.model.dto;

import java.util.Date;
//DTO(Data Transfer Object) : 데이터 교환을 위한 객체
//VO(Value Object) : 데이터 저장한 객체. readOnly(setter만...)

public class BoardDto {

	//필드. 생성자(기본, 매개변수), getter&setter, toString
		private int no;
		private String title;
		private String writer;
		private String content;
		private Date date;
		
		
		public BoardDto() {}
		public BoardDto(int no, String title, String writer, String content, Date date) {
			super();
			this.no = no;
			this.title = title;
			this.writer = writer;
			this.content = content;
			this.date = date;
		}
		
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		@Override
		public String toString() {
			return "[게시물번호 =" +no +" , 제목="+ title+ " , 글쓴이="+ writer+
					" , 내용="+content+" , 날짜="+ date+"]";
		}
		
		
}
