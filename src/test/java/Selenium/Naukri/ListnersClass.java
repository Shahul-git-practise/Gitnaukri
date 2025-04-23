package Selenium.Naukri;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCase Failed in the Method : "+result.getMethod());
		WebDriver driver =  BaseUITest.driver;
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        String folderpath="Screenshots/";
        String filename=folderpath+"screenshot_"+System.currentTimeMillis()+".png";
        try {
			FileHandler.copy(source, new File( filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}
	
	   public void onTestSuccess(ITestResult result) {
		   System.out.println("TestCase Passed in the Method : "+result.getMethod());
		  }

}
