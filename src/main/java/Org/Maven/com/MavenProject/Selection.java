package Org.Maven.com.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selection {
WebDriver driver;

	public Selection(WebDriver driver2) 
	{
	driver=driver2;
}
	public void selectTshirt() throws InterruptedException
	{
		WebElement title = driver.findElement(By.xpath("(//a[@title='T-shirts'][text() ='T-shirts'])[2]"));
		title.click ();
		WebElement small = driver.findElement(By.xpath("//input[@type='checkbox' and @id='layered_id_attribute_group_1']"));
		small.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Enlarge = driver .findElement(By.xpath("//img[@class='replace-2x img-responsive' and @title='Faded Short Sleeve T-shirts']"));
		Enlarge.click();
        Thread.sleep(5000);
		WebElement fr= driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(fr);
		WebElement Plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		Plus.click();
		Plus.click();
		WebElement Addtocart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		Addtocart.click();
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		WebElement Payment = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium' and @href='http://automationpractice.com/index.php?controller=order' and //a[@title='Proceed to checkout']]"));
		Payment.click();
		WebElement Checkout = driver.findElement(By.xpath("//a[@title='Continue shopping']"));
		Checkout.click();
	}
	
}
