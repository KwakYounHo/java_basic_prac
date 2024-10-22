package user;

public class Student extends User {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void introduce() {
		System.out.println(String.format("안녕 하세요. 저는 %s 입니다. 나이는 %d 이고, 전공은 %s 입니다.", getName(), getAge(), major));
	}
	
	public String getMajor() {
		return major;
	}
}