package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();

		if (title.equalsIgnoreCase("Orange Hrm")) {
			System.out.println(title);
		}

		By trial = By.xpath("//a[contains (text(),'FREE 30 Day Trial')]");

	}

	public static WebElement getValues(By locator) {
		return driver.findElement(locator);
	}

	public static void enterValues(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void clickOnElement(By locator) {
		driver.findElement(locator).click();
	}

}