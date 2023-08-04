package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
	private WebDriver driver;

	private WebDriverWait wait;
	
	@FindBy(id="login2")
    private WebElement  login_link;
	
	
	
	
	public Login_page(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
	public void ClickLogin() throws InterruptedException {
		this.driver.get("https://www.demoblaze.com/");
		this.wait.until(ExpectedConditions.elementToBeClickable(login_link));

		this.login_link.click();
		Thread.sleep(5000);
	}
	
}
