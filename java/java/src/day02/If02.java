package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*국어, 영어, 수학 점수를 입력받아
		 * 합계, 평균, 평가를 출력
		 * 평가는 
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값이므로 다시 입력하라고 출력하기*/
	
		Scanner scan = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 순서대로 점수를 입력해주세요.");
		
		int kor= scan.nextInt();
		int eng= scan.nextInt();
		int math= scan.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3;
		System.out.println("세 과목 점수의 합계는"+sum+"점 이고, 세 과목 평균 점수는"+avg+"점 입니다.");
		
		
		if(kor<0||kor>100) {
			System.out.println("국어 점수를 다시 입력해주세요.");
		}
		if(eng<0||eng>100) {
			System.out.println("영어 점수를 다시 입력해주세요.");
		}
		if(math<0||math>100) {
			System.out.println("수학 점수를 다시 입력해주세요.");
		}
	
		if (avg>=90) {
			System.out.println("A등급입니다.");
		} else if (avg>=80) {
			System.out.println("B등급입니다.");
		} else if (avg>=70) {
			System.out.println("C등급입니다.");
		} else {
			System.out.println("D등급입니다.");
		}
		if (avg>100||avg<0) {
			System.out.println("잘못된 성적입니다.");
		}
	
		scan.close();
		
	}

}
