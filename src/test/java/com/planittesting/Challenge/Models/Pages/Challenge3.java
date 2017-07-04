package com.planittesting.Challenge.Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Challenge3 extends Challenges {

	public Challenge3(WebDriver driver) {
		super(driver);
	}

	public String verifyPage(){
		return driver.findElement(By.cssSelector("#step3 > h2")).getText();
	}
	public String getInputText(){
		return  driver.findElement(By.cssSelector("#value")).getText();
	}
	
	public void enterTextInValidTextbox(){
		driver.findElement(By.cssSelector("#input")).sendKeys(getInputText());
	}
		
	public Challenges clickSubmit(){
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		return new Challenge4(driver);
	}
}
