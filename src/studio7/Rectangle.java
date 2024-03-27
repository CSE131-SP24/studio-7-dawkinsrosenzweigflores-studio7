package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	private double perimeter; 
	private double area; 

	
	public Rectangle(double length, double width) { 
		this.length = length;
		this.width = width;
	}




	public void setArea(double area) {
		this.area = length * width;
	} 

	public void setPerimeter(double perimeter) {
		this.perimeter = 2*length + 2*width;
	}


	
		
	public void drawStuff() {
	StdDraw.rectangle(this.width/2, this.length/2, 0.5, 0.5);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1, 1);
		r1.drawStuff();
	}





}


