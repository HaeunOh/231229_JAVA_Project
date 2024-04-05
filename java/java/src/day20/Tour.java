package day20;

public class Tour implements Comparable<Tour> { 
	private String name;
	private int age;
	private int cost;
	
	
	public Tour() {}
	public Tour(String name, int age, int cost) {
		this.name=name;
		this.age=age;
		//this.cost=cost;
		this.cost=(age >= 15? 100:50);
	}
	
	
	@Override
	public String toString() {
		return "이름: " + name + " / 나이: " + age + "세 / 여행경비: " + cost;
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
	public int getCost() {
		return cost;
	}
	public void setCoast(int cost) {
		this.cost = cost;
	}
	@Override
	public int compareTo(Tour o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	

}
