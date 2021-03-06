package popUpAertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffMailPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Alert pop up will show up
		// To handle this we have to use alert API
		driver.switchTo().alert().accept();

		// This method will switch to the alert (if alert is not there, it will throw an
		// exception, no alert found exception..

	}

}
