package day15;
/* 객체지향 프로그램의 4가지 특징
 * - 프로그램의 독립된 단위의 객체들을 모아서 처리하는 모임
 * - 각각의 객체는 메세지를 주고 받으면서 데이터를 처리 (리턴타입으로 받고, 매개변수로 줌)
 * 
 * 1. 추상화 (Abstraction)
 * - 핵심적인 코드만 보여주기
 * - 구현된 부분과 구현되지 않은 부분을 분리한다.
 * - 불필요한 부분은 숨긴다.
 * 
 * 2. 캡슐화 (Encapsulation)
 * - 데이터보호 (정보은닉)
 * - 멤버변수 (필드) 는 숨기고, 메서드로 접근
 * - 멤버변수와 메서드를 하나로 묶어서 처리
 * - 은닉화: 객체의 내부를 숨겨 외부로 드러나지 않게 하는 것
 * 			외부에서 데이터에 직접 접근하는 것을 방지
 * 
 * 3. 상속 (Inheritance)
 * - 코드 재사용(확장)
 * - 클래스를 상속받아 수정하여 사용하면 중복코드를 줄일 수 있음.
 * - 유지보수가 편함
 *  
 * 4. 다형성 (Polymorphism)
 * - 하나의 코드가 여러 자료(객체) 형으로 구현되어 실행되는 것
 * - 코드는 같은데 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음.
 * - 다형성을 잘 활용하면 유연하고 확장성 있으며 유지보수가 편한 프로그래밍을 할 수 있음.
 * */

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}


//Human, Tiger, Eagle 3가지 객체가 Animal 클래스를 상속받음

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
		
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이는 네 발로 어슬렁거립니다.");
	}
	
	public void Hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 멋지게 비행합니다.");
		
	}
}

class Dog {
	
	public void move() {
		System.out.println("강아지가 아장아장 걷습니다.");
	}
}

public class 다형성01 {
	
	public static void main(String[] args) {
		//Human, Tiger, Eagle 객체를생성
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		h.move();
		h.readBook();
		t.move();
		t.Hunting();
		e.move();
		e.flying();
	
		System.out.println();
		System.out.println("-----조상의 객체로 자식 객체 생성-----");
		
//		human h1 = new Animal(); // 자식의 객체로 조상을 생성하는 건 불가
		
		Animal hAnimal = new Human(); //조상의 클래스로 자식의 객체생성 (단, 반대로는 안됨)
		hAnimal.move();
		//hAnimal에서 Human의 readBook은 호출 불가 (Human 클래스에서 단독으로 만든 메서드라서)
		//조상의 클래스에서 상속받은 메서드만 실행가능.
		
		Animal tAnimal = new Tiger();
		tAnimal.move();
		
		Animal eAnimal = new Eagle();
		eAnimal.move();
		
		System.out.println();
		System.out.println("-----다형성 메서드 예시-----");
		다형성01 ex1 = new 다형성01();
//		ex1.moveAnimal1(h);
//		ex1.moveAnimal2(t);
//		ex1.moveAnimal3(e);
		
		
		//부모의 객체로 생성되었기 때문에 당연히 가능함
		//자동 객체형변환
		ex1.moveAnimal(hAnimal);
		ex1.moveAnimal(tAnimal);
		ex1.moveAnimal(eAnimal);
		ex1.moveAnimal(h);
		ex1.moveAnimal(t);
		ex1.moveAnimal(e);
		
		System.out.println();
		Dog d = new Dog();
		d.move();
//		ex1.moveAnimal(d); //Dog가 Animal을 상속받지 않아서 불가
		
		System.out.println();
		System.out.println("-----Animal 배열 생성예시-----");
		
		Animal[] aniList = new Animal[5];
		int cnt=0;
		aniList[cnt]=hAnimal;
		cnt++;
		aniList[cnt]=tAnimal;
		cnt++;
		aniList[cnt]=eAnimal;
		cnt++;
		
		for(int i=0; i<cnt; i++) {
			aniList[i].move();
		}
		
		System.out.println();
		System.out.println("-----다운 캐스팅 예시-----");
		//담을 수 있는 자료형의 객체에 = 애니멀을 상속받은 휴먼 클래스 객체를 담은 케이스
		Human human = (Human)hAnimal; //명시적 형변환- Animal을 Human으로
		human.readBook();
		
		//error 발생 케이스 : ClassCastException
		//tAnimal을 Human으로 형변환을 요청하면 컴퓨터 입장에서는 허락하지만
		//readBook이 타이거에 없으므로 오류남
		//해당 오류를 미리 체크하는 것이 instanceOf 연산
//		Human human1 =(Human)tAnimal;
//		human1.readBook();
		
		//instanceOf : 객체가 해당 클래스의 형에 맞는지 체크하는 연산자
		System.out.println(tAnimal instanceof Human);
		System.out.println(tAnimal instanceof Tiger);
		System.out.println(tAnimal instanceof Eagle);
		//console -> false
		//console -> true
		//console -> false
		
		System.out.println();
		System.out.println("-----다운 캐스팅 예시2-----");
		
		Animal downCastingTest = eAnimal;
		if(downCastingTest instanceof Human) {
			Human testHuman = (Human)downCastingTest;
			testHuman.readBook();
		}else if(downCastingTest instanceof Tiger) {
			Tiger testTiger = (Tiger)downCastingTest;
			testTiger.Hunting();
			
		}else if(downCastingTest instanceof Eagle) {
			Eagle testEagle = (Eagle)downCastingTest;
			testEagle.flying();
		}else {
			System.out.println("error");
		}
		
		
		
		
		
	}
	//각 객체의 move를 실행해주는 메서드 생성
	//public void moveAnimal1(Human human) {
	//	human.move();
	//}
	
	//public void moveAnimal2(Tiger tiger) {
	//	tiger.move();
	//}
	
	//public void moveAnimal3(Eagle eagle) {
	//	eagle.move();
	//}
	
	//다형성의 예시 (업캐스팅 자동 변환 가능)
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	

}














