 package org.stepprocess;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BestbuyLogin {

	WebDriver driver;
	@Given("To user should be in BestBuy loginpage")
	public void to_user_should_be_in_BestBuy_loginpage() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 20));
	    
	}

	@When("The user has to fill username and password and click login button")
	public void the_user_has_to_fill_username_and_password_and_click_login_button() throws InterruptedException, AWTException {
	    
		 WebElement  clk = driver.findElement(By.xpath("//a[@class='us-link']"));
		clk.click();
		
	//	WebElement  clk2 = driver.findElement(By.xpath("//a[text()='Top Deals']"));
	//	clk2.click();
	//	Thread.sleep(2000);
	//	driver.navigate().back();
		
		WebElement  clk3 = driver.findElement(By.xpath( "(//button[@type='button'])[2]"));
		clk3.click();
		
//    	Robot a = new Robot();
//		
//	    a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease( KeyEvent.VK_DOWN);
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease( KeyEvent.VK_DOWN);
//		
//    	a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease( KeyEvent.VK_ENTER);
//	
		WebElement  clk4 = driver.findElement( By.xpath( "(//button[@type='button'])[5]"));
		clk4.click();	
		
		
		WebElement  clk5 = driver.findElement(By.xpath("//a[text()='Apple']"));
		clk5.click();
		
		WebElement  clk6 = driver.findElement( By.xpath("//a[@class='link-element'][1]"));
		clk6.click();
		
		WebElement  clk7 = driver.findElement(By.xpath(" //a[text()='iMac Pro']"));
		clk7.clear();
	   
	}
	
	
	
}
