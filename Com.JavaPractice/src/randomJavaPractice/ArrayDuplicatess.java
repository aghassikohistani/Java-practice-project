package randomJavaPractice;

public class ArrayDuplicatess {

	public static void main(String[] args) {

		String[] players = { "Messi", "Alba", "Villa", "Aguero", "Pique", "Messi", "Alba" };
         
		for (int i=0; i<players.length; i++) {
			for(int j=i+1; j<players.length; j++) {
				if(players[i].equals(players[j])) {
			System.out.println(players[i]);System.out.println(players[i]);
				}
				
			
			}
		}
		
			

	}

}
