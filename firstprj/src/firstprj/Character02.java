package firstprj;

public class Character02 {
	String name;
	int age;
	int power;
	
	public Character02() {
		this("hello", 10, 20);		
	}
	
	public Character02(String name, int age, int power) {
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	public void printCharacter() {
		System.out.println(name + age + power);
	}
	
}
