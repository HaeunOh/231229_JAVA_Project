package day11;

/* CardPack 클래스
 * - ♥1~♥K / ◆1~◆K / ♣1~♣K / ♠1~♠K
 * - 총 카드수 52장
 * - 52장의 카드 한묶음 (배열)
 * 
 * - 카드 출력 기능 - Card class print() 사용
 * - 카드 초기화 기능 (CardPack 생성자)
 * - 카드 한 장을 빼내는 기능 => 출력 print() 사용
 * - 카드 섞는 기능 
 *  */
public class CardPack {
   //카드 52장이 들어갈 수 있는 배열 생성
	private Card[] pack = new Card[52];
	private int cnt=0; // 카드 배열의 index 위치를 체크하기 위한 변수
	
	public CardPack() {
		//CardPack 클래스를 생성하면 52장의 카드가 (자동 기본값으로) 생성되어야 함
		//-숫자: 1~10,11(J),12(Q),13(K)
		//-모양: ♥,◆,♣,♠
		char shape='♥';
		for(int i=1; i<=4; i++) { //4가지 모양을 넣기 위한 for문
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='◆'; break;
			case 3: shape='♣'; break;
			case 4: shape='♠'; break;
			}
			for(int j=1; j<=13; j++) { //13까지 숫자를 넣기 위한 for문
				Card c=new Card();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt]=c;
				cnt++; //52
			}
		}	
	}
	//카드를 섞는 기능
	//shuffle()
	//리턴타입:void
	//매개변수:()
	
	public void shuffle() {
		int min=0;
		int max=pack.length;
		for(int i=0; i<pack.length; i++) {
			int random=(int)(Math.random()*max)+min;
			Card temp=pack[i];
			pack[i]=pack[random];
			pack[random]=temp;
			//cp.getPack() [cnt].print();
			
		}
	}
	
	//카드 한장 빼내는 기능
	//pick()
	//리턴타입:Card가 리턴되어야 함
	//매개변수:()
	
 public Card pick() {
	 	if(cnt==0) {
	 		return null; //더이상 cnt를 줄이지 말라는 의미
	 	}
		cnt--;
		return pack[cnt]; //51번지 (마지막 번지) 를 계속 찍어주는 것
	}
	
	
	
	
	
	public void init() {
		cnt=52;
	}
	
	
	

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
}
