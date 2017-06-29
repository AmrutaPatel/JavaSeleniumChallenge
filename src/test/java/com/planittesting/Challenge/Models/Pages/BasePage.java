package com.planittesting.Challenge.Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage (WebDriver driver){
		this.driver = driver;
	} 
	public Challenges clickStartTheChallenge(){
		this.driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		return new Challenges(driver);
	}

	

}
