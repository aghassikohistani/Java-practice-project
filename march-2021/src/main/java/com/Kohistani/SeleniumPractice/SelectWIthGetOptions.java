package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectWIthGetOptions {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// By countryField = By.xpath("//select[@id='Form_submitForm_Country']");

//		Select select = new Select(driver.findElement(countryField));
//		List<WebElement> countryOptions = select.getOptions();
//
//		for (WebElement e : countryOptions) {
//			System.out.println(e.getText());
//		}

		// getEleOptions(countryField);
		By indus_options = By.xpath("//select[@id='Form_submitForm_Industry']");

		getEleOptions(indus_options);
	}

	public static WebElement getElements(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getEleOptions(By locator) {

		Select select = new Select(getElements(locator));
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());
		}

		return options;
	}

}
