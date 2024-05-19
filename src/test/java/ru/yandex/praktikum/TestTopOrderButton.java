package ru.yandex.praktikum;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestTopOrderButton extends BaseTest {
private WebDriver driver;

@Test
    public void checkTopButton(){
    createDriver();

    driver.get(ImportantQuestions.homepageURL);
    OrderButtons objOrderButtons = new OrderButtons(driver);

    objOrderButtons.clickOrderButtonTop();
    objOrderButtons.waitForOrderWindow("Для кого самокат");
    }


}
