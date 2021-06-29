package oopsJava;

public class Test {

	public static void main(String[] args) {
		
		
		UniversityOfKabul uk = new GhazniUniversity();
		
		uk.feesInAfn();
        
		GhazniUniversity ug = new GhazniUniversity();
		
		String name = ug.studentFirstName("Aghassi");
		System.out.print(name);
		String lastName =  ug.studentLastName("Kohistani");
		System.out.print(" ");
		System.out.print(lastName);
		
		System.out.println("  ");
	
		WardakUniversity wu = new WardakUniversity ();
		String gul =wu.studentFirstName("AbulWudood");
		String go= wu.studentLastName("gul AGha");
	    System.out.println(gul+"  " + go);
	
	}

}
