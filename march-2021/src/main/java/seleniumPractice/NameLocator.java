package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		for (WebElement e : linksList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}
			System.out.println(e.getText());
			System.out.println(linksList.size());

		}

	}

}
