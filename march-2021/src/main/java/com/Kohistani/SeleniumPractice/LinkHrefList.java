package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHrefList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		By links = By.tagName("a");

		List<WebElement> link = driver.findElements(links);
		for (WebElement e : link) {
			String hRefVal = e.getAttribute("href");

			System.out.println(hRefVal);

		}

	}

}
