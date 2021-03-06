package webDriverWaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConceptWithFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Aastha Grover')]/parent::td/preceding-sibling::td")).click();

	}
  






}
