package day20;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		// add로 5명 추가
	
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("짱구", 80));
		list.add(new Student("철수", 78));
		list.add(new Student("훈이", 60));
		list.add(new Student("맹구", 77));
		list.add(new Student("유리", 94));
		
		list.stream()
		.forEach(n->System.out.println(n));
		
		System.out.println("-------------------");
		list.stream()
		.forEach(n->{
			String name=n.getName();
			int score=n.getScore();
			System.out.println(name+":"+score);
		});
		
		//list의 점수 합계, 전체 인원수 출력
		int s = list.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("점수 합계: "+s+"점");
		
		long t = list.stream().mapToInt(n->n.getScore()).count();
		System.out.println("인원수: "+t+"명");
		
		
		
		
		
		
		//스트림을 이용하여 콘솔에 출력  ex) 홍길동: 98점
	}

}
