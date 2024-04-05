package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림)
		 * 	-실제 입력 / 출력이 표현된 데이터의 이상화된 흐름
		 * 	-스트림은 자료에 대한 스트림을 생성하여 연산
		 *  -그 연산을 다 수행하면 스트림은 소모됨.
		 *  -스트림 연산은 기존 자료에 변경을 유발하지 않음.
		 *  -스트림은 기존 자료를 복사하여 복사본을 연산에 사용.
		 *  -중간연산관 최종연산으로 구분됨.
		 *  -중간연산은 메서드를 이어서 사용할 수 있음.
		 *  	-distinct():중복 제거
		 *  	- filter(): 조건에 맞는 값만 다음 스트림으로 넘김
		 *  	- limit(): 스트림의 일부를 잘라냄
		 *  	- skip(): 스트림의 일부를 건너뜀,
		 *  	- peek(): 작업 수행
		 *  	- sorted() : 정렬 ...
		 *  
		 *  -최종연산은 마지막에만 가능.
		 *  	-forEach()
		 * 	 	-count() 
		 * 		-sum()
		 *  	-allMatch(): 스트림 요소가 전부 일치하는지
		 *  	-anyMatch(): 스트림 요소가 하나라도 일치하는지
		 *  	-toArray(): 배열로 변환
		 *  	-collect(): 스트림 요소를 수집
		 *   
		 *  
		 * */
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i=0; i<=arr.length; i++) {
			sum+=i;
		}
			System.out.println(sum);
			
			System.out.println("--스트림을 이용한 sum--");
			int total = Arrays.stream(arr).sum();
			System.out.println(total);
			
			System.out.println("--스트림을 이용한 cnt--");
			long cnt = Arrays.stream(arr).count();
			System.out.println(cnt);
			
			System.out.println("--스트림을 이용한 avg--");
			//exception 처리를 미리 완료한 패키지
			OptionalDouble avg=Arrays.stream(arr).average();
			System.out.println(avg);
			
			//arr값 중 5 이상의 값만 합계
			System.out.println("--중간연산 filter--");
			int s5 = Arrays.stream(arr).filter(n-> n>=5).sum();
			System.out.println(s5);
			System.out.println();
			
			//점수 배열을 생성한 후 70점 이상만 합계, 평균 나타내기
			//가장 높은 점수 출력
			int[] score = {40,60,74,90,20,99,83};
			int s70=Arrays.stream(score).filter(n->n>=70).sum();
			OptionalDouble a70=Arrays.stream(score).filter(n->n>=70).average();
			OptionalInt max=Arrays.stream(score).max();
			System.out.println("70점 이상 합계: "+s70);
			System.out.println("70점 이상 평균: "+a70);
			System.out.println("가장 높은 점수: "+max);
			System.out.println();
			
			ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(3);
			list.add(3);
			list.add(3);
			list.add(4);
			list.add(2);
			list.add(2);
			list.add(2);
			list.add(2);
			list.add(7);
			list.add(5);
			list.add(5);
			list.add(8);
			list.add(6);
			System.out.println("list를 stream 구성");
			list.stream().forEach(n->System.out.print(n+" "));
			System.out.println();
			System.out.println("--distinct() : 중복 제거--");
			list.stream().distinct().forEach(n->System.out.print(n+" "));
			System.out.println();
			System.out.println("--sorted() : 정렬--");
			list.stream().sorted().forEach(n->System.out.print(n+" "));
			System.out.println();
			System.out.println("--중복 제거 후 정렬--");
			list.stream().distinct().sorted().forEach(n->System.out.print(n+" "));
			System.out.println();
			
			System.out.println();
			System.out.println("--스트림 객체 생성--"); //일회용
			Stream<Integer> s1 = Stream.of(10,20,40,50,90,30);
			System.out.println("--합계--");
			//map : 스트림 변환에 사용하는 중간연산
			//mapToInt : map의 값을 int로 변환
			int s = s1.mapToInt(n->n.intValue()).sum();
			System.out.println(s);
			//s1.forEach(n->System.out.print(n+" ")); //error : 이미 소모한 스트림은 재사용을 못함
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
