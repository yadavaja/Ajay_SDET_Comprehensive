package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import freemarker.template.SimpleDate;

public class Reporting extends TestListenerAdapter{
	public ExtentHtmlReporter htmlReport;
	public ExtentReports xReport;
	public ExtentTest xTest;
	
	public void onStart(ITestContext testContext) {
		String dateStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "TestNG_Program-"+ dateStamp+".html";
		htmlReport=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
		htmlReport.config().setDocumentTitle("TestNG Program");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setAutoCreateRelativePathMedia(true);
		xReport=new ExtentReports();
		xReport.attachReporter(htmlReport);
		xReport.setSystemInfo("Tester Name :", "Deepan R");
	}
	
	public void onFinish(ITestContext testContext) {
		xReport.flush();
	}
	public void onTestSuccess(ITestResult Tr) {
		xTest = xReport.createTest(Tr.getName());
		xTest.log(Status.PASS, "Test is passed");
		xTest.log(Status.PASS, MarkupHelper.createLabel(Tr.getName(), ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult Tr) {
		xTest = xReport.createTest(Tr.getName());
		xTest.log(Status.FAIL, "Test is failed");
		xTest.log(Status.FAIL, Tr.getThrowable());
		xTest.log(Status.FAIL, MarkupHelper.createLabel(Tr.getName(), ExtentColor.RED));
	}
	public void onTestSkip(ITestResult Tr) {
		xTest = xReport.createTest(Tr.getName());
		xTest.log(Status.SKIP, "Test is skipped");
		xTest.log(Status.SKIP, MarkupHelper.createLabel(Tr.getName(), ExtentColor.AMBER));
	}
}
