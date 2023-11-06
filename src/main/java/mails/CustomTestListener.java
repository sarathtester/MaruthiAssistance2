package mails;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener{
    private int totalTests = 0;
    private int passedTests = 0;
    private int failedTests = 0;
    private List<String> failedTestNames = new ArrayList<>();

    @Override
    public void onTestStart(ITestResult result) {
        totalTests++;
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        passedTests++;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        failedTests++;
        failedTestNames.add(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Handle skipped tests if needed
    }

    @Override
    public void onFinish(ITestContext context) {
        // You can access the totalTests, passedTests, failedTests, and failedTestNames here
        StringBuilder emailContent = new StringBuilder();
        emailContent.append("Total Tests: ").append(totalTests).append("\n").append("\n");
        emailContent.append("Passed Tests: ").append(passedTests).append("\n").append("\n");;
        emailContent.append("Failed Tests: ").append(failedTests).append("\n").append("\n");;

        if (!failedTestNames.isEmpty()) {
            emailContent.append("Failed Test Names:\n");
            for (String testName : failedTestNames) {
                emailContent.append("TC_Name = ").append(testName).append("\n");
            }
        }
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        // Send email with the content
       // EmailSender.sendTestSummaryEmail("sanjivekumar257@gmail.com", "Maruti Test Summary Report"+" - "+timeStamp, emailContent.toString());
        try {
			EmailSender.sendTestSummaryEmail("sarath.s@trackdfect.com", "Maruti Test Summary Report"+" - "+timeStamp, emailContent.toString(), System.getProperty("user.dir") +"/test-output/emailable-report.html");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}