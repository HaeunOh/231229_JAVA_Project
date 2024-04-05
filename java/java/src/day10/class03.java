package day10;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car1 클래스를 통해 a라는 객체를 생성
		//new 키워드를 통해 생성!!
		//Car1() 생성자에 의해 초기화된다.
		Car1 a = new Car1();
		a.setName("볼보");
		a.setColor("블랙");
		a.setYear("2024");
		a.setDoor("4");
		a.printInfo();
		a.power();
		
		
		Car1 a2 = new Car1("소나타","2021");
		a2.printInfo();
		
		Car1 a3=new Car1("아반떼", "2020", "빨강", "4");
		a3.printInfo();
				
	}
}
	
	//같은 패키지에서 같은 이름의 클래스를 사용하면 error
	class Car1 {
		//멤버변수 : name, year, color, door(문 개수), power, speed
		private String name;
		private String color;
		private String year;
		private String door;
		private boolean power;
		private int speed;
		
		//생성자 위치
		public Car1() {
			//기본 생성자
			
		}
		//생성자는 여러개 만들 수 있음 => '생성자 오버로딩'
		//오버로딩 조건 : 매개변수의 개수가 달라야함, 개수가 같다면 타입이 달라야함
		
		public Car1(String name, String year, String color, String door) {
			this(name, year); //생성자 호출
			this.name=name;
			this.year=year;
			this.color=color;
			this.door=door;
		}
		
		public Car1(String name, String year) {
			this.name=name;
			this.year=year;
		}
		//내 차량의 정보를 출력하는 메서드 (name, year, color, door)
		public void printInfo() {
			System.out.println("my Car: "+name+" / "+color+" / 문 "+door+"개"+"("+year+"년식)");
				}
		
		
		//power()
		//시동이 켜졌습니다. / 시동이 꺼졌습니다.
		public void power() {
			this.power = !power;
			if(this.power && speed <=0) {
				System.out.println("시동이 켜졌습니다.");
			} else if(power && speed>0) {
				System.out.println("주행중입니다.");
			}else if(!power && speed>0) {
				System.out.println("주행중에 시동을 끌 수 없습니다.");
			}else {
				System.out.println("시동을 끕니다.");
				this.power=false;
			}
		}
		
		
		//speedUp&Down 기본 조건은 power가 켜져야 가능.
		//시동이 꺼져있는 상태라면 "시동이 꺼져있습니다. 시동을 켜주세요." 출력
		
		
		//speedUP()
		//300이상이면 "최고속도입니다." 출력
		//현재 속도 얼마인지 출력
		public void speedUp() {
			
			if(!power) {
				System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
					}else {
						if(speed>=300) {
							speed=300;
							System.out.println("최고속도입니다.");
							}else {
								speed+=10;
								System.out.println("현재속도:"+speed);
								
							}
						
						}					
					}
			
		
		//speedDown()
		//속도가 0이 되면 더이상 내려가지 않고 "멈췄습니다."  출력
		//현재 속도 얼마인지 출력
		public void speedDown() {
			if(power) {
				if(speed<=0) {
					System.out.println("멈춰있습니다.");
					speed=0;
				}
				speed-=10;
				}else {
					System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
				}
			}

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getYear() {
			return year;
		}


		public void setYear(String year) {
			this.year = year;
		}


		public boolean isPower() {
			return power;
		}


		public void setPower(boolean power) {
			this.power = power;
		}


		public int getSpeed() {
			return speed;
		}


		public void setSpeed(int speed) {
			this.speed = speed;
		}


		public String getDoor() {
			return door;
		}


		public void setDoor(String door) {
			this.door = door;
		}

		
	

		
	
	}
	
