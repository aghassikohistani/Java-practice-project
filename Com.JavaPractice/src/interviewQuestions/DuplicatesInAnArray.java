package interviewQuestions;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		
		String [] names = new String [] {"Aghassi","Rommel", "Martin","Aghassi","Rommel" };

	   for (int i=0; i<names.length; i++) {
		   for(int j=i+1; j<names.length;j++) {
			   if(names[i].equals(names[j])) {
				   System.out.println(names[i]);
			   }
		   }
	   }
	}



}
