import java.util.Scanner;
import java.util.Scanner;
public class RectangleArea{
	private int length;
	private int width;
	
	public RectangleArea(){
		this.length=0;
		this.height=0;
	}
	
public void inputvalues(){
	Scanner scanner=new scanner(System.in);
	System.out.println("Enter the length of the rectangle");
	this.base=scanner.nextint();
	System.out.println("Enter the width of the rectangle");
	this.base=scanner.nextint();
}

public double calculateArea(){
	return 0.5*this.base*this.height;
}
public void displayArea(){
	System.out.println("The area of the rectangle");
}
public static void main(String[] args){
RectangleArea rectangleArea=new RectangleArea();
rectangleArea.inputValues();
rectangleArea.displayArea();
}
