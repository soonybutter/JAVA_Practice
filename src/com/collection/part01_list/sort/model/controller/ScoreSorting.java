package com.collection.part01_list.sort.model.controller;

import java.util.Comparator;

import com.collection.part01_list.sort.model.vo.Score;

public class ScoreSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//양수, 음수 무엇을 리턴하느냐에 따라 바꿀지 말지 결정.
		
		//점수 오름차순으로 정렬
		int s1 = ((Score)o1).getScore();
		int s2 = ((Score)o2).getScore();
		
		if(s1<s2) {
			return -1;
		}
		else if(s1>s2) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	

}
