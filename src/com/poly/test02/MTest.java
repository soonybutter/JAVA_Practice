package com.poly.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		System.out.print("선택[1.고양이 2.송아지 3.강아지]:");
		int sel =new Scanner(System.in).nextInt();
		
		//다형성 적용
		Base base = null;
		// 다 base로 포장돼있음
		
		switch(sel) {
		case 1:
			base = new Cat();
			break;
		
		case 2:
			base = new Cow();
			break;
		case 3:
			base = new Dog();
			break;
			
	    }
		
		base.start();
		base.stop();
		
		//하위클래스 고유멤버 실행 시 다운캐스팅이 필요함! (괄호로 감싸서 형변환해줘야함...)
		//Cat c = (Cat)base;
		//c.test();
		((Cat)base).test();
		
		//if(base instanceOf Cat) {
			//((Cat)base).start();
		//}
		
		
	

}
}
