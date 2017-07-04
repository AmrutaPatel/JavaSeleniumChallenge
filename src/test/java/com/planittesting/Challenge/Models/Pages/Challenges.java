package com.planittesting.Challenge.Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Challenges extends BasePage {
	
	public Challenges(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	public String getInputText(){
		return this.driver.findElement(By.xpath("//*[@id='step1']/p[1]/strong")).getText();
		}
		
	public void enterTextInValidTextbox(){
		driver.findElement(By.xpath("//*[contains(@class,'glyphicon-ok')]/../../*[@type='text']")).sendKeys(getInputText());
	}
	
	public Challenges clickSubmit(){
		driver.findElement(By.xpath("//*[@id='step1']/p[2]/input")).click();
		return new Challenge2(driver);
	}

	public void enterSortedNumbersInTextboxes(){}
	
//	public void challenge2() {
//		List<WebElement> tr = driver.findElements(By.xpath("//*[contains(@class, 'glyphicon')]"));
//		int i = 0;
//		for(WebElement row : tr ){
//			System.out.println(row.getAttribute("class"));
//			if(row.getAttribute("class").contains("ok")){
//				break;
//			}
//			else{
//				i+=1;
//			}
//		}
//		System.out.println("Valid text row is : " + i);
//		i+=1; // increase value of i, to find corresponding table row.
//		driver.findElement(By.cssSelector("#step1 > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child("+ i +") > td > input")).sendKeys(getInputText());
//	}
	
//	public void challenge3(){
//		String inputText = driver.findElement(By.cssSelector("#value")).getText();
//		driver.findElement(By.cssSelector("#input")).sendKeys(inputText);
//		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
//	}
	
//	public void challenge4(){
////		String inputNumbers = driver.findElement(By.cssSelector("#numbers")).getText();
//		
//		sort sorting = new sort();
//		Integer[] sortedNos =	sorting.sortedNumber(inputNumbers);
//		List <WebElement> inputTextBoxes = driver.findElements(By.xpath("//*[contains(@class,'row')]"));
//		Integer i =0 ;
//		for(WebElement textBox : inputTextBoxes){
//			//textBox.findElement(By.xpath("//*[@type='text']")).sendKeys(Integer.toString(sortedNos[i]));
//			textBox.findElement(By.cssSelector(".input-group > div > input")).sendKeys(Integer.toString(sortedNos[i]));
//			i+=1;
//		}
//		driver.findElement(By.xpath("//*[@id='step4']/p[2]/input")).click();
//	}
	
//	public void challenge5(){
//		driver.findElement(By.xpath("//*[@id='step5']/p[2]/input")).click();
//	}
//	
}
