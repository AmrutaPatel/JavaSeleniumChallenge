package com.planittesting.Challenge.Models.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Challenge2 extends Challenges {

	public Challenge2(WebDriver driver) {
		super(driver);
		
	}
	
	public void enterTextInValidTextbox(){
		List<WebElement> tr = driver.findElements(By.xpath("//*[contains(@class, 'glyphicon')]"));
		int i = 0;
		for(WebElement row : tr ){
			System.out.println(row.getAttribute("class"));
			if(row.getAttribute("class").contains("ok")){
				break;
			}
			else{
				i+=1;
			}
		}
		System.out.println("Valid text row is : " + i);
		i+=1; // increase value of i, to find corresponding table row.
		driver.findElement(By.cssSelector("#step1 > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child("+ i +") > td > input")).sendKeys(getInputText());
	}

	public Challenges clickSubmit(){
		driver.findElement(By.xpath("//*[@id='step1']/p[2]/input")).click();
		return new Challenge3(driver);
	}
}
