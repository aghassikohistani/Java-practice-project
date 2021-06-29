package webTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PginationPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");

		Thread.sleep(4000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		List<WebElement> pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

		int i = 0;

		while (true) {

			if (driver.findElements(By.xpath("//a[contains(text(),'Veeresh Gadag')]")).size() == 1) {

				driver.findElement(By.xpath("//a[contains(text(),'Veeresh Gadag')]/parent::td/preceding-sibling::td"))
						.click();
				break;
			}

			else {
				pages.get(i).click();
				pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
			}

			i++;
			System.out.println(i);

		}

	}

}
