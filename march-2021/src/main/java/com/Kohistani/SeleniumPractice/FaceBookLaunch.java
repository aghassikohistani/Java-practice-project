package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLaunch {

	public static void main(String[] args) {
//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Amazon.in")) {
			System.out.println("correct title");
		} else {
			System.out.println("the title is not correct");
		}

		driver.get("https://www.amazon.in/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}

}
