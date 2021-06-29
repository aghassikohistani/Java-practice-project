package interviewQuestions;

public class AnotherReverse {

	public static void main(String[] args) {
		
		int [] nums = new int [] {1,2,3,4,5};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
        System.out.println();
        
        System.out.println("the reversed array: ");
        for (int j=nums.length-1;j>0; j--) {
        	System.out.println(nums[j]);
        }
	}

}
