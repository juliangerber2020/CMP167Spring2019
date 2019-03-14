/* 
 * Author: Julian Gerber
 * Created: 3/12/19
 * Description: this program computes area of a rectangle.
 */
/* 
 * Input: width, length
 * Process: area = width * length
 * Output: area
*/

import java.util.Scanner; 
public class Area {
	static Scanner scnr = new Scanner(System.in);
	 public static void main(String[] args) {
		 
			

/* 
* getRectArea: int
* params: width, int, length, int
* calculates area of rectangle
*/		
			
			System.out.println("Enter width: ");
			int width = scnr.nextInt();
			
			System.out.println("Enter length: ");
			int length = scnr.nextInt();
			
			int rectarea = getRectArea(width, length); 

			
			System.out.println("The area is " + rectarea);

/* 
* Input: radius
* Process: area = pi * r^2
* Output: area
*/

			System.out.println("Enter radius: ");
double radius = scnr.nextDouble();

double circarea = getCircArea(radius);
System.out.println("The area is " + circarea);
/* 
* Input: base, height
* Process: area = (base * height) / 2
* Output: area
*/

System.out.println("Enter base: "); 
double base = scnr.nextDouble();

System.out.println("Enter height: ");
double height = scnr.nextDouble();

double triarea = getTriArea(base, height);

System.out.println("Area is " + triarea);



		}
		 
	 
		 public static int getRectArea(int width, int length) {
				return width * length;
				}
	









public static double getTriArea(double base, double height) {
return (base * height) / 2;

}
public static double getCircArea(double radius) {
return (Math.PI * radius * radius); 

}
}
