package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* set 중복 저장 x
		 * set 로또번호 6개 생성 후 출력
		 * 랜덤번호 1~45
		 * */
		HashSet<Integer> lotto = new HashSet<Integer>();
		int ran=(int)(Math.random()*45)+1;
		//6번 생성 -> 중복 발생 가능성.
		//set.size()가 6이 될때까지, set이 6개 찰 때까지...
		while(lotto.size()<6) {
			int random = new Random().nextInt(45)+1; //Math.random 말고도 java 제공 메서드를 이용해 랜덤수 받기
			lotto.add(random);
		}
		System.out.println(lotto);
		System.out.println("---------------------------");
		
		//TreeSet: set 중에서 정렬이 되는 set
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(treeSet.size()<6) {
			int random = new Random().nextInt(45)+1; 
			treeSet.add(random);
		}
		System.out.println(treeSet); //자동 오름차순 정렬
		
		//first() 가장 앞에 있는 값 / last() 가장 뒤에 있는 값
		//TreeSet이 가지고 있는 고유의 메서드. 부모가 Set이어도 쓸 수 없음.
		System.out.println("first(): "+treeSet.first()); 
		System.out.println("last(): "+treeSet.last());
		
		//headSet(지정한 값): 지정한 값보다 작은 값
		//tailSet(지정한 값): 지정한 값보다 큰 값
		System.out.println("headSet(): "+treeSet.headSet(15));
		System.out.println("tailSet(): "+treeSet.tailSet(15));
		
		//subSet() : 검색 범위 지정 (뒤쪽 값은 미포함)
		System.out.println("subSet(): "+treeSet.subSet(15, 30)); //15는 포함, 30은 미포함
		
		
	}
}
