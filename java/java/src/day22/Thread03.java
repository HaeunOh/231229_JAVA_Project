package day22;

class Sum extends Thread  {
	int start;
	int end;
	int total;
	
	
	public Sum(int start, int end) {
		this.start=start;
		this.end=end;
	}
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			this.total+=i;
			}
		System.out.println(Thread.currentThread().getName()+" = "+total);
		}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
		
		
	}
	
	

public class Thread03 {

	public static void main(String[] args) {
		//1~50 51~100까지의 합을 구하는 두개의 Thread를 생성
		//그 결과를 확인
		
		//두 개의 Thread가 실행되고 난 후
		//Thread1 1~50개의 합계 출력
		//Thread2 51~100의 합계 출력
		//Thread1+Thread2 합계 출력
		Sum s = new Sum(1, 50);
		s.start();
		
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Sum s1 = new Sum(51, 100);
		s1.start();
		
		try {
			Thread.sleep(500); //0.5초 기다렸다가 실행, 1/1000초로 실행됨
			s1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "Thread-0 + Thread-1 = " + (s.getTotal()+s1.getTotal()));
		
		
		

	}

}
