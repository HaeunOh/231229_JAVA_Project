package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고, 출력
		 * 합계를 출력
		 * 입력: 34,34,87,32,67,99,23,56 => String
		 * list에 넣고 출력 => 합계 (인원수) 출력
		 * 70점 이상 점수 개수 출력
		 * 
		 * 숫자를 어떻게 list에 넣을 것인지, 문자를 숫자로 어떻게 바꿀 것인지?
		 * */
		
		//배열을 list로 구성할 때
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		//String num = "34,76,87,80,67,99,50,56,89";
		Scanner scan = new Scanner(System.in);
		ArrayList <String> list = new ArrayList<>();
		int sum=0;
		int cnt=0;
		String close=null;
		while(true) {
			System.out.println("점수를 입력해주세요.");
			list.add(scan.next());
			System.out.println("계속 입력:y | 종료:n");
			close=scan.next();
			if(close.equals("n")) {
				break;
			}
		}
		for(int i=0; i<list.size(); i++) {
			sum+=Integer.parseInt(list.get(i));
			if(Integer.parseInt(list.get(i))>70) {
				cnt++;
			}
		}
		System.out.println(list);
		System.out.println("인원 수: "+list.size()+"명");
		System.out.println("점수 합: "+sum+"점");
		System.out.println("점수가 70점 이상인 사람은"+cnt+"명");
		scan.close();
		

	}
}
