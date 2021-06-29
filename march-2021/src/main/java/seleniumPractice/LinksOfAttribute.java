package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksOfAttribute {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> links = driver.findElements(By.tagName("img"));
		for (WebElement e : links) {
			String atr = e.getAttribute("href");
          System.out.println(atr);
	
		}

	}

}
