package webDriverWaitPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffMail {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// driver.findElement(By.xpath("//input[@name='proceed']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		if (wait.until(ExpectedConditions.urlContains("rediff"))) {

			System.out.println("the URL is correct");
		} else {
			System.out.println("Taqdeenadin");
		}

	}

}
