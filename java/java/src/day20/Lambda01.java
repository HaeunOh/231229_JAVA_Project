package day20;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		 /* Lambda + Stream => 람다와 스트림
		/* lambda: 람다식 (식을 단순하게 표현하는 방법)
		* 	외부 자료의 부수적인 영향(side effect)를 주지 않도록 구현하는 방식
		 * 
		 * Stream: 자료의 대상과 관계 없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 	-메서드 체이닝 기법을 사용
		 * 
		 * lambda functions: 람다함수 => 익명클래스를 사용하여 쓰는 함수
		 * 람다의 장점: 코드의 간결성, 병렬처리 가능, 불필요한 연산 최소화
		 * 람다의 단점: 가독성이 떨어짐, 반복문 사용시 성능 저하
		 * 
		 * -람다의 표현식
		 * (매개변수) -> {구현};
		 * 
		 * @매개변수가 1개면 () 생략 가능
		 * x->{return x+!};
		 * 
		 * @return이 없으면 {} 생략 가능 //return이 있는데 {}생략한다면 오류남
		 * x->x+1;
		 * x-> return x+1; // error
		 * 
		 * (x,y)->x+y;
		 * (x,y)->{return x+y};
		 *  x,y->x+y; // 매개변수가 2개 이상일 때 ()생략할 시 error
		 *  
		 *  
		 * */
		
		ArrayList<Integer> list = new ArrayList <>();
		list.add(30);
		list.add(70);
		list.add(50);
		list.add(90);
		list.add(80);
		list.add(20);
		list.add(60);
		list.add(10);
		
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("---------람다식 처리-----------");
		list.forEach(n->{
			System.out.print(n+" ");
		});
		System.out.println();
		
		//람다 함수 (익명 함수)
		System.out.println("-----consumer 를 활용한 출력-------");
		Consumer<Integer> method = (n)->{
			System.out.print(n+" ");
		};
		
		list.forEach(method);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
	}

}
