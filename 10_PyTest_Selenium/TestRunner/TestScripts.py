import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from Pages.MakeMyTripPage import MakeMyTripPage


class Test_001_MakeMyTrip:
    baseURL = "https://www.makemytrip.com/"
    From = "HYD"
    to = "MAA"

    def test_homePageTitle(self):
        self.driver = webdriver.Edge()
        self.driver.maximize_window()
        self.driver.get(self.baseURL)
        self.driver.implicitly_wait(20)

        self.mmt = MakeMyTripPage(self.driver)

        element = WebDriverWait(self.driver, 20).until(
            EC.presence_of_element_located((By.XPATH, "//button[text()='ACCEPT']"))
        )
        element.click()
        # element = WebDriverWait(self.driver, 20).until(
        #     EC.presence_of_element_located((By.XPATH, "//span[@class='commonModal__close']"))
        # )
        # element.click()

        # time.sleep(5)
        self.mmt.getFromCity(self.From)
        self.mmt.getToCity(self.to)
        self.mmt.getDepature()
        self.mmt.getReturn()

        text = self.mmt.testMethod()
        if "Rajiv Gandhi" in text:
            print(text)
            assert True
        else:
            assert False
        self.mmt.getSearchBtn()
        self.mmt.getPopup()

        text2 = self.mmt.getTitle()
        if "Flights from" in text2:
            assert True
        else:
            assert False

        self.driver.close()
