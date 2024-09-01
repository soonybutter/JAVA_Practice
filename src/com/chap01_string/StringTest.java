package com.chap01_string;

public class StringTest {

	public static void main(String[] args) {
		
		//test1();
		test2();

	}
	
	//String 클래스
	//immutable(변경불가)
	public static void test1() {
		//1.문자열 리터럴로 생성
		/*String str = "abc";  //string 객체 만들어짐.
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode()); // 둘다 같게 나옴
		
		//2.생성자를 이용한 문자열 생성
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		//hashcode 오버라이딩돼서 다 같은 해쉬코드가 나옴.
		System.out.println("----------");
		
		//identityHashCode() 
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(str == str1);
		System.out.println(str3 == str4);
		*/
		
	}
	
	public static void test2() {
		String str = "abc";
		
		//charAt(i)
		System.out.println(str.charAt(1));
		
		//concat(String) : 합치기
		System.out.println(str.concat("def"));
		
		//contains(String) : 포함여부 확인
		System.out.println(str.contains("ac"));
		
		//equals(String) : 비교
		System.out.println(str.equals("abc"));
		
		//length():문자열 길이
		System.out.println(str.length());
		
		//split() : 문자열을 자름, 구분.
		String str1 = "a,b,c,d,ef";
		String[] arr = str1.split(","); 
		for(String s: arr) {
			System.out.println(s);
		}
		
		//toUpperCase():대문자로 변경 <=> toLowerCase()
		System.out.println(str.toUpperCase());
		
		//substring() : 잘라내기
		System.out.println(str1.substring(2,4));
		
		//trim():공백제거
		String str2 = "      a b cd";
		System.out.println(str2.trim());
		
		
		
	}
	

}
