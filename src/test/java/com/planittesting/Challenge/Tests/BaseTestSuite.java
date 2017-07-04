package com.planittesting.Challenge.Tests;

import java.util.concurrent.TimeUnit;

import org.junit.*;
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
		Assert.assertEquals("Challenge 1", challenge.verifyPage());
		challenge.enterTextInValidTextbox();
		Challenges	challenge2 = challenge.clickSubmit();
			
		//challenge-2
		//enter the input text in the text box with a tick mark along its side
		Assert.assertEquals("Challenge 2", challenge.verifyPage());
		challenge2.enterTextInValidTextbox();	
		Challenges challenge3 = challenge2.clickSubmit();
		
		//challenge-3
		//enter the input text in the text box with a tick mark along its side
		Assert.assertEquals("Challenge 3", challenge3.verifyPage());
		challenge3.enterTextInValidTextbox();
		Challenges challenge4 = challenge3.clickSubmit();;
		
		//challenge-4
		//sort the input numbers and arrange them in the text boxes in correct order
		Assert.assertEquals("Challenge 4", challenge4.verifyPage());
		challenge4.enterSortedNumbersInTextboxes();
		Challenges challenge5 = challenge4.clickSubmit();
		
		//challenge-5
		//click the last submit button
		Assert.assertEquals("Challenge 5", challenge5.verifyPage());
		challenge5.clickSubmit();
	}
	
	@After
	public void cleanUp(){
		driver.quit();
	}  
}
