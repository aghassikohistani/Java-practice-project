package subashishMishra;

public class CopyArrayToAnotherArray {

	public static void main(String[] args) {

		int[] nums = new int[] { 10, 20, 30, 40, 50, 20, 10, 50, 30 };

		System.out.println("Duplicate Elements of an array ");

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					System.out.println(nums[j]);
				}

			}
		}

	}

}
