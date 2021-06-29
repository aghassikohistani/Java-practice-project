package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();

		driver.findElement(By.id("Form_submitRequest_FirstName")).sendKeys("Aghassi");
		driver.findElement(By.id("Form_submitRequest_LastName")).sendKeys("Kohistani");

		// Form_submitRequest_FirstName
	
	
	
	
	}

}
