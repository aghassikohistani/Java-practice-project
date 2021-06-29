package duplicateCharcterPractice;

public class DuplicateArrayParray {

	public static void main(String[] args) {
		
    
		 String a = "Afghanistan";
		 String reverse="";
		 
		 for (int i=a.length() -1; i>=0; i--)  {
			 reverse = reverse +a.charAt(i);
			 
		 }
		 System.out.println(reverse);
	
	}

}
