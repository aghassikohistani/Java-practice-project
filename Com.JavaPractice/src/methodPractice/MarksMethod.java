package methodPractice;

public class MarksMethod {

	public int marks(int marks) {
		
		if (marks ==91) {
			System.out.println("Grade 'AA");
			
		}else if (marks==81) {
			System.out.println("AB");
		}else if (marks == 71) {
			System.out.println("BB");
		}else if (marks ==61) {
			System.out.println("CC");
			
			return marks;
		}
		else return 10;
		return 10;
	}
	
	
	
	public static void main(String[] args) {
		
		MarksMethod marks =  new MarksMethod();
		int result = marks.marks(91);
		System.out.println(result);
		
	}

}
