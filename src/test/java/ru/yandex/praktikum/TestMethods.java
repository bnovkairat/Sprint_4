package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestMethods {
    private WebDriver driver;
@Before
    public void createDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
    driver = new ChromeDriver(options);
    }
@After
    public void tearDown() {
        driver.quit();
    }
}
