package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import commonMethods.Config;
import commonMethods.Keywords;

public class ChatBot2 extends Keywords {
	

	  public void createnexa1(WebDriver driver, String URL) {
		  
		    navigateUrl(driver, URL);
		  
		    responseTimeCalculator(driver, chatbot);
		    waitForElementWithLessWait(driver, chatbot);
		    click(driver,chatbot);
			
		    responseTimeCalculator(driver, loan);
			waitForElementWithLessWait(driver, loan);
			click(driver,loan);
	  }
}
		  
	 