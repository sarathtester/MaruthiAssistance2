package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commonMethods.Config;
import commonMethods.Keywords;

public class ChatBot extends Keywords {
	

	  public void createnexa(WebDriver driver, String URL) {
		  
		    navigateUrl(driver, URL);
		  
		    responseTimeCalculator(driver, chatbot);
		    waitForElementWithLessWait(driver, chatbot);
		    click(driver,chatbot);
			
		    
		    responseTimeCalculator(driver, loan);
			waitForElementWithLessWait(driver,loan);
			click(driver,loan);
			asserterText(driver, MssfText,Config.MSSFassert,"Mssf loan");
			
			responseTimeCalculator(driver, financier);
			waitForElementWithLessWait(driver,financier);
			click(driver,financier);
			asserterText(driver, financierText,Config.financerassert,"finacier" );
			
			responseTimeCalculator(driver, raise);
			waitForElementWithLessWait(driver, raise);
			sendKeys(driver, raise , "raise an issue");
			enter(driver);
			asserterText(driver, raiseText,Config.raiseassert,"raise an issue" );
			
			responseTimeCalculator(driver, doc);
			waitForElementWithLessWait(driver, doc);
			sendKeys(driver, doc , "doc");
			enter(driver);
			asserterText(driver,docText,Config.docassert,"doc");
			
			responseTimeCalculator(driver, process);
			waitForElementWithLessWait(driver, process);
			sendKeys(driver, process , "process");
			enter(driver);
			asserterText(driver, processText, Config.processassert,"process");
			
			responseTimeCalculator(driver, cross);
			waitForElementWithLessWait(driver, cross);
			click(driver, cross);	
			
			responseTimeCalculator(driver, feed1);
			waitForElementWithLessWait(driver, feed1);
			click(driver, feed1);	
			
			responseTimeCalculator(driver, feed2);
			waitForElementWithLessWait(driver, feed2);
			click(driver, feed2);	
			
			responseTimeCalculator(driver, submit3);
			waitForElementWithLessWait(driver, submit3);
			click(driver, submit3);	
			
			
			    waitForElementWithLessWait(driver, chatbot);
			    click(driver,chatbot);
			    //responseTimeCalculator(driver, process);
			    asserterText(driver, MssfText,Config.MSSFassert,"Mssf loan history");
			    asserterText(driver, financierText,Config.financerassert,"finaciar history" );
			    asserterText(driver, raiseText,Config.raiseassert,"raise an issue history" );
			    asserterText(driver,docText,Config.docassert,"doc history");
			    asserterText(driver, processText, Config.processassert,"process history");
			    
			
	  }
		

	}

			
			
			
			
			
			
//			scrollTop(driver);
//			responseTimeCalculator(driver, salaried);
//			waitForElementWithLessWait(driver, salaried);
//			click(driver, salaried);
//			
//			scrollTop(driver);
//			responseTimeCalculator(driver, main);
//			waitForElementWithLessWait(driver, main);
//			click(driver, main);
//			
//			responseTimeCalculator(driver, dealer);
//			waitForElementWithLessWait(driver, dealer);
//			click(driver, dealer);	
//			
//			responseTimeCalculator(driver, submit1);
//			waitForElementWithLessWait(driver, submit1);
//			
//			click(driver, submit1);
//			
//			
//			
////			responseTimeCalculator(driver, cusname);
//			waitForElementWithLessWait(driver, cusname);
//			sendKeys(driver, cusname , "test");
//			
//			responseTimeCalculator(driver, cusnumber);
//			waitForElementWithLessWait(driver, cusnumber);
//		    sendKeys(driver, cusnumber,"9999999999");
//		    
//		    responseTimeCalculator(driver, cusnumber);
//		    waitForElementWithLessWait(driver, cusnumber);
//			sendKeys(driver, cusnumber,"9999999999");
//			
//			responseTimeCalculator(driver, query);
//			waitForElementWithLessWait(driver, query);
//			sendKeys(driver, query,"test");
//			
//			responseTimeCalculator(driver, journey);
//			waitForElementWithLessWait(driver, journey);
//			click(driver, journey);
//			
//			responseTimeCalculator(driver, jour);
//			waitForElementWithLessWait(driver, jour);
//			click(driver, jour);
//			
//			responseTimeCalculator(driver, components);
//			waitForElementWithLessWait(driver, components);
//            click(driver, components);
//            
//            responseTimeCalculator(driver, comp);
//            waitForElementWithLessWait(driver, comp);
//			click(driver, comp);
//			
//			responseTimeCalculator(driver, submit2);
//			waitForElementWithLessWait(driver, submit2);
//			click(driver, submit2);	
//			
//			responseTimeCalculator(driver, cross);
//			waitForElementWithLessWait(driver, cross);
//			click(driver, cross);	
//			
//			responseTimeCalculator(driver, feed1);
//			waitForElementWithLessWait(driver, feed1);
//			click(driver, feed1);	
//			
//			responseTimeCalculator(driver, feed2);
//			waitForElementWithLessWait(driver, feed2);
//			click(driver, feed2);	
//			
//			responseTimeCalculator(driver, submit3);
//			waitForElementWithLessWait(driver, submit3);
//			click(driver, submit3);	
//
//		  
//		  
		  
	 