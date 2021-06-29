package webDriverWaitConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitPractice {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://tek-school.com/retail/");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		if (wait.until(ExpectedConditions.titleContains("TEK SCHOOL"))) {

			System.out.println("Donal Trump was banned from Twitter");
		}

	}

	public static boolean passTheTitleFraction(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleContains(titleValue));

	}

	public static boolean passTheFullTitleString(int timeOut, String fullTitle) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleIs(fullTitle));

	}

    






}
