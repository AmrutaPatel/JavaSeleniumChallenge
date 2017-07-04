package com.planittesting.Challenge.Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Challenge5 extends Challenges {

	public Challenge5(WebDriver driver) {
		super(driver);
	}

	public String verifyPage(){
		return driver.findElement(By.cssSelector("#step5 > h2")).getText();
	}
	public Challenges clickSubmit(){
		//driver.findElement(By.xpath("//*[@id='step5']/p[2]/input")).click();
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		return new Challenges(driver);
	}
}
