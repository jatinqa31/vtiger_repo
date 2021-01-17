package testcases;
//hariom
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testBase.TestBase;
import testcases.ExtentReporterNG;

public class Listeners extends TestBase implements ITestListener{
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		extentTest.get().fail(result.getThrowable());
		WebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			System.out.println("I Was into catch block to get driver instance of method");
			System.out.println("Exception = "+e.getMessage());
		}

//		 try {
//	            extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver),result.getMethod().getMethodName());
//	            test.log(Status.FAIL, "Failed Case is: " + result.getName());
//	            test.addScreenCaptureFromPath(TestUtilities.takeScreenShot(result.getName()));
//	            test.log(Status.FAIL, result.getName()+" FAIL with error " + result.getThrowable());
//	            
//	        } catch (IOException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
	        
	        //report.flush();
//		try {
//			//getScreenShotPath(testMethodName,driver);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		//		try {
//			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		//test.fail("I am delibrately Failing it");
		
//		String methodname=result.getMethod().getMethodName();
//		result
//		getScreenShotPath(methodname);
		
//	       try {
//	            
//	            test.log(Status.FAIL, "Failed Case is: " + result.getName());
//	            test.addScreenCaptureFromPath(TestUtilities.takeScreenShot(result.getName()));
//	            test.log(Status.FAIL, result.getName()+" FAIL with error " + result.getThrowable());
//	            
//	        } catch (IOException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	//when your testng test starts
	//ExtentReports extent = ExtentReporterNG.extentReportGenerator(); 
	public void onTestStart(ITestResult result) 
	{
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Passed");
		
	}

}
