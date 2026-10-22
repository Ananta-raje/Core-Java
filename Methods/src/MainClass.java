
public class MainClass {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stuId = 1;
		s1.stuName = "Ananta";
		s1.age = 22;
		s1.marks = 85;
		s1.isPassed = true;
		
		s1.displayDetails();
		
		
		System.out.println(s1.marks);	
		
		
		int updatedM = s1.updatedMarks(10);
		System.out.println("Updated marks are: "+updatedM);
		
		s1.result(true);
		
		
	}
}
