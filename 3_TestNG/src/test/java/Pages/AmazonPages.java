package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBtn;
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	@FindBy(id="nav-search-submit-button")
	WebElement MagnifierBtn;
	
	public WebElement getMagnifierBtn() {
		return MagnifierBtn;
	}
	
	@FindBy(xpath="//span[starts-with(text(), 'Samsung Galaxy S23')]")
	WebElement firstLink;
	
	public WebElement getFirstLink() {
		return firstLink;
	}
	
	@FindBy(xpath="//span[starts-with(@class, 'a-price-whole')]")
	WebElement Price;
	
	public WebElement getPrice() {
		return Price;
	}
	

	public AmazonPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
