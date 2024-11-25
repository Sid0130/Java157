package com.itwill.loop13;

import java.util.Random;

public class LoopMain13 {

	public static void main(String[] args) {

		// 무한루프
		// for ( ; ; ) {
		// }
		// while (true) {
		// }

		// 교재 연습 문제 3.
		// 주사위 2개를 던졌을 때 그 결과를 (x, y) 형식으로 출력.
		// 주사위 2개의 눈의 합이 5가 되면 실행을 멈춤.
		// 예 : (1,2) (3,6) (2,4) (1,4) break 를 쓰는게 편리.

		Random rand = new Random();
		// 무한루프를 만든다.

		for (;;) {
			// While (true) {
			int dice1 = rand.nextInt(1, 7);
			int dice2 = rand.nextInt(1, 7);
			System.out.printf("(%d, %d)\n", dice1, dice2);

			if (dice1 + dice2 == 5) {
				break;

			}
		}
		System.out.println("----------------");

		int dice1 = 0;
		int dice2 = 0;
		for (; dice1 + dice2 != 5;) {
			dice1 = rand.nextInt(1, 7);
			dice2 = rand.nextInt(1, 7);
			System.out.printf("(%d, %d)\n", dice1, dice2);
		}

		System.out.println("----------------");

		dice1 = 0;
		dice2 = 0;
		while (dice1 + dice2 != 5) {
			dice1 = rand.nextInt(1, 7);
			dice2 = rand.nextInt(1, 7);
			System.out.printf("(%d, %d)\n", dice1, dice2);
		}

		System.out.println("----------------");

		dice1 = 0;
		dice2 = 0;
		do {
			dice1 = rand.nextInt(1, 7);
			dice2 = rand.nextInt(1, 7);
			System.out.printf("(%d, %d)\n", dice1, dice2);
		} while (dice1 + dice2 != 5);  // 조건을 어떻게 쓰냐에 따라 무한루프 빠져나올 수 있게

		
		
		System.out.println("=====================");
		
		// 교재 연습 문제 4
		// 4x + 5y = 60 방정식을 만족하는 x와 y를 찾기.
		// 단, x와 y는 10이하의 자연수
		// 예 : (5, 8), ...
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.printf("[x= %d , y= %d]\n", x, y);
				}
			}
		}
		
		// while 문 으로 해보기
//		while (x<=10) {
//			
//		}
//		
		
		
		
		
	}

}
