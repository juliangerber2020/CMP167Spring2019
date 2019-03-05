/* 
 * Author: Julian Gerber
 * Created: 3/5/19
 * Description: This program computes the sum of the first n natural numbers.
 */

package Week6;
import java.util.Scanner;
public class Week6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n;
		System.out.println("Enter number of natural numbers to add: ");
		n = scnr.nextInt();
		int sum = 0;
		while (n >= 1) {
			sum = sum + n + (n-1);
			n = n - 2; }
		
		System.out.print("The sum is " + sum);
		}
		
	}


