package day20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력
		 * -중복값 제거
		 * -정렬 후 출력
		 * */

		int[] arr= {1,8,4,5,7,8,9,6,5,4,1,2,3,6,8,2,4};
				Arrays.stream(arr)
				.filter(a->a%2==0)
				.distinct()
				.sorted()
				.forEach(a -> System.out.print(a + " "));
				
				System.out.println();
				
		
		//배열로 리턴
		int[] result = Arrays.stream(arr)
				.filter(a->a%2==1)
				.sorted()
				.distinct()
				.toArray();
		
		for(int tmp:result) {
			System.out.print(tmp+" ");
		}
		
		
	}
}
