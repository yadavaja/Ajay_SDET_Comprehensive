package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTrip {
	WebDriver driver;
	
	@FindBy(xpath = "//iframe[starts-with(@title, 'notification-frame')]")
	WebElement notificationFrame;
	
	public WebElement getNotificationFrame() {
		return notificationFrame;
	}
	
	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	WebElement notificationFrameCloseBtn;
	
	public WebElement getNotificationFrameCloseBtn() {
		return notificationFrameCloseBtn;
	}
	
	@FindBy(xpath = "//span[@class='commonModal__close']")
	WebElement SigninFrameCloseBtn;
	
	public WebElement getSigninFrameCloseBtn() {
		return SigninFrameCloseBtn;
	}
	
	@FindBy(id="fromCity")
	WebElement fromCity;
	
	public WebElement getFromCity() {
		return fromCity;
	}
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement fromCitySearchBtn;
	
	public WebElement getFromCitySearchBtn() {
		return fromCitySearchBtn;
	}
	
	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")
	WebElement fromCitySearchDropdown;
	
	public WebElement getFromCitySearchDropDown() {
		return fromCitySearchDropdown;
	}
	
	@FindBy(id="toCity")
	WebElement toCity;
	
	public WebElement getToCity() {
		return toCity;
	}
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement toCitySearchBtn;
	
	public WebElement getToCitySearchBtn() {
		return toCitySearchBtn;
	}
	
	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")
	WebElement toCitySearchDropdown;
	
	public WebElement getToCitySearchDropDown() {
		return toCitySearchDropdown;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/p")
	WebElement depatureDate;
	
	public WebElement getDepatureDate() {
		return depatureDate;
	}
	
	@FindBy(xpath="//p[contains(text(),'Tap to add a return date for bigger discounts')]")
	WebElement returnDateMainButtom;
	
	public WebElement getReturnDateMainButton() {
		return returnDateMainButtom;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[5]/div/p")
	WebElement returnDate;
	
	public WebElement getReturnDate() {
		return returnDate;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a")
	WebElement SearchBtn;
	
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div/span")
	WebElement popup;
	
	public WebElement getPopup() {
		return popup;
	}
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/p/span")
	WebElement title;
	
	public WebElement getTitle() {
		return title;
	}
	public MakeMyTrip(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
