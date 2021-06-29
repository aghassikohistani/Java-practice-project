package interviewQuestions;

import java.util.Arrays;

public class FindSmallestAndLargestInIntegerArray {

	public static void main(String[] args) {

		int[] number = new int[] { -10, 858, 698, 22, 45, 231, 9 };

		// create two int variables

		int largest = number[0];// first location
		int smallest = number[0];// same thing zero position

		for (int i = 1; i < number.length; i++) { // itrate it i start my loop from 1 because zero is already taken
			if (number[i] > largest) {// if number of i greater than largest i will change value of largest
				largest = number[i]; // largest will be changed

			} else if (number[i] < smallest) {// else if number i is less than smallest initalize my smallest with
				// number of I then i print arrays.tostring it will print and print largest and
				// smallest
				smallest = number[i];
			}
		}

		System.out.println("given array is" + Arrays.toString(number));
		System.out.println("largets number" + largest);
		System.out.println("smallest number" + smallest);

	}

}
