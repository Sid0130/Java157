package com.itwill.exception03;

/*
 * 예외(Exception) 클래스들의 상속 관계:
 * Object
 * |__ Throwable
 * 	  |__ Exception
 *       |__ RuntimeException. IOExcetion, ...
 *           |__ ArithmeticException, NumberFormatException, NullPointerException
 * 
 * catch 블록이 여러개인 경우,   
 * 하위 타입의 예외를 먼저 catch하고, 상위 타입의 예외는 나중에 catch해야 함.         
 */

public class ExceptionMain03 {

	public static void main(String[] args) {
//		try {
//			// TODO
//		} catch (Exception e) { // 다형성 , 인셉션을 상속받는 모든 것을 잡아버리기 때문에 
//			// -> 다형성 때문에 Exception을 상속하는 모든 종류의 예외들을 처리하게 됨.
//		} catch (NumberFormatExceptione e) { // 여기서는 못 잡음
//			// -> 도달할 수 없는 catch 블록 -> 컴파일 에러
//		}
		
		try {
			
		} catch (NumberFormatException e) {
			// 하위 타입의 예외를 먼저 처리
		} catch (Exception e) {
			// 상위 타입의 예외는 나중에 처리
		}// 코드를 세부적으로 만들어야할 때는 힘들 수 도있다
		
		try {
			int x = 100;
			//int y = 0;
			int y = 10;
			System.out.println("몫 = " + (x/y)); // y = 0 이면 ArithmeticException
			
//			 int[] array = new int[-1]; //-> NegativeArraySizeException 
			int[] array = new int[0];
			// array[0] = 1; //-> ArrayIndexOutOfBoundsException
			
			String s = null;
			System.out.println(s.length()); //-> NullPointerException
			
			return; 
			
		} catch (Exception e) {
			System.out.println(e.getClass() + " : " + e.getMessage());
			
			return; // main 메서드를 종료
			
		} finally {
			System.out.println("finally"); // 파이널은 리턴이 있던 없던 무조건 실행하고 끝남
			// -> try 또는 catch 블록 안에 return 문장이 있더라도
			// finally 블록이 실행된 후에 return 문장이 실행됨.
			
		}
		
		
	}

}
