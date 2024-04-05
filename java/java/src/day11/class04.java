package day11;

public class class04 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * 멤버변수: brand, power, ch, vol
		 * 메서드: 
		 * power()
		 * power가 켜지면 "Tv가 켜졌습니다." / 꺼지면 "Tv가 꺼졌습니다."
		 * 
		 * chUp()
		 * 채널 1씩 증가, 채널은 0~20번까지 있음. 20이 넘어가면 다시 0번으로 순환구조
		 * 
		 * chDown()
		 * 채널 1씩 감소, 0번이 되면 20으로 올라가는 순환구조.
		 * 
		 * volUp() / volDown()
		 * 1씩 증가, 1씩 감소되는 기능. 0부터 10까지 있음. 0이면 '음소거' 라고 출력
		 * */
		
		Tv t=new Tv();
		t.power();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();	
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.power();
		
		

	}
	

	
}

class Tv { 				//초기값
	private final String BRAND = "LG"; //final은 변경할 수 없는 값을 지정
	//private String brand; //null
	private boolean power; //false
	private int ch; //0
	private int vol; //0
	
	
	
	public Tv() {
		
		this.vol=3;
	}
	
	
	public void power() {
		power = !power;
		if(power) {
			System.out.println("TV가 켜졌습니다.");
			printTvInfo();
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	
	public void printTvInfo() {
		System.out.println("TV 브랜드:"+BRAND+", 현재 채널:"+ch+"번, 현재 볼륨:"+vol);
	}
	
	public void chUp() { //기본값 0
		if(!power) {
			ch+=0;
			System.out.println("TV가 꺼져있습니다. 전원을 켜주세요.");
		}else if(power) {
			ch++;
			System.out.println("채널:"+ch);
		}if(ch>=20) {
			ch=-1;
		}
	}
	
	public void chDown() {
		if(!power) {
			ch-=0;
			System.out.println("TV가 꺼져있습니다. 전원을 켜주세요.");
		}else if(power) {
			ch--;
			System.out.println("채널:"+ch);
			
		}if(ch<=0) {
			ch=21;
		}
	}
	
	public void volUp() {
		if(!power) {
			vol+=0;
			System.out.println("TV가 꺼져있습니다. 전원을 켜주세요.");
		}else if(power) {
			System.out.println("볼륨:"+vol);
			vol++;
		}if(vol>10) {
			vol=10;
		}
	}
	
	public void volDown() {
		if(!power) {
			vol-=0;
			System.out.println("TV가 꺼져있습니다. 전원을 켜주세요.");
		}else if(power) {
			System.out.println("볼륨:"+vol);
			vol--;
		}if(vol<0) {
			vol=0;
			System.out.println("음소거");
		}
	}

	public String getBrand() {
		return BRAND;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
}