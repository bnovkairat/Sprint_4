package ru.yandex.praktikum;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLowerOrderButtons extends BaseTest {
    private WebDriver driver;

    @Test
    public void checkLowerButton(){
        createDriver();

        driver.get(ImportantQuestions.homepageURL);
        OrderButtons objOrderButtons = new OrderButtons(driver);

        objOrderButtons.clickOrderButtonLower();
        objOrderButtons.waitForOrderWindow("Для кого самокат");
    }


}
