package day03;


public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 약수: 1부터 자기자신까지 나누어서 떨어지는 수
		 * ex) 6의 약수: 6/1=0, 6/2=0, 6/3=0, 6/4=2, 6/5=1, 6/6=0 //모든 수는 1과 자기 자신을 약수로 갖는다.
		 * => %로 구하면 됨: 1,2,3,6
		 * 12의 약수: 1,2,3,4,6,12
		 * 
		 * 두 수의 공약수: 1,2,3,6 (공통된 약수)
		 * 최대공약수: 6 (공약수 중 가장 큰 수)
		 * */
		
		
		int num1=6;
		int num2=12;
		int gcd=0;
		
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		
				//break;
				/*반복문에서 조건이 맞다면 반복문을 빠져나오는 역할.
				 *중첩 for문일 경우 break는 나를 감싸고 있는 for문을 벗어남.
				 *for문 앞에 이름을 붙여줄 수 있음.
				 * */
				
				for(int i=num1;; i--) {
					if(num1%i==0 && num2%i==0) {
						System.out.println(i);
						break;
					}
				}
			int i =0;
			a: for(;;) {
				 for(;;) {
					for(;;) {
						i++;
						if(i==10) {
							System.out.println(i);
							break a;
						}
					}
				}
			}
			
		
			
		
	}
}

	
	


