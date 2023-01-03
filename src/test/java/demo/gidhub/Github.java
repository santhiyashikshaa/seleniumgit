package demo.gidhub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Github {
	WebDriver driver;
	@BeforeTest
	public void test() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	}
	@Test
	public void one() {
		
	 driver.get("http://omayo.blogspot.com/");
			driver.findElement(By.linkText("compendiumdev")).click();
			String text = driver.findElement(By.id("para1")).getText();
		 System.out.println(text);
	}
	@AfterTest
 public void close() {
		driver.quit();
	}
}
