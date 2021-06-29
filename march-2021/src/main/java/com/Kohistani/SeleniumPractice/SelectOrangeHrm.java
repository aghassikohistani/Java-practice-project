package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOrangeHrm {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		driver.manage().window().maximize();

		By acceptCookies = By.xpath("//a[contains(text(),'Accept Cookies')]");
		By textField = By.xpath("//input[@id='Form_submitForm_subdomain']");
		By firstName = By.xpath("//input[@name='FirstName']");
		By lastName = By.xpath("//input[@name='LastName']");
		By emailField = By.xpath("//input[@name='Email']");
		By jobTitleField = By.xpath("//input[@name='JobTitle']");
		By selectNumberOfEmp = By.xpath("//select[@name='NoOfEmployees']");
		By selectYourIndustry = By.xpath("//select[@name='Industry']");
		By phoneField = By.xpath("//input[@name='Contact']");

		doClick(acceptCookies);
		doSendKeys(textField, "My name is Aghassi main bahut prishan hu live mai allah madad");
		doSendKeys(firstName, "Aghassi");
		doSendKeys(lastName, "Kohistani");
		doSendKeys(emailField, "agassihouse@gmail.com");
		doSelectByIndex(selectNumberOfEmp, 5);
		doSendKeys(jobTitleField, "automation engineer");
		doSelectByVisibleText(selectYourIndustry, "Travel");
		doSendKeys(phoneField, "2534098765");
		waitForSomeTime();
		tearDown();
	}

	public static WebElement getWebElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String keys) {
		getWebElement(locator).sendKeys(keys);
	}

	public static void doClick(By locator) {
		getWebElement(locator).click();
	}

	public static void doSelectByIndex(By locator, int index) {

		Select select = new Select(getWebElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByValue(By locator, String text) {
		Select select = new Select(getWebElement(locator));
		select.selectByVisibleText(text);

	}

	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getWebElement(locator));
		select.selectByVisibleText(text);

	}

	public static void waitForSomeTime() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
