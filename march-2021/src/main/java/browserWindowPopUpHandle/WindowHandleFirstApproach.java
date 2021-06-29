package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleFirstApproach {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

		Set<String> winId = driver.getWindowHandles();

		Iterator<String> s = winId.iterator();

		String parentId = s.next();
		String childId = s.next();

		driver.switchTo().window(childId);
		String linkedin = driver.getTitle();
		System.out.println(linkedin);

		driver.close();

		driver.switchTo().window(parentId);

		System.out.println(driver.getCurrentUrl());

		driver.close();

	}

}
