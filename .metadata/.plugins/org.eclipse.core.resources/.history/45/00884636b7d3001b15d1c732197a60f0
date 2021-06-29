package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPoupHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> win = window.iterator();
		String childSessionId = win.next();
		String ParentSessionsId = win.next();

		driver.switchTo().window(childSessionId);

		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(ParentSessionsId);
		String url = driver.getCurrentUrl();

		System.out.println(url);
		driver.quit();

	}

}
