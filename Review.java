import java.util.Scanner;

public class Review {
	static int numPeople;
	static Scanner scnr = new Scanner(System.in);
	public static void Method1() { 
		System.out.println("Hello User! Welcome to Julian's Program!\n");
		
	}
	public static void Method2()	{
		Method1(); 
		String name; 
		System.out.println("Enter your name: ");
		name = scnr.next();
		if (name.charAt(name.length() - 1) == 'e' || name.charAt(name.length() - 1) == 'a') {
			System.out.println("Miss " + name); }
			else { System.out.println("Mister " + name); }
	}
	public static void Method3(int numPeople) {
	
		for (int i = 0; i < numPeople; ++i) {
			Method2(); 
		}
		}
	
		


public static void main(String [] args) {
	System.out.println("Enter number of people: ");
	numPeople = scnr.nextInt();
	Method3(numPeople); 
	
	
} }