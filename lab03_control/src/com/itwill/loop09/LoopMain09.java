package com.itwill.loop09;

public class LoopMain09 {

	public static void main(String[] args) {
		
		// while 문을 사용해서 구구단 1단 ~ 9단까지 출력
		
		int x = 1;
		int y = 1;
		while (x < 10) {
			System.out.println( x + " 단");	
			
			y = 1;
			while (y < 10) {
				System.out.printf("%d x %d = %d\n", x, y , x*y);
				y++;
			}
			x++;	
		}

	}

}
