package Week11;

public class Human {
	int age;
	String name;
	double wealth;
	boolean hasVehicle;
	double hunger;
	int food;
	Vehicle[] vehicles;
	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
	}
	
	public void grow() {
		++age;
	
	}
	
	public void eat() {
		if (food >= 4.5) {
		--food;
		hunger -= 1.0; 
		System.out.println("Yummy, I ate all");}
		else { System.out.println("Not enough food"); }
	}
	
	public void work() {
		if (hunger < 5.0) {
		hunger+=0.5;
		wealth += 10.50; 
		System.out.println("Woah, I worked a lot"); }
		else { System.out.println("Too Hungry to Work"); }
	}
	public void buyFood() {
		if (wealth > 5.0) { 
			wealth -= 4.5;
			food++;
			System.out.println("Yay I bought some food!"); }
		else System.out.println("Not enough money. Please work");
	}
}