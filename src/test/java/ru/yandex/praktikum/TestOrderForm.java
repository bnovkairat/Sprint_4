package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOrderForm {
    private WebDriver driver;

    @Test
    public void checkOrderForm(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);

        driver.get("https://qa-scooter.praktikum-services.ru/order");
        OrderForm objOrderForm = new OrderForm(driver);

        objOrderForm.setFirstName("Гена");
        objOrderForm.setSurName("Букин");
        objOrderForm.setAddress("Москва");
        objOrderForm.setStation("Черкизовская");
        objOrderForm.setPhoneNumber("12345678910");
        objOrderForm.clickNextButton();
        objOrderForm.waitForNextWindow();
        objOrderForm.setDate("21.05.2024");
        objOrderForm.setRentTime();
        objOrderForm.clickOrderButton();
        objOrderForm.waitForConfirmationWindow();
        objOrderForm.clickConfirmYes();
        objOrderForm.waitForMessageWindow();

    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
