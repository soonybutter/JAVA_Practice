package com.collection.part01_list.sort.model.controller;

import java.util.Comparator;

import com.collection.part01_list.sort.model.vo.Score;

public class ScoreSorting2 implements Comparator {

	//점수 내림차순 정렬
	
	@Override
	public int compare(Object o1, Object o2) {

		int s1 = ((Score)o1).getScore();
		int s2 = ((Score)o2).getScore();
		
		if(s1>s2) {
			return -1;
		}
		else if(s1<s2) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	

	//점수 내림차순 정렬
	
}
