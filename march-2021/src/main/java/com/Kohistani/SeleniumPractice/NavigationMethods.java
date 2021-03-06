package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		String title = driver.getTitle();
		if (title.contains("amazon")) {
			System.out.println("the title is correct..");
		} else {
			System.out.println("Something is wrong with the title");
		}

		driver.navigate().to("https://www.bbc.com/persian");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();

		driver.quit();

	}

}
