package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		driver.manage().window().maximize();

		By courses = By.xpath("//a[contains(text(),'Content')]");
		By videos = By.xpath("//a[contains(text(), 'Single Videos')]");
		By mobile = By.xpath("(//a[text()='Mobile'])[1]");

		Actions action = new Actions(driver);
		Thread.sleep(5000);

		action.moveToElement(driver.findElement(courses)).perform();

		Thread.sleep(5000);

		action.click(driver.findElement(videos)).perform();

		Thread.sleep(5000);

		action.click(driver.findElement(mobile)).perform();

	}

}
