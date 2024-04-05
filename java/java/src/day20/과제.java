package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 여행사 상품이 있습니다.
		 * 여행 비용 15세 이상 - 100만원, 15세 미만 - 50만원
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용 계산 -> 출력
		 * 2. 고객 명단 검색 -> 출력
		 * 3. 고객 클래스를 생성하고 ArrayList로 고객 관리
		 * 
		 * ex) 고객 정보 -> 고객 명단
		 * 이름: 이순신, 나이: 40살, 비용: 100만원
		 * 이름: 신사임당, 나이: 35살, 비용: 100만원
		 * 이름: 홍길동, 나이: 10살, 비용: 50만원
		 * 총 여행 경비: 250만원
		 * 
		 * 20대 이상 고객 명단 -> 이름순으로 정렬
		 * 이름: 신사임당, 나이: 35살, 비용: 100만원
		 * 이름: 이순신, 나이: 40살, 비용: 100만원
		 * */
		
		ArrayList<Tour> list = new ArrayList<>();
		list.add(new Tour("신형만", 40,100));
		list.add(new Tour("봉미선", 35,100));
		list.add(new Tour("신짱구", 5,50));
		
		list.stream()
		.forEach(n->{
			String name=n.getName();
			int age=n.getAge();
			int cost=n.getCost();
			System.out.println("이름: "+name+" | 나이: "+age+"세 | 비용: "+cost+"만원");
			
		});
		
		
		//원하는 요소만 출력
		//name만 출력
//		list.stream()
//		.map(m->m.getName())
//		.forEach(n->System.out.println(n));
		
		int sum = list.stream()
		.mapToInt(n->n.getCost()).sum();
		System.out.println("여행 비용 총 합계: "+sum+"만원");
		
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("- - - - 20대 이상 고객 명단 - - - -");
		Tour t= new Tour();
		list.stream()
		.filter((n->n.getAge()>=20))
//		.sorted(new Comparator<Tour>() {
//			
//			@Override
//			public int compare(Tour o1, Tour o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		})
		
		//기존 클래스 자체에 정렬 구현되어있으면 list.sort(객체)나 컬렉션.sort -> 매개변수 1개
		//로 구현 가능, 안되어 있으면 위쪽 주석처리된 컴패라토 사용 -> 매개변수 2개
		//익명 클래스 사용할 경우 Comparator
		//클래스 내부에서 구현할 경우 Comparable
		
		
		.forEach(n->{
			String name=n.getName();
			int age=n.getAge();
			int cost=n.getCost();
			System.out.println("이름: "+name+" | 나이: "+age+"세 | 비용: "+cost+"만원");
		});
		
		
	
	}
		
		
		
	}


