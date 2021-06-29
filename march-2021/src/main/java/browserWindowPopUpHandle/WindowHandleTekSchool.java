package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTekSchool {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tekschool.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Online College Programs')]")).click();

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();

		String college = it.next();
		driver.switchTo().window(college);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.close();

		String tek = it.next();

		driver.switchTo().window(tek);

		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.quit();

	}

}
