package webTableConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBoxClick {
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

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//a[contains(text(),'Alex Wonder')]/parent::td/preceding-sibling::td/input[@name='contact_id']"))
				.click();

		// clickOnTable("Alex Wonder");

	}

//	public static void clickOnTable(String name) {
//
//		String nameXpath = "a[contains(text()," + name
//				+ "'')]/parent::td/preceding-sibling::td/input[@name='contact_id']";
//
//		driver.findElement(By.xpath(nameXpath)).click();
//
//	}

}
