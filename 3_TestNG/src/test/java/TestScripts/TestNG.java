package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNG extends TestBase{
	@Test(priority = 1)
	public void AmazonPrice() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		ap.getSearchBtn().sendKeys("samsung s23");
		ap.getMagnifierBtn().click();
		Thread.sleep(3000);
		ap.getFirstLink().click();
		System.out.println(ap.getPrice().getText());
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 2)
	public void MyTrip() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		
		try {
			driver.findElement(By.xpath("//button[text()='ACCEPT']")).click();
		}catch(Exception e) {
			e.printStackTrace();
		}

		
		String from = "HYD";
		String to = "MAA";
		
		mmt.getFromCity().click();
		Thread.sleep(2000);
		mmt.getFromCitySearchBtn().sendKeys(from);
		Thread.sleep(2000);
		mmt.getFromCitySearchDropDown().click();
		
		mmt.getToCity().click();
		Thread.sleep(2000);
		mmt.getToCitySearchBtn().sendKeys(to);
		Thread.sleep(2000);
		mmt.getToCitySearchDropDown().click();
		Thread.sleep(2000);
		mmt.getDepatureDate().click();
		mmt.getReturnDateMainButton().click();
		Thread.sleep(2000);
		mmt.getReturnDate().click();
		mmt.getSearchBtn().click();
		Thread.sleep(10000);
		mmt.getPopup().click();
		Thread.sleep(2000);
		

		System.out.println(mmt.getTitle().getText());
		if(mmt.getTitle().getText().contains("Flights from")) {
			System.out.println("Searched page is displayed");
		}
		else {
			System.out.println("Searched page is not displayed");
		}
	}
	
	@Test(priority = 3)
	public void AutomationPanda() throws InterruptedException {
		driver.get("https://automationpanda.com/");
		gp.getSpeakingTab().click();
		
		
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
        System.out.println("Number of links on Web Page :" +numberOfLinks );
		Thread.sleep(3000);
	}
}
