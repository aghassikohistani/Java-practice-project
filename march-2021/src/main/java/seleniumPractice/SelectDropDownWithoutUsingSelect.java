package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithoutUsingSelect {

	public static void main(String[] args) throws InterruptedException {

		// By writing an xpath which returns all the children and then use the for loop
		// and put a condition

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(4000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(4000);

		List<WebElement> chkBox = driver.findElements(By.cssSelector(".comboTreeItemTitle"));
		for (int i = 0; i < chkBox.size(); i++) {
			String ck = (chkBox.get(i).getText());
			if (ck.equals("choice 6 2 1"))
				chkBox.get(i).click();
			System.out.println(ck);
		}
	}

}
