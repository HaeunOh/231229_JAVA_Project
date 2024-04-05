package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 List 생성
		 * 출력: for / 향상된 for / Iterator 3가지 출
		 * */
		
		ArrayList <String> daily = new ArrayList<>();
		daily.add("기상");
		daily.add("샤워하기");
		daily.add("식사");
		daily.add("공부하기");
		daily.add("운동");
	
		for(int i=0; i<daily.size(); i++) {
			System.out.print(daily.get(i)+" / ");
		}
		System.out.println();
		
		for(String s:daily) {
			System.out.print(s+" / ");
		}
		
		System.out.println();
		Iterator<String> st = daily.iterator();
		while(st.hasNext()) {
			String tmp = st.next();
			System.out.print(tmp+" / ");
			}
		System.out.println();
		
		
		//정렬
		Collections.sort(daily);
		System.out.println(daily);
		
		daily.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 크다/작다를 이용 -/+ 값이 출력
				// 문자는 compareTo 메서드를 활용하여 정렬
				// o1.compareTo(o2); : 오름차순
				return o2.compareTo(o1);
			}
			
		});
		 	System.out.println(daily);

	}

}
