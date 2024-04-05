package day20;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		//map을 구성하여 forEach를 사용하여 출력
		HashMap<String,Integer> map=new HashMap<>();
		map.put("길동", 89);
		map.put("철수", 70);
		map.put("짱구", 95);
		map.put("수지", 75);
		map.put("맹구", 50);
		
		map.forEach((s,i)->{
			System.out.printf(s+":"+i+"%n");
		});
		
		System.out.println("---함수형 인터페이스를 람다식으로 구현---");
		
		Number sum = (a, b)->{ //함수 구현
			return a+b; 
		};
		
		int hap = sum.add(50, 60);
		
		System.out.println(sum.add(100, 200));
		System.out.println(hap);
		
		Number max = (a,b)->(a>=b)? a:b; // 함수 구현
		System.out.println(max.add(50, 90));
		
	}

}


//함수형 인터페이스 생성
//메서드가 반드시 1개여야만 함.

@FunctionalInterface
interface Number{
	int add(int a, int b);
	//int max(int a, int b); //메서드가 2개면 error
}
