package com.collection.part01_list.sort.model.controller;

import java.util.ArrayList;

import com.collection.part01_list.sort.model.vo.Score;


public class ScoreController {
	public void scoreSort() {
		
		ArrayList list = new ArrayList();
		
		list.add(new Score("양다연",99));
		list.add(new Score("김바보",22));
		list.add(new Score("이바보",43));
		
		list.add(new Score("데이빗",49));
		list.add(new Score("김제니",12));
		list.add(new Score("올리비아",53));
		
		
		System.out.println("list: "+list);
		
		list.sort(null);
		System.out.println("name 가나다순 정렬- "+"list: "+list);
		
		list.sort(new ScoreSorting());
		System.out.println("점수 오름차순 정렬- "+"list: "+list);
		
		list.sort(new ScoreSorting2());
		System.out.println("점수 내림차순 정렬- "+"list: "+list);
		
		
		
		
	}

}
