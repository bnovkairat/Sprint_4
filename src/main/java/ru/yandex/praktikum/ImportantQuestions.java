package ru.yandex.praktikum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImportantQuestions {
    private WebDriver driver;
    private By firstQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[1]/div[1]");
    private By secondQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[2]");
    private By thirdQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[3]/div[1]");
    private By fourthQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[4]/div[1]");
    private By fivthQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[5]/div[1]");
    private By sixthQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[6]/div[1]");
    private By seventhQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[7]/div[1]");
    private By eighthQuestion = By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[8]/div[1]");
    private By firstAnswer = By.linkText("Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    private By secondAnswer = By.linkText("Пока что у нас так: один заказ — один самокат.");
    private By thirdAnswer = By.linkText("Допустим, вы оформляете заказ на 8 мая.");
    private By fourthAnswer = By.linkText("Только начиная с завтрашнего дня.");
    private By fivthAnswer = By.linkText("Пока что нет!");
    private By sixthAnswer = By.linkText("Самокат приезжает к вам с полной зарядкой.");
    private By seventhAnswer = By.linkText("Да, пока самокат не привезли.");
    private By eighthAnswer = By.linkText("Да, обязательно. Всем самокатов!");

    public ImportantQuestions(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForFirstAnswer(String expectedAnswer) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(expectedAnswer)));
    }
}
