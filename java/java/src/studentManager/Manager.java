package studentManager;

import java.util.Scanner;

public class Manager implements Program{

		Student st = new Student();
		Student[] s = new Student[10];
		String name;
		int cnt=0;
		
		
	@Override
	public void printStudent() {
		if(cnt==0) {
			System.out.println("등록된 학생이 없습니다. 학생 정보를 등록해주세요.");
		}
		for(int i=0; i<cnt; i++) {
			s[i].printInfo();
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		//학생 추가
		System.out.println("이름과 학번을 입력해주세요.");
		Student st1=new Student(scan.next(), scan.nextInt());
		s[cnt]=st1;
		cnt++;
		
		
	}

	@Override
	public void serchStudent(Scanner scan) {
		//학생 검색
		System.out.println("정보를 검색할 학생의 이름을 입력하세요.");
		name=scan.next();
		if(cnt==0){
		System.out.println("존재하지 않는 학생입니다.");
		}
		for(int i=0; i<cnt; i++) {
			if(name.equals(s[i].getName())) {
				s[i].printInfo();
			}else {
				System.out.println("존재하지 않는 학생입니다.");
			}
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		//수강신청
		System.out.println("수강할 학생의 이름을 입력하세요.");
		name=scan.next();
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				System.out.println("과목명, 과목코드를 순서대로 입력하세요.");
				Subject s1 = new Subject(scan.next(),scan.nextInt());
				s[i].insertCourse(s1);
				System.out.println("등록되었습니다.");
			}
		}
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		//수강 철회
		System.out.println("수강 철회할 학생의 이름을 입력하세요.");
		name=scan.next();
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				System.out.println("철회할 과목명을 입력하세요.");
				String delSub=scan.next();
				s[i].deleteSub(delSub);
				System.out.println("해당 과목을 철회했습니다.");
			}
		}
		
	}

}
