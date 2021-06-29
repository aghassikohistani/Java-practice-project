package seleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTheAtributesOfApage {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.bbc.com/persian");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		List <WebElement> bblinks = driver.findElements(By.tagName("a"));
		for (int i =0; i<bblinks.size(); i++) {
			System.out.println(bblinks.get(i).getText());
		}
	}

}
