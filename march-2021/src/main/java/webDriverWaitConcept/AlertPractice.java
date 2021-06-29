package webDriverWaitConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@name='proceed']")).click();

//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//
//		alert.accept();

	}

	public static Alert waitFortAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void accepAlert(int timeOut) {

		waitFortAlert(timeOut).accept();
	}

	public void dismissALert(int timeOut) {

		waitFortAlert(timeOut).dismiss();

	}

	public static String getAlertText(int rimeOut) {
		return waitFortAlert(rimeOut).getText();

	}

}
