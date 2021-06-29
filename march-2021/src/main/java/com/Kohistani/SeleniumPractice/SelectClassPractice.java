package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassPractice {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		waitForSometime();

		By signUpButtoField = By
		.xpath("(//span[@class='css-901oao css-16my406 css-bfa6kz r-poiln3 r-bcqeeo r-qvutc0'])[1]");
		By nameField = By.xpath("//input[@type='text']");
		By phoneNumber = By.xpath("//input[@type='tel']");
		By mounthField = By.xpath("//select[@id='SELECTOR_7']");
		By dayField = By.xpath("//select[@id='SELECTOR_8']");
		By yeadrField = By.xpath("//select[@id='SELECTOR_9']");
		By nextField = By.xpath("//span[contains(text(), 'Next')]");

		doClickOnElement(signUpButtoField);
		waitForSometime();
		doSendKeys(nameField, "Aghassi");
		doSendKeys(phoneNumber, "2534098602");
		waitForSometime();
		selectByIndex(mounthField, 12);
		selectByVisibleText(dayField, "16");
		selectByValue(yeadrField, "1998");
		doClickOnElement(nextField);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClickOnElement(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String keys) {
		getElement(locator).sendKeys(keys);
	}

	public static void selectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void selectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.deselectByIndex(index);
	}

	public static void selectByValue(By locator, String value) {
		Select select = new Select(driver.findElement(locator));
		select.selectByValue(value);
	}

	public void getOptionsText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());
		}
	}

	public static void waitForSometime() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

		}
	}
}
