package randomJavaPractice;

public class CopyAnArrayToAnotherArray {

	public static void main(String[] args) {
        //initializing an array
		int[] arr1 = new int[] { 5, 4, 5, 6, 6, 6 };
		//initializing array 2 and giving the values equal to array1
		int[] arr2 = new int[arr1.length];
        //Running a for loop for array 1 and adding array 1 values to array 2
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}//Running a for loop for array 2 and printing the values 
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
