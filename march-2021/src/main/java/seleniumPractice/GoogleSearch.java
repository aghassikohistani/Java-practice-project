package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		WebElement link = driver.findElement(By.id("Login"));
		Actions act = new Actions(driver);

		act.moveToElement(link).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@class = 'mobile-view-search search-page-main']")).click(); 

	}

}
