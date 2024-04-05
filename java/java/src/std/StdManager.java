package std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StdManager implements StdProgram {
	private ArrayList<Student> stdList = new ArrayList<>();
	private HashMap<String, Integer> map = new HashMap<>();
	int cnt=0;
	
	
	@Override
	public void printStd() {
		if(cnt>0) {
			for(int i=0; i<stdList.size(); i++) {
				System.out.println();
				stdList.get(i).printStd();
				System.out.println();
				System.out.println();
				
			}
		}
		else{
			System.out.println("등록된 학생 정보가 없습니다.");
			System.out.println();
			System.out.println();
			
		}
	}

	@Override
	public void addStd(Scanner scan) {
			System.out.println("추가할 학생 이름을 입력하세요. 》》》");
			String name=scan.next();
			
			System.out.println("추가할 학생의 나이를 숫자로만 입력하세요. 》》》");
			int age=scan.nextInt();
			
			System.out.println("추가할 학생의 전화번호를 입력하세요. 》》》");
			String num=scan.next();
			
			
			Student s=new Student(name, age, num);
			stdList.add(s);
			cnt++;
			
		System.out.println("학생 등록이 완료되었습니다.");
		
	}

	@Override
	public void modStd(Scanner scan) {
		System.out.println("수정할 학생 이름을 입력하세요. 》》》");
		String name=scan.next();
		for(int i=0; i<stdList.size(); i++) {
			if(!name.equals(stdList.get(i).getSdtName())) {
				System.out.println("일치하는 학생이 없습니다.");
				
				}else{
					stdList.remove(i);
					System.out.println(name+" 학생의 나이를 입력해주세요.");
					int age=scan.nextInt();
					System.out.println(name+" 학생의 전화번호를 입력해주세요.");
					String num=scan.next();
					Student a =new Student(name, age, num);
					stdList.add(a);
				}
				
			}
		
		System.out.println("학생 정보 수정이 완료되었습니다.");
			
		}
		
	

	@Override
	public void delStd(Scanner scan) {
		System.out.println("삭제할 학생 이름을 입력하세요. 》》》");
		String name=scan.next();
		for(int i=0; i<stdList.size(); i++) {
			if(name.equals(stdList.get(i).getSdtName())) {
				stdList.remove(i);
				
			}
			
		}
		System.out.println("학생 정보 삭제가 완료되었습니다.");
		
	}

	@Override
	public void searchStd(Scanner scan) {
		System.out.println("검색할 학생 이름을 입력하세요. 》》》");
		String searchName = scan.next();
		for(int i=0; i<stdList.size(); i++) {
			if(searchName.equals(stdList.get(i).getSdtName())) {
				stdList.get(i).printStd();
			}
		}
		
	}

	@Override
	public void addSub(Scanner scan) {
		System.out.println("과목을 추가할 학생의 이름을 입력하세요.");
		String stdName=scan.next();
		for(int i=0; i<stdList.size(); i++) {
			if(stdName.equals(stdList.get(i).getSdtName())) {
				System.out.println("추가할 과목 이름을 입력하세요. 》》》");
				String subName=scan.next();
				System.out.println(subName+">> 해당 과목의 점수를 입력하세요.");
				int subScore=scan.nextInt();
				//Student s=new Student();
				stdList.get(i).addMap(subName, subScore);
				
				}
			}
		System.out.println("과목 등록이 완료되었습니다.");
		
	}

	@Override
	public void modSub(Scanner scan) {
		System.out.println("과목을 수정할 학생의 이름을 입력하세요. 》》》");
		String stdName=scan.next();
		for(int i=0; i<stdList.size(); i++) {
			if(stdName.equals(stdList.get(i).getSdtName())) {
				System.out.println("수정할 과목을 입력하세요.");
				String subName=scan.next();
				System.out.println("과목의 점수를 입력하세요.");
				int subScore=scan.nextInt();
				stdList.get(i).getMap().put(subName,subScore);
				}
			}
		
		System.out.println("수정이 완료되었습니다.");
		
		
	}

	@Override
	public void delSub(Scanner scan) {
		//boolean result = stdList.remove(new Student(sdtName));
//		if(!result) {
//			System.out.println("학생이 없습니다.");
//			return;
//		}
		System.out.println("과목을 삭제할 학생의 이름을 입력하세요. 》》》");
		String stdName=scan.next();
		for(int i=0; i<stdList.size(); i++) {
			if(stdName.equals(stdList.get(i).getSdtName())) {
				System.out.println("삭제할 과목 이름을 입력하세요. 》》》");
				String subName=scan.next();
				stdList.get(i).removeMap(subName);
				}
			}
		System.out.println("과목 삭제가 완료되었습니다.");
		
	}
	//학생 리스트 생성 후 program 메서드 구현

}
