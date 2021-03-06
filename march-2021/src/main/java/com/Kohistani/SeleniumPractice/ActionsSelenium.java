package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		By menu = By.xpath("//a[@id='ctl00_HyperLinkLogin']");

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(menu)).perform();

	}

}
