/* 
 * Author: Julian Gerber
 * Created: 3/7/19
 * Description: This program computes the factorial of n.
 */


package Week6;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter number to take factorial of: ");
		int n = scnr.nextInt();
		int factorial = 1;
		for (int i = 1 ; i <= n ; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("The factorial of " + n + " is " + factorial);
	}

}
