package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Parameterized.class)
public class TestOrderForm extends TestMethods{
    private WebDriver driver;

  private final String firstName;
  private final String surName;
  private final String address;
  private final String station;
  private final String phoneNumber;
  private final String date;

  public TestOrderForm(String firstName, String surName, String address, String station, String phoneNumber, String date){
      this.firstName = firstName;
      this.surName = surName;
      this.address = address;
      this.station = station;
      this.phoneNumber = phoneNumber;
      this.date = date;
  }

  @Parameterized.Parameters
    public static Object[] orderForms() {

      return new Object[][]{
              {"Гена", "Букин", "Москва", "Черкизовская", "12345678910", "21.05.2024"},
              {"Пупкин", "Женя", "Таганрог", "Сокольники","10987654321", "21.05.2024"},

  };
}
    @Test
    public void checkOrderForm(){
        createDriver();

        driver.get(ImportantQuestions.homepageURL);
        OrderForm objOrderForm = new OrderForm(driver);

        objOrderForm.setFirstName(firstName);
        objOrderForm.setSurName(surName);
        objOrderForm.setAddress(address);
        objOrderForm.setStation(station);
        objOrderForm.setPhoneNumber(phoneNumber);
        objOrderForm.clickNextButton();
        objOrderForm.waitForNextWindow();
        objOrderForm.setDate(date);
        objOrderForm.setRentTime();
        objOrderForm.clickOrderButton();
        objOrderForm.waitForConfirmationWindow();
        objOrderForm.clickConfirmYes();
        objOrderForm.waitForMessageWindow();

    }

    @Override
    public void tearDown() {
        super.tearDown();
    }
}
