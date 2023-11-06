package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import atu.testng.reports.logging.LogAs;
import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Utils;

public class ChatBot extends Keywords {
	
	String MSSFassert = Utils.getDataFromTestData("Maruthi", "Excepted text1");

	  public void createnexa(WebDriver driver, String URL) {
		  
		    navigateUrl(driver, URL);
		  
		    waitForElementWithLessWait(driver, chatbot);
		    click(driver,chatbot);
		    
			waitForElementWithLessWait(driver, loan);
			responseTimeCalculator(driver, loan);
			click(driver,loan);
			asserterText(driver, MssfText,Config.MSSFassert,"Mssf loan");
			
			waitForElementWithLessWait(driver,financier);
			click(driver,financier);
			asserterText(driver, financierText,Config.financerassert,"finacier" );
			
			responseTimeCalculator(driver, raise);
			waitForElementWithLessWait(driver, raise);
			sendKeys(driver, raise , "raise an issue");
			enter(driver);
			System.out.println("raise an issue query is typed");
			addfps(driver, "raise an issue query is typed","",true, "");
			asserterText(driver, raiseText,Config.raiseassert,"raise an issue" );
			
			waitForElementWithLessWait(driver, inputfield);
			sendKeys1(driver, inputfield , "doc");
			System.out.println("user is able type the text doc");
			addfps(driver, "user is able type the text doc","",true, "");
			System.out.println("Predictive text is availble when typing a query");
			addfps(driver, "Predictive text is availble when typing a query","",true, "");
			waitForElementWithLessWait(driver, predictive_text);
			click(driver, predictive_text);
			enter(driver);
			
			waitForElementWithLessWait(driver, inputfield);
			sendKeys(driver, inputfield , "process");
			enter(driver);
			System.out.println("Unsure state text is availble when typing a partial query process");
			addfps(driver, "Unsure state text is availble when typing a partial query process","",true, "");
			asserterText(driver, processText, Config.processassert,"process");
			
			waitForElementWithLessWait(driver, Close_button);
			click(driver, Close_button);	
			
			responseTimeCalculator(driver, submit);
			waitForElementWithLessWait(driver, feedback1);
			click(driver, feedback1);	
			
			waitForElementWithLessWait(driver, feedback2);
			click(driver, feedback2);	
			
			waitForElementWithLessWait(driver, submit);
			click(driver, submit);
			System.out.println("Ratings and queries are submitted.");
			addfps(driver, "Ratings and queries are submitted.","",true, "");
			
			if(Success_popup.contains("Thank you for your valuable feedback")) {
				System.out.println("Thank you for the valuable feedback the popup has received, and the bot is getting closed.");
				addfps(driver, "Thank you for the valuable feedback the popup has received, and the bot is getting closed.","",true, "");
			}else {
				System.out.println("Not get excepted message");
				add1(driver, "Not get excepted message", LogAs.FAILED,true,"");
			}
			
			waitForElementWithLessWait(driver, chatbot);
			click(driver, chatbot);
			System.out.println("Chat Bot opened with history of queries searched before");
			addfps(driver, "Chat Bot opened with history of queries searched before","",true, "");
	  }
		

	}	  
	 
