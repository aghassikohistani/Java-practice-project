package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPracticee {
    static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		By firstName = By.id("Form_submitRequest_FirstName");
		By LastName = By.id("Form_submitRequest_LastName");
		By email = By.id("Form_submitRequest_Email");
     }

	   public static void enterValues(String By) {
       
		   
	 
	 }

}
