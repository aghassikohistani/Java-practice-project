package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTamreen {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();

		// By indusSelect = By.xpath("//select[@id='Form_submitForm_Industry']");

//		Select select = new Select(driver.findElement(indusSelect));
//		// select.selectByValue("Travel");
//		//select.selectByValue("Computer/Technology-Reseller");
//		select.selectByIndex(8);

		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectOptionText(countryOptions, "Pakistan");
//
//		List<WebElement> countryNames = driver.findElements(countryOptions);
//
//		for (WebElement e : countryNames) {
//
//			if (e.getText().equals("Canada")) {
//				e.click();
//				break;
//			}
//		}

	}

	public static void selectOptionText(By locator, String value) {

		List<WebElement> options = driver.findElements(locator);

		for (WebElement e : options) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}

	}

}
