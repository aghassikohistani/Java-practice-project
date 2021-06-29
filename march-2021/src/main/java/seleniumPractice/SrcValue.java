package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

  public class SrcValue {
    static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();

     
	
	}

       public static void enterValues(By locator) {
    	     driver.findElement(locator);
    	   }
   

	
	 


}
