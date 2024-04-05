package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크: 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스. 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용됨
		 * 주로 배열 대신 사용됨.
		 * 
		 * List(배열과 동일)
		 * - 값을 하나씩 저장
		 * - 순서를 보장 (index가 있음)
		 * - 중복 허용
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장하지 않음 (index 개념 X)
		 * - 중복을 허용하지 않음 (동일한 값이 입력되면 버려짐)
		 * 
		 * Map
		 * - 값을 2개씩 저장 key+value 쌍으로 저장
		 * - key: 중복 불가능 | value: 중복 가능
		 * - key가 중복되면 value는 덮어쓰게 됨
		 * - id와 pw처럼 하나의 자료를 묶어서 저장해야 할 때 사용
		 * 
		 * 배열은 기본자료형, 클래스 자료형으로 구성이 가능함
		 * int arr[], String arr[], Student arr[] 다 가능
		 * 
		 * Collection에서는 기본 자료형은 불가능함. 클래스 자료형만 구성 가능.
		 * 기본 자료형에 맞는 클래스 자료형을 사용하면 됨.
		 * int => Integer, String
		 * 나머지는 기본 자료형의 첫글자만 대문자로 변환하면 클래스 자료형이 됨.
		 * long => Long, byte => Byte, boolean => Boolean ...
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨.
		 * 
		 * List<클래스> 객체명 = new 구현 클래스<클래스명>();
		 * List => 구현 클래스 ArrayList, LinkedList
		 * 
		 * ArrayList : 검색 시 유리 (배열과 가장 비슷!)
		 * - 미리 길이를 지정하지 않음. 추가되면 늘어나고, 삭제되면 줄어듦.
		 * - 추가, 삭제가 쉽다. 검색이 쉬움. (검색 속도가 빠름)
		 * 
		 * LinkedList : 추가, 삭제가 많을 때 유리
		 * - 값을 중간에 끼워넣거나 빼는 것이 쉬움.
		 * - 검색이 느리다.
		 * */
		List<Integer> list = new ArrayList<Integer>(); //부모를 기준으로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //자식 기준으로 생성
		ArrayList list2 = new ArrayList(); //object로 생성
		ArrayList<Integer> list3 = new ArrayList<>();
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		//get(index) : index번지의 요소를 가져오
		System.out.println(list.get(0));
		
		//set(index, 값) : index번지의 값을 변경하기
		list.set(0, 5);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list);
		
		
		System.out.println("-----for문 활용하여 list 전체번지 출력-----");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//size() : 총 개수를 확인
		System.out.println(list.size());
		
		//문자열을 담을 수 있는 ArrayList 생성
		//문자열 5개 저장한 후 출력.
		//총 개수가 몇 개인지 출력
		
		List<String> sList = new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		sList.add("c");
		sList.add("d");
		sList.add("e");
		System.out.println(sList);
		System.out.println(sList.size());
		
		//for문
		for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		//향상된 for문
		for(String s:sList) {
			System.out.println(s);
		}
		
		//list1에 1-10까지 값을 지정한 후 출력
		for(int i=0; i<10; i++) {
			list1.add(i+1);
		}
		System.out.println(list1);
		
		
		//0번지 값을 7로 변경 후 출력
		list1.set(0, 7);
		System.out.println(list1);
		
		//remove(index) : index 번지의 값을 삭제
		//remove(object) : object의 요소를 삭제
		list1.remove(0);
		System.out.println(list1);
		Integer a= 9;
		list1.remove(a);
		System.out.println(list1);
		
		//contains(object) : list에 값이 있는지 검사 / true,false로 리턴
		System.out.println(list1.contains(a));
		
		
		//clear() : list를 비움 (요소 전부 삭제)
		list1.clear();
		System.out.println(list1);
		
		//isEmpty() : 리스트가 비어있는지 체크 / true,false로 리턴
		System.out.println(list1.isEmpty());
		
		//ArrayList number를 생성 : 숫자를 저장하는 리스트
		//1~10까지 저장 후 출력 (향상된 for문을 이용하여 출력)
		ArrayList<Integer> number = new ArrayList<>();
		for(int i=0; i<10; i++) {
			number.add(i+1);
		}
		for(int i :number) {
			System.out.print(i+" ");
		}
		
		System.out.println("-----------------");
		
		/* Iterator : index가 없는 값을 출력하기 위해 사용 (set/map)
		 * list에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 번지에 접근 가능
		 * set / map은 순서를 보장하지 않기 때문에 일반 for문을 사용할 수 없음.
		 * 향상된 for, Iterator를 사용
		 * 순서와 상관없이 값을 가져올 수 있는 구문을 사용해야 함.
		 * map은 향상된 for, Iterator 둘  다 직접 사용 불가능.
		 * */
		System.out.println(">> Iterator 출력 ");
		Iterator<Integer> it = number.iterator();
		while(it.hasNext()) { //hasNext() : 다음 요소가 있는지 check, true/false 로 리
			Integer tmp = it.next(); //next() : 다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//indexOf(값) : 해당 값이 list에 index반환 / 없다면 -1 리턴
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		//number 리스트를 비우고, 값을 무작위로 5개만 추가
		number.clear();
		number.add(24);
		number.add(98);
		number.add(66);
		number.add(12);
		number.add(43);
		System.out.println(number);
		
		//정렬
		//Collections.sort() 오름차순만 가능.
		Collections.sort(number);
		System.out.println(number);
		
		//sort(Comparator를 구현한 객체)
		//Comparator 인터페이스를 구현한 구현체를 넣어야 함. (익명클래스 사용)
		//compareTo 메서드를 구현하여 객체를 정렬
		//-compareTo : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1 리턴
		number.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : 오름차순 / o2-o1 : 내림차순
				//결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할
				return o2-o1;
			}
		});
		System.out.println(number);
	}

}
