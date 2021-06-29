package com.Kohistani.SeleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	public WebDriver driver;

	/**
	 * This method will initialize the driver on the basis of given browser name
	 */
	public WebDriver initalizeDriver(String browserName) {

		System.out.println("the web driver is..." + browserName);

		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		switch (browserName) {
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Browser not found..please pass the right browser ");
			break;
		}
		return driver;
	}

	public void launchUrl(String ur) {
		driver.get(ur);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
