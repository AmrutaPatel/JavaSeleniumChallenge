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
		System.out.println(challenge.getInputText());
		challenge.enterTextInValidTextbox();
		challenge.clickSubmit();
		
		//challenge-2
		System.out.println(challenge.getInputText());	
		challenge.challenge2();
		challenge.clickSubmit();
		
		//challenge-3
		challenge.challenge3();
		
		//challenge-4
		challenge.challenge4();
		
		//challenge-5
		challenge.challenge5();
	}
	
	@After
	public void cleanUp(){
		//driver.quit();
	}  
	

}
