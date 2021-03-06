package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		driver.manage().window().maximize();

		By dragMe = By.xpath("//div[@id='draggable']");
		By target = By.xpath("//div[@id='droppable']");
		dragAndDrop(dragMe, target);

//		Actions action = new Actions(driver);
//
//		action.dragAndDrop(driver.findElement(dragMe), driver.findElement(target)).build().perform();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void dragAndDrop(By locator1, By locator2) {

		Actions action = new Actions(driver);
		action.dragAndDrop(getElement(locator1), getElement(locator2)).build().perform();

	}

}
