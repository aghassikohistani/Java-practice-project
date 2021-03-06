package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("www.freshworks.com");
		driver.manage().window().maximize();

		By tagName = By.tagName("img");

		List<WebElement> links = driver.findElements(tagName);

		for (WebElement e : links) {
			System.out.println(e.getSize());

			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}
		}

	}

}
