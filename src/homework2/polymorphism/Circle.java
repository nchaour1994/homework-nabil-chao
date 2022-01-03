package homework2.polymorphism;

public class Circle  extends Shape {
	
	int diameter ; 
	String color ;
	public Circle(int myDiameter) {
		this.diameter=myDiameter;
		System.out.println("the diameter of this circle is "+myDiameter);
	}
	public Circle(int myDiameter,String myColor) {
		this.diameter=myDiameter;
		this.color=myColor;
		System.out.println("the diameter of this circle is "+myDiameter);
		System.out.println("the color of this circle is "+myColor);
	}
	

	@Override
	public void draw() {
		System.out.println("draw circle ");
	}
	
	
}
