package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterSignUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

		}
		driver.get("https://twitter.com/");

		By signUpButton = By.xpath("//span[contains(text(),'Sign up')]");
		By nameField = By.xpath("//input[@name='name']");
		By phoneField = By.xpath("//input[@type='tel']");
		By mounthField = By.xpath("//select[@id='SELECTOR_34']");
		By dayField = By.xpath("//select[@id='SELECTOR_44']");
		By yearField = By.xpath("//div[@class='css-1dbjc4n r-kemksi r-1kqtdi0 r-z2wwpe r-rs99b7 r-16y2uox']");
		By nextButton = By.xpath("//span[contains(text(),'Next')]");
		driver.findElement(signUpButton).click();

		Thread.sleep(5000);
		driver.findElement(nameField).sendKeys("Aghassi");
		driver.findElement(phoneField).sendKeys("2534098675");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(mounthField));
		select.selectByValue("April");
		Thread.sleep(3000);
		Select select1 = new Select(driver.findElement(dayField));
		select1.selectByValue("12");
		Thread.sleep(3000);
		Select select2 = new Select(driver.findElement(yearField));
		select2.deselectByValue("1988");
		driver.findElement(nextButton);

	}

	public void selectByvalue(By locator, String value) {

	}

}
