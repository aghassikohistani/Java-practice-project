package com.Kohistani.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.get("https://www.youtube.com/");

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//img[@class='style-scope yt-img-shadow'])[1]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[@id='button'])[1]")).click();

	}

}
