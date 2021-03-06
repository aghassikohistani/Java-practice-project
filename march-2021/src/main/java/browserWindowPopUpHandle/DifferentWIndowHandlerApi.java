package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWIndowHandlerApi {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();
		String linkedIn = it.next();

		driver.switchTo().window(linkedIn);

		String linkedInTitle = driver.getTitle();
		System.out.println(linkedInTitle);

		driver.close();

	}

}
