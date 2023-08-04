package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login_page;

public class Login_test {
private WebDriver driver;


@BeforeTest

public void setupDriver() {

WebDriverManager.chromedriver().setup();

 

// ChromeOptions options = new ChromeOptions();

//

// //add the headless argument

// options.addArguments("headless");

 

this.driver = new ChromeDriver();

this.driver.manage().window().maximize();

}

@Test
public void login() throws InterruptedException {
	Login_page lp=new Login_page(driver);
	lp.ClickLogin();
	
}
@AfterTest

public void tearDown() {

this.driver.quit();

}


}
