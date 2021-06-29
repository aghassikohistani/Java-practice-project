package webDriverWaitConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		boolean url = wait.until(ExpectedConditions.urlContains("login"));
//
//		System.out.println(url);
		if (urlContains(5, "amazon")) {
			;
			System.out.println("the title is right my dear, i would say great job and thank you");
		}

	}

	public static boolean urlContains(int timeOut, String urlFraction) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlFraction));

	}

	public static boolean waitForURLmatch(int timeOUT, String urlMatchs) {

		WebDriverWait wait = new WebDriverWait(driver, timeOUT);
		return wait.until(ExpectedConditions.urlMatches(urlMatchs));

	}

}
