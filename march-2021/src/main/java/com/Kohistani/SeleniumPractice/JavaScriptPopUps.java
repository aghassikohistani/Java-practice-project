package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUps {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//
//		Alert alert = driver.switchTo().alert();
//
//		String text = alert.getText();
//
//		System.out.println(text);
//
//		alert.accept();
		By rediSignIn = By.xpath("//input[@name='proceed']");

		acceptJavaScriptPopup(rediSignIn);
	}

	public static void acceptJavaScriptPopup(By locator) {
		driver.findElement(locator).click();
		driver.switchTo().alert().accept();

	}

}
