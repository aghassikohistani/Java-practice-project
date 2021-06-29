package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPract {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

		Set<String> win = driver.getWindowHandles();

		Iterator<String> sessionIds = win.iterator();

		String youTube = sessionIds.next();

		driver.switchTo().window(youTube);

		String youtube = driver.getTitle();

		System.out.println(youtube);

		driver.close();

		String twitter = sessionIds.next();

		driver.switchTo().window(twitter);

		String tWitter = driver.getTitle();

		System.out.println(tWitter);

		driver.close();

		String fb = sessionIds.next();

		driver.switchTo().window(fb);

		String facebook = driver.getCurrentUrl();

		System.out.println(facebook);

		driver.close();

		String orangeHrm = sessionIds.next();

		driver.switchTo().window(orangeHrm);

		String orangeTitle = driver.getTitle();

		System.out.println(orangeTitle);

		driver.quit();

	}

}
