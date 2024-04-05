package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * .
		 * .
		 * 
		 * map에 저장 후 출력
		 * */
		
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner (System.in);
		for(int i=0; i<5; i++) {
			System.out.println("영단어를 입력하세요.");
			String eng = scan.next();
			System.out.println("단어의 뜻을 입력하세요.");
			String kor = scan.next();
			map.put(eng, kor);
			if(map.size()==5) {
				System.out.println("---단어장---");
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+" : "+map.get(key));	
				}
			}
		}
		scan.close();
	}

}
