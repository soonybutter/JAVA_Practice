package com.chap02_stringBuffer_stringBuilder;

public class StringTest {

	public static void main(String[] args) {
		
		//test1();
		test2();
	}
	
	//StringBuffer & StringBuilder
	//mutable 변경가능
	//변경과 저장을 위한 메모리공간을 내부에 지닌다. 기본크기는 16개 문자
	
	public static void test1() {
		StringBuffer sbf = new StringBuffer("안녕! ");
		System.out.println(sbf);
		
		String str="안녕! ";
		System.out.println("str: "+str+", 주소: "+System.identityHashCode(str));
		
		str += "반가워:D";
		System.out.println("str 수정 후: "+str+", 주소: "+System.identityHashCode(str));
		
		System.out.println("sbf: "+ sbf +", 주소: "+System.identityHashCode(sbf));
		
		sbf.append("반가워:D");
		System.out.println("sbf 수정 후: "+ sbf +", 주소: "+System.identityHashCode(sbf));

		StringBuilder sbd = new StringBuilder("안녕! ");
		System.out.println("sbd: "+ sbd + ", 주소: "+sbd.hashCode());
		
		sbd.append("반가워:D");
		System.out.println("sbd 수정 후: "+ sbd + ", 주소: "+sbd.hashCode());
	
		
	}
	
	public static void test2() {
		StringBuffer sb = new StringBuffer("3교시 ");
		
		//append :마지막에 추가
		sb.append("배고파요.");
		System.out.println(sb);
		sb.append("30분 뒤에 ").append("밥 먹으로 가요");
		System.out.println(sb);
		
		//insert : 원하는 위치에 추가
		sb.insert(0, "목요일 ");
		System.out.println(sb);
		
		//delete: 삭제
		sb.delete(0, 8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
	}

}
