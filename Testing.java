
public class Testing {
	public static void main(String[] args) {
		Person person1 = new Person("James", 16, 'm');
		Person person2 = new Person("Stan", 18, 'f');
		Person person3 = new Person("Carlyle", 21, 'f');
		Person person4 = new Person("Wilsonberg", 10, 'm');
	
		System.out.print("Expecting: Cannot Generate, got: ");
		DMV.generateDL(person1.age, true);
		System.out.print("Expecting: Cannot Generate, got: ");
		DMV.generateDL(person2.age, false);
		System.out.print("Expecting: Generated, got: ");
		DMV.generateDL(person3.age, true);
		System.out.print("Expecting: Cannot Generate, got: ");
		DMV.generateDL(person4.age, true);
	
		
		
	assert ((DMV.expirationDate(2014) != 2024)):  "Test Has Not Passed"; 
	}
}
