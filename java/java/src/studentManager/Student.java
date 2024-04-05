package studentManager;
/* -Students class : 한 학생의 정보를 저장하는 클래스
	-학번, 이름, 나이, 전화번호, 주소, 수강과목
	-멤버변수, 생성자, getter/setter, toString
	-멤버변수에 학생이 듣고자하는 과목을 저장 Subject[]
	-메서드
		-학생정보 출력 메서드 //내 정보만 출력하는 기능, interface에 있는 기능과 다름
		-수강과목 추가 메서드
		-수강과목 삭제 메서드
		-수강과목 출력 메서드
 * */
class Student {
	private int sdtNum;
	private String name;
	private int age;
	private String phone;
	private String adress;
	private Subject[] course = new Subject[5];
	private int cnt;
	
	public Student() {}
	
	public Student(String name, int sdtNum) {
		this.name=name;
		this.sdtNum=sdtNum;
	}
	public Student(int sdtNum, String name, int age, String phone, String adress) {
		this.sdtNum=sdtNum;
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.adress=adress;
		
		
	}
	
	public void insertStudent(String name, int sdtNum, int age, String phone, String adress) {
		this.sdtNum=sdtNum;
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.adress=adress;
		
		
	}
	
	public void insertCourse (Subject sb) {
		if(cnt>=5) {
			System.out.println("더이상 수강하실 수 없습니다.");
			
		}else
		
		course[cnt]=sb;
		cnt++;
	}
	
	public void printSub() {
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}for(int i=0; i<cnt-1; i++) {
			System.out.println("수강 과목:"+course[i]);
		}
	}
	
	public void printInfo() {
		System.out.println("-- 학생 정보 --");
		System.out.printf("이름(학번):"+name+"("+sdtNum+")"+"/ 나이:"+age+"세"+"%n전화번호: "+phone+"%n거주지: "+adress+"%n");
		printSub();
				
	}
	
	public void deleteSub(String subjectName) {
		for(int i=0; i<cnt; i++) {
			if(course[i].getName().equals(subjectName)) {
				for(int j=i; j<cnt-1; j++) {
					course[i]=course[j+1];
				}
				cnt--;
				break;
			}
		}
	}

	public int getSdtNum() {
		return sdtNum;
	}

	public void setSdtNum(int sdtNum) {
		this.sdtNum = sdtNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Subject[] getCourse() {
		return course;
	}

	public void setCourse(Subject[] course) {
		this.course = course;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
