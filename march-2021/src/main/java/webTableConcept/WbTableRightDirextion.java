package webTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WbTableRightDirextion {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");

		Thread.sleep(4000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		driver.findElement(By.xpath(
				"//a[contains(text(),'Alex Wonder')]/parent::td/preceding-sibling::td/input[@name='contact_id']"))
				.click();

		List<WebElement> pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

		int i = 0;
		while (true) {

			if (driver.findElements(By.xpath("//a[contains(text(),'Shailesh Kumar')]")).size() == 1) {

				driver.findElement(By.xpath(
						"//a[contains(text(),'Shailesh Kumar')]/parent::td/preceding-sibling::td/input[@name='contact_id']"))
						.click();
				System.out.println("the suspect is found");
				break;
			} else {

				try {
					pages.get(i).click();
				} catch (Exception e) {
					System.out.println("there is a problem with your code");
					break;
				}
				pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
			}

			i++;

		}

	}

}
