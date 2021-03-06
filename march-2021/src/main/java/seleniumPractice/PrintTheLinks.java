package seleniumPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTheLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement e : links) {
			String text = e.getText();
			if (!text.isEmpty())
				System.out.println(e.getText());
		}
//		for (int i = 0; i < links.size(); i++) {
//			
//			System.out.println(links.get(i).getText());
//		}

	}
}
