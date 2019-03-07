/*
 * Author: Julian Gerber
 * Created: 3/7/19
 * Description: This program computes the average of the first n natural numbers.
 */


package Week6;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter number of natural numbers: ");
		double n = scnr.nextDouble();
		double sum = 0;
		double average = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i; }
		
		average = sum / n;
		
		System.out.println("The average of the first " + n + " natural numbers is " + average);
		}
		
}