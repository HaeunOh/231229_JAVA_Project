package day15;

import studentManager2.Subject;

public class Customer {

	/* 일반고객(Customer 클래스) / gold고객(할인) / vip고객(할인) -> 골드,브이아이피는 커스터머클래스를 상속받음
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스적립비율 : double bonusRatio
	 * 
	 * 클래스 생성
	 * 기본(일반)고객
	 * -customerGrade = "Silver"
	 * -bounusRatio = 0.01 = 구매금액의 1%
	 * 
	 * 메서드
	 * 1. 보너스 적립 계산 메서드 / calcPrice (int price)
	 * => 구매금액을 주고 적립 보너스를 계산하여 bonusPoint에 누적
	 * => 보너스 적립, 할인여부를 체크해서 구매 price를 리턴
	 * 
	 * 2. 출력 / customerInfo()
	 * => 홍길동님은 VIP입니다.
	 * 	  보너스 포인트는 1000p 입니다.
	 *    (only vip: 전담 상담사 번호는 1111입니다.)
	 * 
	 * - Silver 등급
	 * => 제품 구매시 할인 0% / 보너스 포인트 1% 적립
	 * - Gold 등급
	 * => 제품 구매시 할인 10% / 보너스 포인트 2% 적립
	 * - VIP 등급
	 * => 제품 구매시 할인 10% / 보너스 포인트 5% 적립 
	 * => vip 전담 상담사를 멤버변수에 추가, 코드(int agentID) 로 저장
	 * 
	 * 
	 * */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="Silver";
		bonusRatio=0.01;
	}
	
	public void customerInfo() {
		System.out.println(customerName+"님은 "+customerGrade+"등급 입니다.");
		System.out.println("보유하신 보너스 포인트는 "+bonusPoint+"p 입니다.");
	}
	
	public int calcPrice (int price) {
		bonusPoint = bonusPoint+=(int)(price*bonusRatio);
		return price; //실버등급은 할인 없음
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
		
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override
	public String toString() {
		return "Customer [회원 ID: " + customerID + ", 회원명: " + customerName + ", 회원 등급: "
				+ customerGrade + ", 보유 포인트: " + bonusPoint + " 적립 비율: " + bonusRatio + "]";
	}
	
	
	
}

class GoldCustomer extends Customer {
//골드랑 브이아이피만 할인율 멤버변수 
	private double saleRatio;
	
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(id,name);
		customerGrade="Gold";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint=bonusPoint+(int)(price*bonusRatio);
		price=price-(int)(price*saleRatio);
				return price;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
		
	}
	
	





class VipCustomer extends Customer {
	private double saleRatio;
	private int agentID;
	
	public VipCustomer() {}
	public VipCustomer(int id, String name, int agentid) {
		super(id,name);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		agentID=agentid;
	}
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당 상담원 번호는"+agentID+"입니다.");
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint=bonusPoint+(int)(price*bonusRatio);
		price=price-(int)(price*saleRatio);
		return price;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}