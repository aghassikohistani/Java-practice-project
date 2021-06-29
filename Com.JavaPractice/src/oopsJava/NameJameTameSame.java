package oopsJava;

public class NameJameTameSame {

	public static void main(String[] args) {
		
		String [] country = new String [] {"Germany", "USA", "Thailand", "USA", "Thailand"};
		
	    
		for (int i =0; i<country.length; i++) {
			
			for (int j=i+1; j<country.length; j++) {
				
				if (country [i].equals(country [j])) {
					System.out.println("And the duplicate values are " + country [j]);
				}
			}
		}
	
	}

}
