package commonMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.zeroturnaround.zip.ZipUtil;

import atu.testng.reports.ATUReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.doclet.Reporter;

public class Config extends Keywords {

	public WebDriver driver;

	public static String MSSFassert = "Maruti Suzuki Finance is an end to end digital car financing platform where the customer";
	public static String financerassert = "Maruti Suzuki has currently onboarded 24 Finance partners including all key private banks, PSU banks and NBFCs. Proceed further on your Smart Finance journey to get into the details and explore offers suitable for you.";
	public static String Saleriedassert = "Salaried individuals employed by government or private organizations can avail loan facilities on Smart Finance platform. Proceed on the Smart Finance journey to explore exciting offers designed for you.";
	public static String raiseassert = "to submit a ticket";
	public static String docassert = "Did you mean any of the following?";
	public static String processassert = "Did you mean any of the following?";
	public static String reopenassert = "Did you mean any of the following?";

	ATUReports atuRep = new ATUReports();

	public WebDriver getDriver() throws MalformedURLException {
		return this.driver;

	}

	public void setDriver(WebDriver paramDriver) throws MalformedURLException {
		this.driver = paramDriver;
	}

	public WebDriver getWebDriver(String browserName) throws MalformedURLException {
		if (browserName.equals("Chrome")) {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Comdex/driver/chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			options.addArguments("disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			System.out.println("Chrome Browser launched...");
			setDriver(driver);
			driver.manage().window().maximize();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 1);
			prefs.put("download.default_directory", System.getProperty("user.dir") + "\\DownloadedFiles");
			
			

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			FirefoxOptions option = new FirefoxOptions();
			option.addPreference("dom.webnotifications.enabled", false);
			// option.addPreference("app.update.enabled", false);
			// option.addPreference("geo.enabled", false);
			WebDriver driver = new FirefoxDriver(option);
			System.out.println("Firefox Browser launched...");
			// driver = new FirefoxDriver();
			setDriver(driver);
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			setDriver(driver);
			driver.manage().window().maximize();

		}
		return driver;
	}






 }
