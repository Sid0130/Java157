package com.itwill.array07;

import java.util.Random;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 정수 5개를 저장할 수 있는 배열을 선언, 기본값으로 초기화.
		int[] numbers = new int[5];	
		
		// Random 타입의 변수를 선언, 초기화.
		Random rand = new Random();
		// 배열 numbers에 0 이상 10 미만의 난수 5개를 저장.
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(0, 10);
		}		
		// 배열 numbers의 원소들을 출력.
		
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		int max = numbers[0]; // 배열 numbers의 첫번째 원소를 최대값이라고 가정.
		
		for (int x : numbers) { // 배열 numbers의 첫번째 원소부터 마지막 원소까지 순서대로 반복.
			if (x > max) {// 배열의 원소가 최댓값이라고 가정한 값(max)보다 크다면
				max = x; // 배열에서 찾은 값(더 큰 값)을 max 에 저장.
			}
				
		}
		System.out.println("max = " + max);
		
		int min = numbers[0]; // 배열의 첫번째 원소를 최솟값이라고 가정.
		for(int x : numbers) {
			min = (x < min) ? x : min; // 배열에서 읽은 값이 더 작다면 최솟값을 변경
		}
		System.out.println("min = " + min);
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] > max) {
//				max = numbers[i];
//			} else {
//				min = numbers[i];
//			}
//		}
//		System.out.println("최대값 = " + max);
//		System.out.println("최소값 = " + min);				
			
		// 배열 numbers의 원소들 중 최댓값을 찾고 출력.
		
		// 배열 numbers의 원소들 중 최솟값을 찾고 출력.

//		max = 배열의 첫번째 원소
//		for(배열 모든 원소) {
//			if 배원 > max
//				max = 배원.
	}

}
