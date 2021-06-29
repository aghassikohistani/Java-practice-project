package randomJavaPractice;

public class LoginPage {

	String email;
	String password;
	long phNumber;
	String DOB;
	char gender;

	public LoginPage(String email, String password) {

		this.email = email;
		this.password = password;
	}

	public LoginPage(long phNumber, String DOB) {
		this.phNumber = phNumber;
		this.DOB = DOB;
	}

	public LoginPage(String email, String password, long phNumber, char gender) {
		this.email = email;
		this.password = password;
		this.phNumber = phNumber;
		this.gender = gender;

	}

}
