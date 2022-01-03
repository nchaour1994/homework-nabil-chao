package homework2.inheritance;

public class Teacher extends Humain  {
	
	String firstName;
	int numberOfStudent;
	 
	
	public void teach() {
		System.out.println("a teacher teachs student ");
	}
	
	public void helpStudent() {
		System.out.println(" a teacher helps their student ");
	}
	
	public void assignExam() {
		System.out.println(" a teacher assigns exams to students ");
	}

}
