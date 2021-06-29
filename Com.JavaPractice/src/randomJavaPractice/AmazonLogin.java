package randomJavaPractice;

public class AmazonLogin {

	public static void main(String[] args) {

		LoginPage login = new LoginPage(2023454454, "04/06/1988");

		LoginPage login2 = new LoginPage("agassi@gmail.com", "test@12345");

		LoginPage login3 = new LoginPage("james@vulcan.com", "Vulcan123", 43434343, 'M');

		System.out.println(login.phNumber + "" + " " + login.DOB + " ");

		System.out.println(login2.email + " " + " " + login2.password + " ");

		System.out.println(login3.email + "" + login3.password + "" + login3.phNumber + "" + login3.gender + "");

	}

}
