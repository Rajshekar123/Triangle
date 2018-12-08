package misc2;

import java.text.DecimalFormat;
import java.util.Scanner;

class GeometricObject {
    private String color = " white ";
    private boolean filled;
    private java.util.Date dateCreated;
 
    public GeometricObject() {
    }
 
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;   
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
 
    public boolean isFilled() {
        return filled;
    }
 
    public void setFilled(boolean filled) {
    	this.filled=filled;
    }
 
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
 
    public String toString() {
        return "Created on " + dateCreated + "\n color: " + color + " and filled ";                 
    }   
 }
class Triangle extends GeometricObject{
	 private double side1;
	    private double side2;
	    private double side3;
	 
	    public Triangle() {
	    	side1=1.0;
	    	side2=1.0;
	    	side3=1.0;
	    }
	 
	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }
	 
	    public double setSide1() {
	        return side1;
	    }
	 
	    public double setSide2() {
	        return side2;
	    }
	 
	    public double setSide3() {
	        return side3;
	    }
	 
	    public void setSide1(double side1) {
	        this.side1 = side1;
	    }
	 
	    public void setSide2(double side2) {
	        this.side2 = side2;
	    }
	 
	    public void setSide3(double side3) {
	        this.side3 = side2;
	    }
	 
	    public double getArea() {
	    	double p=(side1 + side2 + side3) / 2;
	        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	    }
	 
	    public double getPerimeter() {
	        return side1 + side2 + side3;
	    }
	 
	    public String toString() {
	    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
	           + " Side 3 = " + side3;
	    }

}
public class TestTriangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		double s1=sc.nextDouble();
		System.out.println("Enter side 2 : ");
		double s2=sc.nextDouble();
		System.out.println("Enter side 3 : ");
		double s3=sc.nextDouble();
		System.out.println("Enter color : ");
		String col=sc.next();
		System.out.println("Enter boolean for filled : ");
		boolean fill=sc.nextBoolean();
		Triangle t1=new Triangle(s1,s2,s3);
		t1.setColor(col);
		t1.setFilled(fill);
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println("Area = "+df.format(t1.getArea()));
		System.out.println("Preimeter = "+t1.getPerimeter());
		System.out.println("Color = "+t1.getColor());
		System.out.println("Filled = "+t1.isFilled());
		sc.close();
	}
}
