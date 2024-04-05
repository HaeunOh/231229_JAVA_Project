package day10;

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setName("스파크");
		c.setColor("빨강색");
		c.setYear("2024");
		c.print();
		
		c.power();
		System.out.println("my Car Power:"+(c.isPower()? "ON":"OFF"));
		c.power();
		System.out.println("my Car Power:"+(c.isPower()? "ON":"OFF"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("my Car Speed:"+c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("my Car speed:"+c.getSpeed());
		c.speedDown();
		c.speedDown();
		System.out.println("my Car speed:"+c.getSpeed());

			
		Car c2 = new Car();
		c2.setName("그렌져");
		c2.setColor("검정색");
		c2.setYear("2003");
		c2.print();
		
		c2.power();
		System.out.println("Car2 Power:"+(c2.isPower()? "ON":"OFF"));
		System.out.println("Car2 Speed:"+c2.getSpeed());
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		System.out.println("Car2 Speed:"+c2.getSpeed());
		
		
	}

}

	class Car { //클래스명은 대문자로 시작!
		//멤버변수 private로 설정
		//메서드 public으로 설정
		//getter/setter=메서드
		
		private String name;
		private String color;
		private String year;
		private boolean power;
		private int speed;
		
		//power()
		//꺼져있을 경우 => 켜짐
		//켜져있을 경우 => 꺼짐
		public void power() {
			power = !power;
			if(power) {
				System.out.println("시동이 켜졌습니다.");
			}else {
				System.out.println("시동이 꺼졌습니다.");
			}
		}
	
		//speedUp()
		public void speedUp() {
			if(!power) {
				speed+=0;
				System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
			}else if(power) {
				speed+=10;
			}if(speed>=300) {
			 speed+=0;
			 System.out.println("최고속도입니다.");
			}else speed+=10;
			
			System.out.println("현재속도는"+speed+"km/h입니다.");
		}
		
		//speedDown()
		public void speedDown() {
			if(speed<=0) {
				speed=0;
			}else {
				speed-=10;	
			}
			
		}
		
		
		//print()
		public void print() {
			System.out.println("my Car: "+name+"/"+color+"("+year+"년식)");
			
		}
		
		//마우스 우클릭=> Source=> Generate Getters and Setters=> Select All

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
		
		
		
		
		
		
		
		
		
		
		
	}