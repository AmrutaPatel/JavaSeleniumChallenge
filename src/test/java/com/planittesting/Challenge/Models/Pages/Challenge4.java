package com.planittesting.Challenge.Models.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.planittesting.Challenge.Support.sort;


public class Challenge4 extends Challenges {

	public Challenge4(WebDriver driver) {
		super(driver);
		
	}
	
	public String getInputText(){
		return  driver.findElement(By.cssSelector("#numbers")).getText();
	}
	
	public void enterSortedNumbersInTextboxes(){
		sort sorting = new sort();
		Integer[] sortedNos =	sorting.sortedNumber(getInputText());
		List <WebElement> inputTextBoxes = driver.findElements(By.xpath("//*[contains(@class,'row')]"));
		Integer i =0 ;
		for(WebElement textBox : inputTextBoxes){
			textBox.findElement(By.cssSelector(".input-group > div > input")).sendKeys(Integer.toString(sortedNos[i]));
			i+=1;
		}
	}
		
	public Challenges clickSubmit(){
		driver.findElement(By.xpath("//*[@id='step4']/p[2]/input")).click();
		return new Challenge5(driver);
	}
	

}
