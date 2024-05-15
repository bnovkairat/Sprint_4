package ru.yandex.praktikum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderButtons {

    private WebDriver driver;
    private By orderButtonTop = By.className("Button_Button_ra12g[text()='Заказать']");
    private By orderButtonLower = By.className("Button_Button__ra12g Button_Middle__1CSJM[text()='Заказать']");

    public OrderButtons(WebDriver driver){
        this.driver = driver;
    }

    public void clickOrderButtonTop(){
        driver.findElement(orderButtonTop).click();
    }

    public void clickOrderButtonLower(){
        driver.findElement(orderButtonLower).click();
    }

    public void waitForOrderWindow(String orderHeader){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orderHeader)));
    }

}

