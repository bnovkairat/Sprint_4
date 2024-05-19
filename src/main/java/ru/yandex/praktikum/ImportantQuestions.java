package ru.yandex.praktikum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImportantQuestions {
    private WebDriver driver;
    private By firstQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[1]");
    private By secondQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[2]");
    private By thirdQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[3]");
    private By fourthQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[4]");
    private By fivthQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[5]");
    private By sixthQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[6]");
    private By seventhQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[7]");
    private By eighthQuestion = By.xpath(".//[@class=\"accordion\"]/div/div[8]");
    private By firstAnswer = By.linkText("Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    private By secondAnswer = By.linkText("Пока что у нас так: один заказ — один самокат.");
    private By thirdAnswer = By.linkText("Допустим, вы оформляете заказ на 8 мая.");
    private By fourthAnswer = By.linkText("Только начиная с завтрашнего дня.");
    private By fivthAnswer = By.linkText("Пока что нет!");
    private By sixthAnswer = By.linkText("Самокат приезжает к вам с полной зарядкой.");
    private By seventhAnswer = By.linkText("Да, пока самокат не привезли.");
    private By eighthAnswer = By.linkText("Да, обязательно. Всем самокатов!");
    public static String homepageURL = "https://qa-scooter.praktikum-services.ru/";

    public ImportantQuestions(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForAnswer(String expectedAnswer) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(expectedAnswer)));
    }


}
