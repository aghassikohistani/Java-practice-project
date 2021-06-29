package subashishMishra;

public class LargestElementInAnArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 230, 897, 888 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(max);
			}
		}

	}

}
