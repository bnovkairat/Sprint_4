package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestTopOrderButton {
private WebDriver driver;

@Test
    public void checkTopButton(){
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
    driver = new ChromeDriver(options);

    driver.get("https://qa-scooter.praktikum-services.ru/");
    OrderButtons objOrderButtons = new OrderButtons(driver);

    objOrderButtons.clickOrderButtonTop();
    objOrderButtons.waitForOrderWindow("Для кого самокат");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
