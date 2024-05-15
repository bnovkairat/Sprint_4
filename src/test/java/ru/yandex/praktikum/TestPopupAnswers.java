package ru.yandex.praktikum;
import org.junit.After;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



    @RunWith(Parameterized.class)
    public class TestPopupAnswers {

        private final By locator;
        private final String expectedAnswer;

        public TestPopupAnswers(By locator, String expectedAnswer) {
            this.locator = locator;
            this.expectedAnswer = expectedAnswer;
        }

        private WebDriver driver;


        @Parameterized.Parameters
        public static Object[] checkText() {

            return new Object[][]{
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[1]/div[1]"), "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[2]"), "Пока что у нас так: один заказ — один самокат."},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[3]/div[1]"), "Допустим, вы оформляете заказ на 8 мая."},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[4]/div[1]"), "Только начиная с завтрашнего дня."},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[5]/div[1]"), "Пока что нет!"},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[6]/div[1]"), "Самокат приезжает к вам с полной зарядкой."},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[7]/div[1]"), "Да, пока самокат не привезли."},
                    {By.xpath(".//[@id=\"root\"]/div/div/div[5]/div[2]/div/div[8]/div[1]"), "Да, обязательно. Всем самокатов!"},
            };
        }


            @Test
            public void checkQuestions() {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox\", \"--headless\", \"--disable-dev-shm-usage");
                driver = new ChromeDriver(options);

                driver.get("https://qa-scooter.praktikum-services.ru/");
                ImportantQuestions objImportantQuestions = new ImportantQuestions(driver);

                driver.findElement(locator).click();
                objImportantQuestions.waitForFirstAnswer(expectedAnswer);

            }

        @After
        public void teardown() {

            driver.quit();
        }

    }

