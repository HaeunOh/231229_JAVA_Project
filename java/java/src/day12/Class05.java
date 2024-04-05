package day12;

public class Class05 {

	public static void main(String[] args) {
		/* 생성자: 객체를 생성 시 값을 초기화하는 방법
		 * 1. 기본값: 기본으로 지정되는 값 ex) stirng=null / int=0
		 * 2. 명시적 초기값: 멤버변수를 선언함과 동시에 값을 지정하는 방법
		 * 	ex) private String name="홍길동";
		 * 3. 초기화블럭: {  } 멤버변수를 초기화
		 * 4. 생성자: 객체를 생성할 때 초기화해서 생성
		 * 
		 * 초기값의 우선순위
		 * 기본값=>명시적초기값=>초기화블럭=>
		 * */
		
		
//		EzenStudent s = new EzenStudent();
//		s.setName("홍길동");
//		s.setPhoneNum("010-1234-5678");
//		s.setSubject("개발자 교육과정");
//		s.print();
//		System.out.println("-----------");
//		System.out.println(s); //toString이 없으면 객체의 주소가 출력되고, 있으면 toString의 메서드가 출력됨.
//		
//		EzenStudent ez3 = new EzenStudent();
//		System.out.println(ez3);
//		
//		System.out.println("-----------");
		
		EzenStudent ez2 = new EzenStudent("인천","김하나","111","java");
		System.out.println(ez2);
		EzenStudent ez4 = new EzenStudent("인천","김둘","222","java");
		System.out.println(ez4);
		EzenStudent ez5 = new EzenStudent("인천","김셋","333","빅데이터");
		System.out.println(ez5);
		EzenStudent ez6 = new EzenStudent("인천","김넷","444","파이썬");
		System.out.println(ez6);
		EzenStudent ez7 = new EzenStudent("인천","김다섯","555","java");
		System.out.println(ez7);
		
		EzenStudent studentArr[]=new EzenStudent[5];
		studentArr[0]=ez2;
		studentArr[1]=ez4;
		studentArr[2]=ez5;
		studentArr[3]=ez6;
		studentArr[4]=ez7;
		
		//김셋 학생이 듣고 있는 과목을 출력
		//학생이 없으면 "명단이 없습니다" 출력
		String serchName = "김넷";
		System.out.println("--"+serchName+" 학생이 듣고 있는 과목--");
		for(int i=0; i<studentArr.length; i++) {
			if(serchName.equals(studentArr[i].getName())) {
				System.out.println(studentArr[i].getSubject());
				
			}
		}
		
		System.out.println("==============");
		//김둘 학생이 java를 들으려고 했는데 빅데이터로 바꿀것임.
		String modify = "김둘";
		for(int i=0; i<studentArr.length; i++) {
			if(modify.equals(studentArr[i].getName())) {
			studentArr[i].setSubject("빅데이터");
			System.out.println(ez4);
			
		}
}
		
		//자바를 듣고 있는 학생 명단을 출력
		String subject="한식 자격증";
		int cnt=0;
		System.out.printf("--"+subject+"를 듣는 학생 명단--%n");
		for(int i=0; i<studentArr.length; i++) {
			if(subject.equals(studentArr[i].getSubject())) {
				System.out.printf(studentArr[i]+"%n");
				
			}if(!subject.contains(studentArr[i].getSubject())){
				cnt++;
				}
			}
				if(cnt>0) {
					System.out.println("명단이 없습니다.");
		}

	}
	
}

class EzenStudent {
	//학생의 정보를 생성하는 클래스
	private String gigum = "incheon"; //명시적초기값
	private String name;
	private String phoneNum;
	private String subject;
	
	public EzenStudent(String gigum, String name, String phoneNum, String subject) {
		//super();
		this.gigum = gigum;
		this.name = name;
		this.phoneNum = phoneNum;
		this.subject = subject;
	}
	public void print() {
		System.out.printf("학생 이름: "+name+"%n전화번호: "+phoneNum+"%n상담 과목: "+subject);
	}
		
	public EzenStudent(String name, String phoneNum, String subject) {
		//super(); //내 부모클래스의 생성자 호출 //상속과 관련됨
		this.name = name;
		this.phoneNum = phoneNum;
		this.subject = subject;
	}
	
	{
		//초기화블럭영역
		gigum="인천";
		name="미상";
		subject="미정";
		phoneNum="000";
		
	}
	//toString(); => 클래스 내부마다 기본으로 주는 출력메서드, print메서드와 같은 의미
	@Override //부모클래스를 내가 다시 만들어 쓰는것.. //상속과 관련됨
	public String toString() {
		return gigum +">이름:" + name + " / 전화번호:" + phoneNum + " / 수강과목:" + subject ;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String string) {
		this.phoneNum = string;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}