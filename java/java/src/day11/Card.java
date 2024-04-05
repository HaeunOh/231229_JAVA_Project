package day11;

public class Card {

	private int num;
	private char shape;
	
	public Card() {
		this.shape = '♥';
		this.num = 1;
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
			default:
			System.out.print(num+" ");
			break;
		}
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num>13) {
			this.num=1;
		}else {
			this.num=num;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '♠' : case '♣' : case '◆' : //break 없이 쓰면 모든 case를 다 훑고 지나감
			this.shape = shape;
			break;
			default:
				this.shape='♥';
		}
	}

	
}


