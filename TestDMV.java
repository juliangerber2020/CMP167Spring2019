import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDMV {

	@Test
	void test() {
		System.out.println("Testing for expirationDate");
		assert ((DMV.expirationDate(2014) != 2024)):  "Test Has Not Passed"; 
		assert ((DMV.expirationDate(2014) != 2023)):  "Test Has Not Passed"; 
	}
void test2() {
	
	
}
}
