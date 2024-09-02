package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	
	public void testArrayList() {
		//ArrayList
		
		//기본 10칸짜리 배열이 생성된다고 생각하면됨..
		ArrayList alist = new ArrayList();
		
		//다형성 적용
		List list = new ArrayList();
		Collection clist = new ArrayList();
		Object olist = new ArrayList(); 
		
		//저장 순서가 유지, index 가 적용됨.
		//객체만 저장 가능.
		//add()메서드 : 뒤로 차곡차곡 추가됨! 
		alist.add("apple");
		alist.add(123); //autoBoxing 처리(값 ->객체)
		alist.add(45.67);
		alist.add(new Date());
		
		//toString 오버라이딩 되었다.
		//add를 하여 추가한 순서대로 저장.
		System.out.println("alist: "+ alist);
		
		//인덱스가 지정되어 있기에 for문으로 접근 가능.
		//array의 length => list에서는 size();
		for(int i=0; i<4; i++) {
			//인덱스에 해당하는 값을 가져올때
			//배열 arr[i] => 리스트 list.get(i);
			System.out.println(i + " : "+alist.get(i));
			
		}
		//데이터 중복 저장 허용
		alist.add("apple");
		System.out.println("alist: "+ alist);
		
		//원하는 인덱스에 객체 추가
		alist.add(1,"banana");
		System.out.println("alist: "+ alist);
		
		//원하는 인덱스 삭제 => 뒤 배열이 당겨짐
		alist.remove(2);
		System.out.println("alist: "+ alist);
		
		//수정
		alist.set(3, true);
		System.out.println("alist: "+ alist);
		
		alist.clear();
		System.out.println(alist.size()+", "+alist.isEmpty());
		System.out.println("alist: "+ alist);
		
		
		//-----------------------------
		//오름차순 정렬을 할 수 있도록 sort()메소드 제공.
		
		alist.add("apple");
		alist.add("grape");
		alist.add("orange");
		alist.add("mango");
		alist.add("banana");
		
		System.out.println("list 정렬: "+ alist);
		
		//1.오름차순 정렬
		/*
		alist.sort(null); //오름차순 정렬: null(기본)
		System.out.println("list 오름차순정렬: "+ alist);
		*/
		
		//2.Collections util java 이용 정렬
		Collections.sort(alist);
		System.out.println("list 정렬: "+ alist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
