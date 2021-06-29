package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();

		if (title.equals("Google")) {
			System.out.println("the first page is google");
		}

		driver.navigate().to("https://www.amazon.in/");

		Thread.sleep(5000);

		String titleT = driver.getTitle();
		if (titleT.contains("Online Shopping")) {
			System.out.println("This amazon page is in India");
		}

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
