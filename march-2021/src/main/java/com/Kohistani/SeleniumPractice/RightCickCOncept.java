package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightCickCOncept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);

//		By rightClickMe = By.xpath("//span[text()='right click me']");
//		By quit = By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']");
//
//		Actions act = new Actions(driver);
//
//		act.contextClick(driver.findElement(rightClickMe)).perform();
//
//		Thread.sleep(2000);
//
//		act.click(driver.findElement(quit)).perform();

		By rightClickMe = By.xpath("//span[text()='right click me']");
		By quit = By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']");
		contextClick(rightClickMe);
		clickOnWebElementUsingAction(quit);
		waitForSomeTime();
		tearDown();
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void moveToElement(By locator) {

		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).build().perform();

	}

	public static void clickOnWebElementUsingAction(By locator) {

		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
		;

	}

	public static void contextClick(By locator) {
		Actions action = new Actions(driver);
		action.contextClick(getElement(locator)).build().perform();
	}

	public static void waitForSomeTime() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
