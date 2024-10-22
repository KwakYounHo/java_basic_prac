package user;

public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println(String.format("안녕하세요 저는 %d 세 %s 입니다.", age, name));
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}