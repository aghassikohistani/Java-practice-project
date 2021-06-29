package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBasedDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();

		WebElement indus = driver.findElement(By.xpath("//select[@id='Form_submitForm_Industry']"));
		Select select = new Select(indus);
		// select.selectByIndex(3);
		//select.selectByVisibleText("Healthcare");
		select.selectByValue("Government-National/Federal");
	}

}
