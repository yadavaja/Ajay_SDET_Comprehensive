package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPanda {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Speaking']")
	WebElement SpeakingTab;
	
	public WebElement getSpeakingTab() {
		return SpeakingTab;
	}
	
	@FindBy(tagName ="a")
	WebElement links;
	
	public WebElement getlinks() {
		return links;
	}
	
	public AutomationPanda(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
