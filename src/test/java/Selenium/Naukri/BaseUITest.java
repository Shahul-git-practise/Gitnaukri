package Selenium.Naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.practise.commons.utils.UIUtil;

public class BaseUITest {

	static WebDriver driver;

	public BaseUITest() {

		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}

	public static By login_Button = By.xpath("//a[@id='login_Layer']");

	@FindBy(xpath = "//input[contains(@placeholder,'Username')]")
	WebElement userName;

	@FindBy(xpath = "//input[contains(@placeholder,'password')]")
	WebElement password;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElement submit_Button;
	
	public void goTo() {
		
	    driver.get("https://www.naukri.com/");
	    UIUtil.waitForVisibility(driver, login_Button, 5);
		driver.findElement(login_Button).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void performLogin(String name, String pwd) {
		
		
		userName.sendKeys(name);
		password.sendKeys(pwd);
		submit_Button.click();
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	}

}
