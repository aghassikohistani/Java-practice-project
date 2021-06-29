package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesApiPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

		// Collect the window ID's

		Set<String> windowHandle = driver.getWindowHandles();

		Iterator<String> wId = windowHandle.iterator();

		String parentId = wId.next();
		String childId = wId.next();

		System.out.println("Parent Id is " + parentId);

		System.out.println("Child Id is " + childId);

		// Switching to child window

		driver.switchTo().window(childId);
		System.out.println("child windiw title is " + driver.getTitle());
		System.out.println("child window Url " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentId);

		System.out.println("parent window title" + driver.getTitle());

		driver.quit();

	}

}
