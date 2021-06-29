package webDriverWaitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {
		
		

		/**
		 * SO let me explain the complete concept of Explicit wait!
		 * 
		 * the explicit wait is dynamic in nature and will be applied on certain
		 * conditions, also it can be applied on non-WebElements which means, it can be
		 * applied on Alerts, Frames, URL, title etc. Wait itself is an interface and it
		 * is implemented by Fluent wait wait interface has only one method which is the
		 * until method. the rest of the methods are created by Fluent wait, and
		 * WebDriver wait is extending or is the child of fluent wait and is using all
		 * the methods present in fluent wait so I am creating the Object of Fluent wait
		 * using the upCasting Java concept which child class object is referred by parent 
		 * class reference 
		 */

	
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	     
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(2)).ign
	
	
	}

     
	



}
