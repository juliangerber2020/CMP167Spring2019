/* 
 * Author: Julian Gerber
 * Created: 3/7/19
 * Description: This program outputs the first n powers of 2
 */


package Week6;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter number of powers of 2: ");
		int n = scnr.nextInt();
		double power = 1;
		for (int i = 0 ; i < n ; i++) {
			power = Math.pow(2, i); 
			System.out.println(power); }
		
	}

}
