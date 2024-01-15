import time

from selenium import webdriver
from selenium.webdriver.common.by import By


class MakeMyTripPage:
    SigninClosebtn = "//span[@class='commonModal__close']"
    fromCity = "fromCity"
    fromCitySearchBox = "//input[@placeholder='From']"
    fromCitySearchDropdown = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"

    toCity = "toCity"
    toCitySearchBox = "//input[@placeholder='To']"
    toCitySearchDropdown = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"

    depatureDate = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/p"

    returnBtn = "//p[contains(text(),'Tap to add a return date for bigger discounts')]"
    returnDate = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[4]/div/p"

    SearchBtn = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a"

    popup = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div/span"
    title = "//*[@id='root']/div/div[2]/div[2]/div/div[2]/p/span"

    def __init__(self, driver):
        self.driver = driver

    def getSignInBtn(self):
        self.driver.find_element_by_xpath(self.SigninClosebtn).click()
        # self.driver.find_element(By.XPATH("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/span[1]")).click()

    def getFromCity(self, From):
        self.driver.find_element("id", self.fromCity).click()
        time.sleep(2)
        self.driver.find_element("xpath", self.fromCitySearchBox).send_keys(From)
        time.sleep(2)

        self.driver.find_element("xpath", self.fromCitySearchDropdown).click()
        time.sleep(4)
        print("********************************")
        print(self.driver.find_element("xpath", "//*[@for='fromCity']/p").text)

    def getToCity(self, to):
        self.driver.find_element("id", self.toCity).click()
        time.sleep(2)
        self.driver.find_element("xpath", self.toCitySearchBox).send_keys(to)
        time.sleep(2)
        self.driver.find_element("xpath", self.toCitySearchDropdown).click()

    def getDepature(self):
        time.sleep(2)
        self.driver.find_element("xpath", self.depatureDate).click()

    def getReturn(self):
        self.driver.find_element("xpath", self.returnBtn).click()
        time.sleep(2)
        self.driver.find_element("xpath", self.returnDate).click()

    def getSearchBtn(self):
        self.driver.find_element("xpath", self.SearchBtn).click()

    def getPopup(self):
        time.sleep(10)
        self.driver.find_element("xpath", self.popup).click()

    def testMethod(self):
        time.sleep(2)
        return self.driver.find_element("xpath", "//*[@for='fromCity']/p").text

    def getTitle(self):
        time.sleep(2)
        return self.driver.find_element("xpath", self.title).text
