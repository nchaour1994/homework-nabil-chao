package homework2.polymorphism;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangle rec=new Rectangle(4,8);
		System.out.println("the length is "+rec.getLength());
		System.out.println( "the width is "+rec.getWidth());
		rec.getWidth();
		
		Rectangle rec2=new Rectangle();
		rec.draw();
		System.out.println("**********************");
		rec.draw();
		
		System.out.println("----------------------");
		
		Circle cer= new Circle(8);
		cer.draw();
		System.out.println("----------------------");
		
		Square sq= new Square();
		sq.draw();
	}

}
