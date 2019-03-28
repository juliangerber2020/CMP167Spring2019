import java.util.Scanner;
public class DMV {		
	static int age; 
	static String test; 
	static boolean testPass;     
	static int yearGenerated;
	static int expirationYear;
	static Scanner scnr = new Scanner(System.in);

	
	public static void generateDL(int age, boolean testPass) {
		
		
		if (age >= 17 && testPass) {
			System.out.println("Drivers License Generated");
		
		
		}
		else { System.out.println("Cannot Generate Drivers License");    } 
	}
	
	public static int expirationDate(int yearGenerated) {
		
		System.out.println("Enter year license is generated: ");
		yearGenerated = scnr.nextInt();
		
		expirationYear = yearGenerated + 10;
		return expirationYear; 
}
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		age = scnr.nextInt();
		System.out.println("Did you pass your test? (Y/N)");
		test = scnr.next();
		if (test.equalsIgnoreCase("Y")) 
			testPass = true;
		else testPass = false; 
		
		generateDL(age, testPass);
		if (age >= 17 && testPass) {
		expirationYear = expirationDate(yearGenerated); 
	
		System.out.println("Expiration date is " + expirationYear);  }
		
	}
	
}