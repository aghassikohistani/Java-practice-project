package popUpAertPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/?next=https%3A" + "%2F%2Fwww.facebook.com%2Fpages%2Fcreat"
				+ "e%2F%3Fref_type%3Dregistration_form");

		// """"""""""""""""""""WebElements Using By
		// Locators"""""""""""""""""""""""""""""""

		By createPageField = By.xpath("//a[contains(text(),'Create New Account')]");
		By firstNameField = By.xpath("//input[@name='firstname']");
		By lastNameField = By.xpath("//input[@name='lastname']");
		By emailMobileField = By.xpath("//input[@name='reg_email__']");
		By newPasswordField = By.id("password_step_input");
		By mounthField = By.id("month");
		By dayField = By.id("day");
		By yearField = By.id("year");
		By maleRadioButton = By.id("u_0_7_s/");
		By signUpButton = By.id("u_0_14_DK");

		// """""""""""""""Actions on elements"""""""""""""""""""

		doClickOnElement(createPageField);
		waitForSomeTime(3000);
		enterValues(firstNameField, "Aghassi");
		enterValues(lastNameField, "Kohistani");
		enterValues(emailMobileField, "aghassik@vulcan.com");
		enterValues(newPasswordField, "Biggbazzar@39");
		selectByValue(mounthField, "Apr");
		selectByIndex(dayField, 3);
		selectByVisibleText(yearField, "1988");
		doClickOnElement(maleRadioButton);
		waitForSomeTime(9000);
		doClickOnElement(signUpButton);

		// """"""""""""My Own Generic Methods""""""""""""""""""
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void enterValues(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static void doClickOnElement(By locator) {
		getElement(locator).click();
	}

	public static void selectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);

	}

	public static void selectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.deselectByIndex(index);

	}

	public static void selectByVisibleText(By locator, String text) {

		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(text);

	}

	public static void waitForSomeTime(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

		}
	}

}
