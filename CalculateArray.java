
public class CalculateArray {
	public static int sumList(int[] array) {
		int sum = 0;
		for (int i=0; i<= array.length-1; ++i) {
			sum = sum + array[i]; }
		return sum;
		}
	
	public static double averageList(int[] array) {
		double sum = 0.0;
		for (int i=0; i<= array.length-1; ++i) {
			sum = sum + array[i]; } 
		return sum / array.length;
	}
	
	public static int oddElements(int[] array) {
		int oddCounter = 0;
		for (int i=0; i<= array.length-1; ++i) { 
			if (array[i] % 2 == 0 ) continue;
			else ++oddCounter; }
		return oddCounter;
		}
	
	
	public static void main(String [] args) {
		int[] array = {2, 3, 19, 27, 12, 5} ; 

		System.out.println("Sum of elements in array is " + sumList(array) + "\nAverage of elements in array is " + averageList(array));
		System.out.println("The number of odd elements in the array is " + oddElements(array));
	}
	}

