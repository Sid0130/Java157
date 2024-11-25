package com.itwill.list01;

import java.util.ArrayList;

/*
 * Collection<E> 
 * |__List<E>
 *    |__ArrayList<E>, LinkedList<E>   // 실제로는 여기에 있는걸로 객체 생성.
 * 
 * 리스트(List)의 특징:
 * 1. 값들을 저장할 때 순서가 중요 - 인덱스(index)를 갖는 자료 구조.
 * 2. 값들을 저장할 때마다 인덱스는 자동으로 증가. 인덱스는 0부터 시작.
 * 3. 리스트 중간에 있는 값을 삭제하면 인덱스가 자동으로 재배열됨.
 * 4. 같은 값들을 여러번 저장할 수 있음. - Set<E>과 다른 점. 
 * 5. List<E>에서 <E>는 리스트에 저장하는 원소(element)의 타입을 의미.
 * 		- List<String>: String을 원소로 갖는 리스트. 리스트가 타입이고 어떤 원소를 갖는가 
 * 		- 리스트의 원소 타입은 클래스 이름만 사용 가능. 기본 타입(boolean, int, double)은 사용할 수 없음!
 * 		- 리스트의 원소 타입에는 기본 타입 대신 wrapper 클래스를 사용해야 함.
 * 		- List<Integer>: Integer를 원소로 갖는 리스트.
 * 
 * ArrayList<E>의 특징:
 * 1. 배열(array)를 사용한 리스트 - 값들이 연속된 메모리 공간에 저장.
 * 2. 값을 저장, 삭제 속도가 느림.  
 * 3. 값을 검색 속도는 빠름.
 * 
 * LinkedList<E>의 특징:
 * 1. linked list 알고리즘을 사용한 리스트 - 이전/이후 노드의 주소를 저장하는 알고리즘.
 * 2. 값을 저장, 삭제 속도가 빠름.
 * 3. 값을 검색 속도 느림.
 */

public class ListMain01 {

	public static void main(String[] args) {
		// 정수들을 저장하는 ArrayList를 생성:
		ArrayList<Integer> numbers = new ArrayList<>();//new ArrayList<Integer>();
		//-> 변수 타입 선언에서 원소 타입이 명시되어 있기 때문에 
		// 생성자 호출에서는 원소 타입을 생략해도 됨.
		// ArrayList도 toString을 오버라이드
		System.out.println(numbers); //[]는 원소가 하나도 없는 리스트
		System.out.println("size = " + numbers.size()); // size 는 리스트의 크기를 리턴하는 메서드
		
		// ArrayList에 원소 저장: add(E element)
		numbers.add(1);
		numbers.add(-1);
		numbers.add(123);
		
		System.out.println(numbers);
		System.out.println("size = " + numbers.size());
		
		// ArrayList에 저장된 값 읽기(가져오기): get(int index)
		System.out.println("[1] " + numbers.get(1));
		
		// for 반복문:
		for(int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();
		
		// 향상된 for 문장:
		for(Integer n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// ArrayList에서 원소 삭제: remove(int index), remove(Object element) 저장된 오브젝트의 원소값이면 같은 값을 지우는것
		numbers.remove(1);
		System.out.println(numbers); // 인덱스 1번 위치의 원소를 삭제
		
		numbers.remove(Integer.valueOf(1)); //메서드로 호출할때는 서로 다른거 객체를 불러오는것이니 1 이라는 숫자를 지우는것, 같은 객체를 지우는것
		System.out.println(numbers); // 저장된 원소들 중에서 1을 찾아서 삭제.
		// 숫자만 넣으면 인덱스 , valueOf는 그 타입의 객체를 찾아서 지우는 것!! 
		
		
		
	}

}
