package studentManager2;

import java.util.Scanner;

public class Manager implements Program{

	//학생의 배열값을 멤버변수로 추가
	private Student[] StudentList = new Student[5];
	//배열이 멤버변수 일때는 index 처리 변수 있어야 함 
	private int stdCnt;
	
	@Override
	public void printStudent() {
		System.out.println("---------전체 학생 정보---------");
		for(int i=0; i<stdCnt; i++) {
			StudentList[i].stdPrint(); //학생 정보 출력 메서드 호출
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		//1명의 학생 정보를 입력받아서 객체를 생성한 후 studentList에 추가
		System.out.println("학번 >");
		String stdNum = scan.next();
		System.out.println("이름 >");
		String name = scan.next();
		System.out.println("전화번호 >");
		String stdPhone = scan.next();
		
		//입력받은 값을 객체로 생성
		Student s = new Student(stdNum, name, stdPhone);
		
		//배열이 다 찼을 경우 배열복사!
		if(stdCnt==StudentList.length) {
			Student[] tmp= new Student[StudentList.length+5];
			System.arraycopy(StudentList, 0, tmp, 0, stdCnt);
			StudentList = tmp;
		}
		StudentList[stdCnt]=s;
		stdCnt++;
		
	}

	@Override
	public void serchStudent(Scanner scan) {
		//검색할 학생 이름을 입력받아 배열에서 탐색 후 있으면,
		//->학생 정보와 수강 정보를 출력
		System.out.println("검색할 학생명을 입력 >");
		String serchName=scan.next();
		
		//배열 탐색
		for(int i=0; i<stdCnt; i++) {
			if(serchName.equals(StudentList[i].getSdtName())) {
				StudentList[i].stdPrint();
				StudentList[i].subPrint();
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		//누가, 무슨과목을 추가할지 설정
		//수강 신청할 학생 이름과 과목 입력받고 
		System.out.println("수강신청 학생명 >");
		String name=scan.next();
		int index = -1; //학생의 번지를 저장하기 위한 변수
		//학생의 위치 탐색 후 그 학생의 배열에 수강과목 추가
		for(int i=0; i<stdCnt; i++) {
			if(name.equals(StudentList[i].getSdtName())) {
				index=i;
				break;
			}
		}
		//학생이 없다면...
		if(index == -1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		
		
		//수강과목의 객체를 생성 
		System.out.println("수강신청할 과목명 >");
		String sName = scan.next();
		Subject s = new Subject(sName);
		//Student(수강신청 한 학생) 클래스의 insertSubject 호출 -> 해당 배열에 추가!
		StudentList[index].insertSubject(s);
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		//수강철회
		//누가, 무슨과목을 삭할지 설정
				//수강 삭제할 학생 이름과 과목 입력받고 
				System.out.println("수강삭제 학생명 >");
				String name=scan.next();
				int index = -1; //학생의 번지를 저장하기 위한 변수
				//학생의 위치 탐색 후 그 학생의 배열에 수강삭제과목 추가
				for(int i=0; i<stdCnt; i++) {
					if(name.equals(StudentList[i].getSdtName())) {
						index=i;
						break;
					}
				}
				//학생이 없다면...
				if(index == -1) {
					System.out.println("학생 정보가 없습니다.");
					return;
				}
				
				
				//수강삭제과목의 객체를 생성 
				System.out.println("수강삭제할 과목명 >");
				String sName = scan.next();
				//해당학생의 수강철회 메서드 호출
				StudentList[index].deleteSubject(sName);
		
	}

}
