package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		Thread.sleep(000);

		// driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']")).click();

		// Thread.sleep(9000);
//		List<WebElement> country = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//
//		for (WebElement e : country) {
//			if (e.getText().equals("Germany")) {
//				e.click();
//				break;
//			}
//		}

		getValues(By.xpath("//select[@id='Form_submitForm_Country']/option"), "Afghanistan");

	}

	public static void getValues(By locator, String value) {
		List<WebElement> options = driver.findElements(locator);
		for (WebElement e : options) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}

	}

}
