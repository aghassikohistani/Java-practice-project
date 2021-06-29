package methodPractice;

public class StatciArrayAssignment {

	public static void main(String[] args) {

		Object[] cricketData = new Object[6];
		cricketData[0] = "Sachin";
		cricketData[1] = 32;
		cricketData[2] = "Mumbai Indians";
		cricketData[3] = "02/02/1977";
		cricketData[4] = 'M';
		cricketData[5] = 100;

		for (int i = 0; i <= cricketData.length; i++) {

			if (cricketData[i].equals("Sachin")) {
				System.out.println("he is the captain");
				break;
			} else
				System.out.println("he is not in the list");

		}

	}

}
