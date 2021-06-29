package randomJavaPractice;

public class DuplixDuplicate {

	public static void main(String[] args) {

		int[] nums = { 22, 33, 44, 44, 33, 55, 55, 88, 88, 99 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					System.out.println(nums[i]);
				}

			}

		}

	}

}
