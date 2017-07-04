package com.planittesting.Challenge.Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.planittesting.Challenge.Models.Pages.BasePage;
import com.planittesting.Challenge.Models.Pages.Challenges;

public class BaseTestSuite {

	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "src//test//java//com//planittesting//Challenge//Support//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Before
	public void testSetup(){
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://challenge.cloud.planittesting.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void testChallenges(){
		BasePage basePage = new BasePage(driver);
		Challenges challenge =	basePage.clickStartTheChallenge();
		
		//challenge-1
		//enter the input string in the text box
		challenge.enterTextInValidTextbox();
		Challenges	challenge2 = challenge.clickSubmit();
			
		//challenge-2
		//enter the input text in the text box with a tick mark along its side
		challenge2.enterTextInValidTextbox();	
		Challenges challenge3 = challenge2.clickSubmit();
		
		//challenge-3
		//enter the input text in the text box with a tick mark along its side
		challenge3.enterTextInValidTextbox();
		Challenges challenge4 = challenge3.clickSubmit();;
		
		//challenge-4
		//sort the input numbers and arrange them in the text boxes in correct order
		challenge4.enterSortedNumbersInTextboxes();
		Challenges challenge5 = challenge4.clickSubmit();
		
		//challenge-5
		//click the last submit button
		challenge5.clickSubmit();
	}
	
	@After
	public void cleanUp(){
		driver.quit();
	}  
	

}
