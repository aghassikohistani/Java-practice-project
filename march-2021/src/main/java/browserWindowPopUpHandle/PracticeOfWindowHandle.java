package browserWindowPopUpHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeOfWindowHandle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
		
		Set <String> win = driver.getWindowHandles();
		
		Iterator <String> it = win.iterator();
		
		String linkedIn = it.next();
		
		driver.switchTo().window(linkedIn);
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		driver.close();
//		String orangeHrm = it.next();
//		driver.switchTo().window(orangeHrm);

	}

}
