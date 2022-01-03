package homework2.encapsulation;

public class Rectangle {
	 private int length ; 
	private int width  ;
	public Rectangle(int myWidth,int myLength) {
		this.length=myLength;
		this.width=myWidth;
		System.out.println("the surface of this rectangle  is "+myLength*myWidth);
	}
	public Rectangle() {
		
	}


	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
