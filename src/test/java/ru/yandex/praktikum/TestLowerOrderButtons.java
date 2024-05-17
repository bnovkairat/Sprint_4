package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestLowerOrderButtons extends TestMethods{
    private WebDriver driver;

    @Test
    public void checkLowerButton(){
        createDriver();

        driver.get(ImportantQuestions.homepageURL);
        OrderButtons objOrderButtons = new OrderButtons(driver);

        objOrderButtons.clickOrderButtonLower();
        objOrderButtons.waitForOrderWindow("Для кого самокат");
    }

    @Override
    public void tearDown() {
        super.tearDown();
    }
}
