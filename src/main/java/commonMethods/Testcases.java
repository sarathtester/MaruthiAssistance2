package commonMethods;
import java.io.File;
import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.exceptions.ATUReporterException;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import mails.EmailSender;
import scripts.ChatBot;



@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Testcases extends Config {
	{
		System.setProperty("atu.reporter.config", System.getProperty("user.dir") + "/atu.properties");
	}
	public String appURL;
	public String mailinatorurl;
	public String proxy;
	public String usernameValue;
	public String passwordValue;
	public String project_Name;
	public String version_Name;
	public String environment;
	public String browser;
	public WebDriver driver;
	public String search;

	File f = new File(report_folder_create + "\\reports");

	ChatBot ck = new ChatBot();
    EmailSender sm = new EmailSender();


	@BeforeClass
	public void getDataFromConfig() throws ATUReporterException, IOException, InterruptedException {

		appURL = Utils.getDataFromTestConfig("URL");
		browser = Utils.getDataFromTestConfig("AppBrowser");
		project_Name = Utils.getDataFromTestConfig("Project_Name");
		version_Name = Utils.getDataFromTestConfig("Version_Name");
		driver = getWebDriver(browser);
	}
	
	
	

	@AfterClass
	public void closewindow() {
		quit(driver);
	}
	
	  
	@Test
	public void ChatBot(){
		ck.createnexa(driver, appURL);
		
		
	}
	
//	@AfterSuite
//	public void chatbotassitance1(){
//		//ck.createnexa(driver, appURL);
//		
//	}
//	
	
	
	
//    @AfterMethod
//   public <SendEmail> void afterclass(ITestResult result) throws EmailException
//    {
//    	//sm.Reportgenetrate();
    	
    	
    }

    

    





		
	 
   
   
	

