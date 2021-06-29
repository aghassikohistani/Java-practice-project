package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPractice {
	public static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		} else {
			System.out.println("Please Pass The Right Browser.." + browser);
		}

		driver.get("https://www.bbc.com/persian");

//		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("amazon")) {
			System.out.println("correct title");

		} else {
			System.out.println("the title is not right");
		}
	}

}
