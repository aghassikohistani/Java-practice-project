package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bbc.com/persian");

		driver.findElement(By.xpath("(//a[contains(text(), 'افغانستان')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'جهان')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'ورزش')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'دانش')])[1]")).click();

		Set<String> win = driver.getWindowHandles();

		Iterator<String> it = win.iterator();
		String afg = it.next();
		Thread.sleep(6000);
		driver.switchTo().window(afg);
		String s = driver.getTitle();
		System.out.println(s);

		driver.close();

		String world = it.next();

		driver.switchTo().window(world);
		Thread.sleep(6000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		String sport = it.next();

		driver.switchTo().window(sport);
		Thread.sleep(6000);

		String sptitle = driver.getTitle();
		System.out.println(sptitle);
		driver.close();

		String danish = it.next();

		driver.switchTo().window(danish);
		Thread.sleep(6000);
		String dTitle = driver.getTitle();
		System.out.println(dTitle);
		driver.close();
		String bbc = it.next();

		driver.switchTo().window(bbc);
		Thread.sleep(6000);
		String bbcTitle = driver.getTitle();
		System.out.println(bbcTitle);
		driver.quit();

	}

}
