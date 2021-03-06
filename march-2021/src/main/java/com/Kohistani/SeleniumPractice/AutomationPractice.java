package com.Kohistani.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

		Thread.sleep(9000);

		List<WebElement> choices = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		Thread.sleep(9000);

		for (WebElement e : choices) {

			if (e.getText().equals("choice 2 3")) {
				e.click();
				break;
			}
		}

	}

}
