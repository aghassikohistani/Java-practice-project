package functionsPractice;

public class RegistrationPage {

	String name;
	String socialSecurity;
	int idNum;
	boolean haveKids;

	public RegistrationPage(String name, int idNum) {

		this.name = name;
		this.idNum = idNum;

	}

	public RegistrationPage(boolean doYouHaveKids, String ssnNum) {

		this.haveKids = true;
		this.name = "Khoja";
	}

}
