import java.util.Scanner;
public class Quadratics {
	
	public static void main(String[] args) {
		double Root1;
		double Root2;
		double a;
		double b;
		double c;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter three values: ");
		a = scnr.nextDouble();
		b = scnr.nextDouble();
		c = scnr.nextDouble();
		
		double Discriminant = (Math.pow(b,  2)) - (4 * a * c);
		Root1 = ((-b) + Math.sqrt(Discriminant)) / (2 * a);
		Root2 = ((-b) - Math.sqrt(Discriminant)) / (2 * a);
		
		System.out.println("Root 1: " + Root1);
		System.out.println("Root 2: " + Root2);
	}

}
