import user.Student;
import java.util.Scanner;

public class JavaBasic {
	public static void main (String[] args) {
		// information
		int age = 0;
		String name = "";
		String major = "";
		Student me = null;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("나이를 입력하세요 : ");
			String inputAge = scanner.nextLine();
			
			age = Integer.parseInt(inputAge);
			
			if (age < 0 || age > 150) {
				throw new IllegalArgumentException("유효하지 않은 나이입니다.");
			}
			
			System.out.print("이름을 입력해 주세요 : ");
			String inputName = scanner.nextLine();
			
			name = inputName;
			
			System.out.print("전공을 작성해 주세요 : ");
			String inputMajor = scanner.nextLine();
			
			major = inputMajor;
			
			me = new Student(name, age, major);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해 주세요.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("지정 되지 않은 에러 등장 : " + e);
		}
		
		if (me != null) {
			me.introduce();
		}
		
	}
}