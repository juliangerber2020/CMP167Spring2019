/* 
 * Author: Julian Gerber
 * Created: 2/21/19 Week 4
 * Description: This program checks the age of the user
 */
import java.util.Scanner;
public class Agetitle {

	public static void main(String[] args) {
		int Age;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		Age = scnr.nextInt();
		
		if(Age > 25) {
			System.out.println("Adult");
			
		}
			else if(19 <= Age && Age <= 25)	{
				System.out.println("Young Adult");
			}
			else {
				System.out.println("Teen");
			}
	}

}
