package homework2.inheritance;

public class SportTeacher extends Teacher  {
	
	int hourPerWeek ;
	String moduleName="sport ";
	
	
	public void teachSport() {
		System.out.println("a sport teacher teachs "+moduleName);
	}
	
	public void Exercice() {
		System.out.println("a sport teacher do exercice during the week");
	}
	
	

}
