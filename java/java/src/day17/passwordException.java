package day17;

public class passwordException extends IllegalArgumentException{
	
	private static final long serialVersionUID = 1L;
	
	//사용자 정의 Exeption 생성할 때 조건
	//IllegalArgumentException 사용자 정의 Exception 정의 시 상속.
	
	public passwordException(String message) {
		super(message);
	}
	
	

}
