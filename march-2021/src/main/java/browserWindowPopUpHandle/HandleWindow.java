package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> sId = window.iterator();

		String youtube = sId.next();
		driver.switchTo().window(youtube);
		String url = driver.getTitle();
		System.out.println(url);
		driver.close();
		String orange = sId.next();
		driver.switchTo().window(orange);
		String orangetitle = driver.getTitle();
		System.out.println(orangetitle);
		driver.quit();

	}

}
