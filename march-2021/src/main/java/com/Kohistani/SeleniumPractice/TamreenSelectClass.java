package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TamreenSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		waiForSomeTime();
		By textField = By.xpath("//input[@id='Form_submitForm_subdomain']");
		By firstNameField = By.xpath("//input[@id='Form_submitForm_FirstName']");
		By lastNameField = By.xpath("//input[@id='Form_submitForm_LastName']");
		By jobTitleField = By.xpath("//input[@id='Form_submitForm_JobTitle']");
		By businessEmailField = By.xpath("//input[@id='Form_submitForm_Email']");
		By companyNameField = By.xpath("//input[@id='Form_submitForm_CompanyName']");
		By numberOfEmpField = By.xpath("//select[@id='Form_submitForm_NoOfEmployees']");
		By phoneNumberField = By.xpath("//input[@id='Form_submitForm_Contact']");
		By indutryField = By.xpath("//select[@id='Form_submitForm_Industry']");
		By countryField = By.xpath("//select[@id='Form_submitForm_Country']");
		By submitButtonField = By.xpath("//input[@id='Form_submitForm_action_request']");

		enterValues(textField, "Hi my name is Aghassi, I am a sofware automation Engineer");
		enterValues(firstNameField, "Aghassi");
		enterValues(lastNameField, "Kohistani");
		enterValues(jobTitleField, "SDET");
		enterValues(businessEmailField, "akohistani@facebook.com");
		enterValues(companyNameField, "Kohistani Group of industries");
		doSelectByValue(numberOfEmpField, "151 - 200");
		doSelectByIndex(indutryField, 5);
		enterValues(phoneNumberField, "1234567891");
		doSelectByVisibleText(countryField, "Afghanistan");
		clickOnElement(submitButtonField);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void clickOnElement(By locator) {
		getElement(locator).click();

	}

	public static void enterValues(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void waiForSomeTime() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}
	}

}
