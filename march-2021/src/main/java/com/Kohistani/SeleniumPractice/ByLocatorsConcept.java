package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ByLocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();

		By dayTrialButton = By.xpath("//a[@class='btn-orange contact-ohrm ']");
		By firstName = By.xpath("//input[@name='FirstName']");
		By lastName = By.xpath("//input[@name='LastName']");

		// driver.findElement(dayTrialButton).click();
		doClick(dayTrialButton);
		doSendKeys(firstName, "Aghassi");
		doSendKeys(lastName, "Kohistani");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
