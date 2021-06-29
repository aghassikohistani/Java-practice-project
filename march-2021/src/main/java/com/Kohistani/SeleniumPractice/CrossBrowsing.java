package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "Chrome";

		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			break;

		}
		switch (browser) {
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			break;
		}
	}

}
