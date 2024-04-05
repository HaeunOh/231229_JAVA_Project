package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 (Scanner) map에 저장 후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복 (1=계속 / 0= 종료)
		 * 과목과 점수를 입력해주세요 > 
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력
		 * */

		Scanner scan = new Scanner(System.in);
		int num=1;
		int sum=0;
		double avg=0;
		int cnt=0;
		
		while(num!=0) {
			System.out.println("과목과 점수를 입력해주세요.");
			String sub = scan.next();
			cnt++;
			int score = scan.nextInt();
			System.out.println("계속 입력하시려면 1을, 종료하시려면 0을 눌러주세요.");
			num=scan.nextInt();
			HashMap<String, Integer> map = new HashMap<>();
			map.put(sub, score);
			sum+=score;
			avg=sum/cnt;
			
		}
		
		System.out.printf("과목 점수 합계: "+ sum+"%n과목 평균: "+avg+"");
		scan.close();
		
	}

}
