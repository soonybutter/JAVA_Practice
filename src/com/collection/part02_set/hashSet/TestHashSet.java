package com.collection.part02_set.hashSet;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.part01_list.sort.model.vo.Score;

public class TestHashSet {
	
	public void testHashSet() {
		HashSet hset = new HashSet();
		
		//다형성 적용하여 생성 가능
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
		
		//set에 객체를 추가
		hset.add(new String("java"));
		hset.add(123);
		hset.add(45.67);
		hset.add((new Date()));
		
		System.out.println("hset: "+ hset);
		
		hset.add(new String("java"));
		hset.add(123);
		
		//중복값 X
		System.out.println("hset: "+ hset);
		System.out.println("저장된 객체수: "+ hset.size());
		System.out.println("포함확인: "+ hset.contains(123));
		
		
		//저장된 객체 하나씩 접근하기
		//1. toArray()
		Object[] arr = hset.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+" : "+arr[i]);
		}
		
		//2. iterator()
		Iterator it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hset.clear();
		hset.add((new Score("다순이",99)));
		hset.add((new Score("다순이",99))); //중복인데 왜 둘다 들어감? new로 만들어서 주소가 다른 애임.. 남남
		
		
		System.out.println(hset);
		
		
		
	}
	

}
