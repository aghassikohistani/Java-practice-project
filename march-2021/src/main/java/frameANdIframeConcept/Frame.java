package frameANdIframeConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("main");
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Title bar ')]")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Acid-free paper for the digital age')]")).click();
	}

}
