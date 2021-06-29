package functionsPractice;

public class RecursiveFunctions {

	public static void main(String[] args) {
		// recursive function is when a function is calling itself 
		//example of recursive function: printing 1-100 without using loop 
		
		printNumber(1);
		

	}

	public static void printNumber (int num) {
		if (num <=100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}
		
	}


}
