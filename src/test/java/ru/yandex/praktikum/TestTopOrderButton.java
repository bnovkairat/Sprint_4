package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestTopOrderButton extends TestMethods{
private WebDriver driver;

@Test
    public void checkTopButton(){
    createDriver();

    driver.get(ImportantQuestions.homepageURL);
    OrderButtons objOrderButtons = new OrderButtons(driver);

    objOrderButtons.clickOrderButtonTop();
    objOrderButtons.waitForOrderWindow("Для кого самокат");
    }

    @Override
    public void tearDown() {
        super.tearDown();
    }
}
