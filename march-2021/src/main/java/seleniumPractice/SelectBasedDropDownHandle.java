package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBasedDropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		WebElement link = driver.findElement(By.id("Form_submitRequest_Country"));
		Select select = new Select(link);
		// select.selectByVisibleText("Iran");
		// select.deselectByValue(null);
		List<WebElement> country = select.getOptions();
		for (WebElement e : country) {
			if (e.getText().equals("Afghanistan")) {
				System.out.println("Engineer Aghassi Kohistani");
			}
			System.out.println(e.getText());
		}

	}

}
