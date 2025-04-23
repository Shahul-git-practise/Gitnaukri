package Selenium.Naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
public class Introduction extends BaseUITest {

	@Test(dataProvider = "getData")
	public void naukriLogin(String username, String pwd) throws InterruptedException {

		System.out.println("Started Now First");
		goTo();
		performLogin(username,pwd);
		System.out.println(driver.getTitle());
		//Assert.assertTrue(false);

	}

	

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "shahulshaik1a5@gmail.com";
		data[0][1] = "Shahul@1234";

		data[1][0] = "shahulshaik1a5@gmail.com";
		data[1][1] = "Shahul@1234";

		return data;

	}

}
