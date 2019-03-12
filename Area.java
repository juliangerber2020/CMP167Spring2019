/* 
 * Author: Julian Gerber
 * Created: 3/12/19
 * Description: this program computes area of a rectangle.
 */
/* 
 * Input: width, length
 * Process: area = width * length
 * Output: area
 /* 
 * Input: radius
 * Process: area = pi * r^2
 * Output: area
 */

import java.util.Scanner; 
public class Area {

	public static void main (String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter width: ");
	double width = scnr.nextDouble();
	
	System.out.println("Enter length: ");
	double length = scnr.nextDouble();
	
	double area = length * width;
	
	System.out.println("The area is " + area);

	}

}

public static void main(String[] args) {
	
	
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter radius: ");
	double radius = scnr.nextDouble();
	
	double area = Math.PI * Math.pow(radius, 2.0);
	
	System.out.println("The area is: " + area);

	}

}
