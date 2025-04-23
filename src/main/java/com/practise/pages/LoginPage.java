package com.practise.pages;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static By login_Button=By.xpath("//a[@id='login_Layer']");
	public static By username=By.xpath("//input[contains(@placeholder,'Username')]");
	public static By password=By.xpath("//input[contains(@placeholder,'password')]");
	public static By submit_Button=By.xpath("//button[contains(@type,'submit')]");
	

}
