package webDriverUtil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilityClass {

	private WebDriver driver;

	public WebDriverUtilityClass(WebDriver driver) {

		this.driver = driver;
	}

	public boolean passTheTitleFraction(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleContains(titleValue));

	}

	public boolean passTheFullTitleString(int timeOut, String fullTitle) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleIs(fullTitle));

	}

	public String getAlertText(int timeOut) {
		return waitFortAlert(timeOut).getText();
	}

	public boolean urlContains(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}

	public boolean waitForURLmatch(int timeOUT, String urlMatchs) {
		WebDriverWait wait = new WebDriverWait(driver, timeOUT);
		return wait.until(ExpectedConditions.urlMatches(urlMatchs));
	}

	public Alert waitFortAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public void accepAlert(int timeOut) {
		waitFortAlert(timeOut).accept();
	}

	public void dismissALert(int timeOut) {
		waitFortAlert(timeOut).dismiss();

	}

	public String getTitleText(int timeOut, String fullTitle) {
		passTheFullTitleString(timeOut, fullTitle);
		return driver.getTitle();
	}

}
