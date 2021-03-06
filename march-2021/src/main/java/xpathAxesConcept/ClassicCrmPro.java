package xpathAxesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassicCrmPro {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(9000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// //a[contains(text(),'Aastha
		// Grover')]/parent::td/preceding-sibling::td/input[@type='checkbox']
		Thread.sleep(6000);
//		
		String coName = getCompanyName("Aliss Jeyhun");
		System.out.println(coName);

	}

	public static void selecttContact(String name) {

		String xpath = "//a[contains(text(),'" + name + "')]/parent::td/preceding-sibling::td/input[@type='checkbox']";

		driver.findElement(By.xpath(xpath)).click();
	}

	public static String getCompanyName(String name) {
		String comXpath = "//a[text()='" + name + "']/parent::td/following-sibling::td/a[@context='company']";
		return driver.findElement(By.xpath(comXpath)).getText();
	}

}
