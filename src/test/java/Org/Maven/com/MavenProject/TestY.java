package Org.Maven.com.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestY {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		Selection ref = new Selection (driver);
		ref.selectTshirt();
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("F2");
		System.setProperty("webdriver.chrome.driver" ,"Resource/chromedriver.exe");
		

		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage() .window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
