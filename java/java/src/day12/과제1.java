package day12;

public class 과제1 {
	/* 학생 정보를 관리하기 위한 클래스
	 * -학생 기본 정보: 이름, 생년월일, 전화번호, 나이
	 * -학원 정보: 학원명: "EZEN"(final static), 지점
	 * -수강 정보: 수강과목, 기간
	 * => 여러 과목을 들을 수 있음. (여러과목 수강하기 위해서는 매열로 처리. 5과목까지 가능)
	 * 
	 * ex) 홍길동 000101 010-1111-1111 25
	 * 	   EZEN(인천)
	 * 	   자바(6개월), 파이썬(1개월), 빅데이터(3개월)
	 * 기본 메서드 getter/setter/toString
	 * 
	 * 기능 (메서드)
	 * -학생 기본정보만 출력하는 기능 ㅇ
	 * -학원 정보만 출력하는 기능 ㅇ
	 * -수강 정보만 출력하는 기능 ㅇ
	 * -학생의 수강정보를 추가하는 기능
	 * */

	public static void main(String[] args) {
		
		Student st= new Student();
		st.setName("홍길동");
		st.setPhone("010-1111-1111");
		st.printInfo();
		st.printCompany();
		st.printCouse();
		
		Student st1=new Student("hong","010-2222-2222","incheon");
		st1.printInfo();
		st1.printCompany();
		st1.insertCourse("java", "5개월");
		st1.insertCourse("html", "1개월");
		st1.printCouse();
		
		Student st2=new Student("park","000101","010-3333-3333",25,"seoul");
		st2.printInfo();
		st2.printCompany();
		st2.insertCourse("java", "5개월");
		st2.printCouse();
		
		Student st3=new Student("김미미","990108","010-4444-4444",26,"incheon");
		st3.insertCourse("java", "5개월");
		st3.insertCourse("포토샵", "1개월");
		
		Student st4=new Student("정민이","000804","010-5555-5555",25,"seoul");
		st4.insertCourse("피그마", "1개월");
		st4.insertCourse("포토샵", "1개월");
		st4.insertCourse("일러스트", "1개월");
		
		Student st5=new Student("이주하","000903","010-6666-6666",25,"busan");
		st5.insertCourse("C언어", "6개월");
		st5.insertCourse("html", "1개월");
		st5.insertCourse("자바스크립트", "3개월");
		st5.insertCourse("파이썬", "1개월");
		st5.insertCourse("java", "5개월");
		
		Student st6=new Student("최유나","980308","010-7777-7777",27,"incheon");
		st6.insertCourse("excel", "1개월");
		st6.insertCourse("포토샵", "1개월");
		
		Student st7=new Student("성현주","030808","010-8888-8888",22,"busan");
		st7.insertCourse("포토샵", "1개월");
		
		Student[] std=new Student[8];
		std[0]=st;
		std[1]=st1;
		std[2]=st2;
		std[3]=st3;
		std[4]=st4;
		std[5]=st5;
		std[6]=st6;
		std[7]=st7;
		
		System.out.println("--------------------------------------------------");
		String serchName = "이주하";
		//이주하 학생의 학생 정보, 학원정보, 수강정보 출력
		System.out.println("--"+serchName+"님의 검색 정보--");
		for(int i=0; i<std.length; i++) {
			if(serchName.equals(std[i].getName())) {
				std[i].printInfo();
				
			}
		}
		System.out.println("--"+serchName+" 학원 정보--");
		for(int i=0; i<std.length; i++) {
			if(serchName.equals(std[i].getName())) {
				std[i].printCompany();
			}
		}
		System.out.println("--"+serchName+" 수강 정보--");
		for(int i=0; i<std.length; i++) {
			if(serchName.equals(std[i].getName())) {
				std[i].printCouse();
			}
		}
		System.out.println();
		//인천지점의 학생들을 모두 검색하여 학생 정보만 출력
		String serchBranch="incheon";
		System.out.println("--"+ serchBranch +" 지점 학생 정보--");
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch()!=null) {
				if(serchBranch.equals(std[i].getBranch())) {
					std[i].printInfo();
				}
			}
		}
		System.out.println();
		//java과목을 수강하는 학생들만 검색하여 학생 정보/학원 정보 출력
		String serchCourse= "java";
		System.out.println("--"+serchCourse+" 과목 수강 학생 정보--");
		int cnt=0; //학생의 번지
		while(cnt<std.length) {
			for(int i=0; i<std[cnt].getCourse().length; i++) {
				if(std[cnt].getCourse()[i]!=null) {
					if(serchCourse.equals(std[cnt].getCourse()[i])) {
						std[cnt].printCompany();
						std[cnt].printInfo();
					}
				}
				
			}
			cnt++;
		}
	}
				
	
		
		
	}



class Student {
	//멤버변수 선언
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN";
	private String branch;
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //기간
	private int cnt; //배열의 index 처리용 cnt
	
	//멤버변수 선언 후 생성자->method 순서대로 
	//생성자
	public Student() {}
	
	public Student(String name, String phone, String branch) {
		this.name=name;
		this.phone=phone;
		this.branch=branch;

	}
	
	public Student(String name,String birth, String phone, int age, String branch) {
		this(name, phone, branch); //생성자 호출
		this.birth=birth;
		this.age=age;
	}
	
	//method
	public void printInfo() { //학생의 기본정보 출력
		System.out.println("--학생 정보--");
		System.out.println("이름: "+name+"("+age+"세,/"+birth+") "+phone);
		
		
	}
	public void printCompany() { //학원의 기본정보 출력
		System.out.println("--학원 정보--");
		System.out.println("학원명: "+COMPANY+" / "+branch+"지점");
		
}
	
	//수강정보 출력
	public void printCouse() {
		//cnt까지만 출력 => 추가되지 않은 값은 출력X
		if(course.length==0 || cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("과정: "+course[i]+" ("+period[i]+")");
		}
	}
	
	//수강정보 등록
	//insertCourse()
	//매개변수 course, period 주고 -> 배열에 추가
	//멤버변수에 있는 배열값을 추가시키는 것이고 리턴값은 없는것
	public void insertCourse(String course, String period) {
		//cnt=0 -> 아직 추가값이 없음.
		
		if(cnt>=5) {
			//배열을 늘려서 더 많은 수강을 받을 수도 있음. (배열복사)
			System.out.println("더이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt]=course;
		this.period[cnt]=period;
		cnt++;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
	
}