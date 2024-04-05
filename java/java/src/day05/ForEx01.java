package day05;

import java.util.Scanner;

@SuppressWarnings("unused")
public class ForEx01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* 소수: 1과 자기자신만 약수로 가지는 수
		 * 소수: (1은 소수X) 3, 5, 7, 11, 13, 17, 19...
		 * 소수의 약수 (Only 1, 나 자신)
		 * 
		 * 숫자 하나를 입력받아서 해당 수가 소수인지 아닌지 판별
		 * num=13
		 * =소수입니다.
		 * 
		 * num=12
		 * =소수가 아닙니다.
		 * */
	
		/*	
		 * 
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요.");
		int num= scan.nextInt();
		int count=0;
		
	for(int i=2; i<=num; i++) { //i범위를 2부터 입력값 num직전 까지로 선언
			if(num%i==0) { //만약 num을 i로 나눴을 때 나눠진다면 = 1과 나 자신을 뺀 어떤 수라도 나눠지면
				System.out.println(num+"은(는) 소수가 아닙니다."); //소수가 아닌거고
				break;
			}
				System.out.println(num+"은(는) 소수입니다."); //1과 나 자신으로만 나눠지면 소수인것임
				break;
		}
		
		scan.close();
	}
}

		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}if (count==2) {
			System.out.println(num+"는 소수입니다.");
		}else {
			System.out.println(num+"는 소수가 아닙니다.");
		}
		scan.close();
		
		*/
		
		//2~100까지의 소수를 모두 출력하기
		
		int count=0;
		for(int i=2; i<=100; i++) {
				for(int j=2; j<=i; j++) {
				if (i%j==0) {
					break;
				}else {
					System.out.println(i+" ");
					count++; //count 위치 잘 체크하기
					break;
				}
			}if(count%5==0) {
				System.out.println();
			}
		} 
		
		
		
		
		
		
	}
}