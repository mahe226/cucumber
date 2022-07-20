package org.stepprocess;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepLogin {
	WebDriver driver;
@Given("To user should be in facebook loginpage")
public void to_user_should_be_in_facebook_loginpage() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@When("The user has to fill {string}  and {string}")
public void the_user_has_to_fill_and(String user, String pass) { 
	WebElement  txtusername = driver.findElement(By.name("email"));
	txtusername.sendKeys( user);
	WebElement  txtpass = driver.findElement(By.id( "pass"));
	txtpass.sendKeys(pass);
	  
}

@When("The user has to click button")
public void the_user_has_to_click_button() {
    
	WebElement  btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
}

@Then("The user should navigate to the invalid login page")
public void the_user_should_navigate_to_the_invalid_login_page() throws InterruptedException {
	
//	WebDriverWait w = new WebDriverWait(driver,20);
	Thread.sleep( 2000);
	System.out.println("###user in invalid page###");
	//driver.quit();
	
    
}

}
