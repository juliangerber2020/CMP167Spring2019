	/* Author: Julian Gerber
	 * Created: February 7th, 2019
	 * Description: This program takes the average of three numbers.
	 */

import java.util.Scanner;

public class TestZero {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double Num1;
		double Num2;
		double Num3;
		
		System.out.println("Enter Number 1: ");
		Num1 = scnr.nextDouble();
		
		System.out.println("Enter Number 2: ");
		Num2 = scnr.nextDouble();
		
		System.out.println("Enter Number 3: ");
		Num3 = scnr.nextDouble();
		
		double average;
		
		average = (Num3 + Num2 + Num1) / 3;
		
		System.out.println("Average of Three Numbers: " + average);
	}

}
