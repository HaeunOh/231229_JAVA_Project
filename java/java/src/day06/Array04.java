package day06;

public class Array04 {




	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열 생성
		 * 1~50사이의 랜덤수를 배열에 저장
		 * 합계, 평균, 최대, 최소 출력
		 * */
		
		int arr1[]=new int[10];
		
		for (int i=0; i<arr1.length; i++) {
			int ran = (int)(Math.random()*50)+1;
			arr1[i]=ran;
			System.out.print(arr1[i]+" ");
		} 
		
		int sum = 0;
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i]>max) {
				max=arr1[i];
						}
			if(arr1[i]<min) {
							min=arr1[i];
						}
			sum=sum+arr1[i];	
		}
		double avg=sum/(double)arr1.length;
		
		 System.out.println();
		 System.out.println("합계:"+sum); 
		 System.out.println("평균:"+avg);
		 System.out.println("최대값:"+max);
		 System.out.println("최소값:"+min); 
			

	}

}
