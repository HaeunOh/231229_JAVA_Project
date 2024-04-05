package day01;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카페에 제출
		/*국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 평균은 소수점을 살려서 출력
		 * 조건선택연산자를 이용해서 평균이 80점 이상이면 합격, 아니면 불합격으로 결과출력*/
		
		 int kor=78;
		 int eng=45;
		 int math=56;
		 
		 int sum=kor+eng+math;
		 double avg=(double)sum/3;
		 
		 System.out.println("합계"+sum+"평균"+avg);
		 System.out.println("결과:"+(avg>=80? "합격":"불합격"));
		 
		 //조건선택연산자 = if문으로 변경
		 
		 if(avg>=80) {
			 System.out.println("결과:합격");
		 }else {
			 System.out.println("결과:블합격");
		 }
		 
	}

}
