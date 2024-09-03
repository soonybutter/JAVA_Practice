package com.collection.part01_list.sort.model.vo;

public class Score implements Comparable<Score>{
		private String name;
		private int score;
		
		public Score() {}
		public Score(String name, int score) {
			this.name= name;
			this.score =score;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		
		@Override
		public String toString() {
			return "[name=" + name + ", score="+ score +"]";
		}
		
		@Override
		public int compareTo(Score o) {
			//리턴값이 양수냐 음수냐에 따라 자리를 바꿀지 말지 결정.
			//양수리턴 -> 자리바꿈
			//음수리턴 -> 제자리
			
			//1. name으로(String) 오름차순 기본정렬
			String otherName = o.getName(); //매개변수로 넘어오는 객체에서 이름만 꺼내자!
			
			return name.compareTo(otherName);
			//String 클래스의 compareTo()
			
			//"나".compareTo("가"); -> 양수리턴 -> 자리 바꿔야함!
			//"가".compareTo("나"); -> 음수리턴 -> 자리 안바꿈!
			
			//2. name 내림차순
			//return -name.compareTo(otherName);
			
			
			//3. 점수 오름차순
			//빼줘서 양수 -> 자리바꿈!
			//빼줘서 음수 -> 자리 안바꿈!
			
			
		}

	}
	


