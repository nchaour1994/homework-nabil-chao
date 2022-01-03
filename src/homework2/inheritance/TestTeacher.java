package homework2.inheritance;

import java.awt.image.DirectColorModel;

public class TestTeacher {

	public static void main(String[] args) {
		
		
		PhysicTeacher john = new PhysicTeacher();
		john.eat();
		john.walk();
		john.teach();
		john.helpStudent();
		john.assignExam();
		john.teachPhysic();
		
	System.out.println("---------------------------------");
	     SportTeacher nancy= new SportTeacher();
	     nancy.eat();
	     nancy.walk();
	     nancy.teach();
	     nancy.helpStudent();
	     nancy.assignExam();
	     //nancy.teachPhysic(); 
	     nancy.teachSport();
	 System.out.println("---------------------------------");
	      Director sam= new Director();
	      sam.eat();
	      sam.walk();
	      sam.manage();
	      System.out.println(sam.institutName);
	     

	}

}
