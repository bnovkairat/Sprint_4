package ru.yandex.praktikum;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;


@RunWith(Parameterized.class)
    public class TestPopupAnswers extends BaseTest {

        private final String question;
        private final String expectedAnswer;

        public TestPopupAnswers(String question, String expectedAnswer) {
            this.question = question;
            this.expectedAnswer = expectedAnswer;
        }

        private WebDriver driver;


        @Parameterized.Parameters
        public static Object[] checkText() {

            return new Object[][]{
                    {"Сколько это стоит? И как оплатить?", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {"Хочу сразу несколько самокатов! Так можно?", "Пока что у нас так: один заказ — один самокат."},
                    {"Как рассчитывается время аренды?", "Допустим, вы оформляете заказ на 8 мая."},
                    {"Можно ли заказать самокат прямо на сегодня?", "Только начиная с завтрашнего дня."},
                    {"Можно ли продлить заказ или вернуть самокат раньше?", "Пока что нет!"},
                    {"Вы привозите зарядку вместе с самокатом?", "Самокат приезжает к вам с полной зарядкой."},
                    {"Можно ли отменить заказ?", "Да, пока самокат не привезли."},
                    {"Я жизу за МКАДом, привезёте?", "Да, обязательно. Всем самокатов!"},
            };
        }

            @Test
            public void checkQuestions() {
                createDriver();

                driver.get(ImportantQuestions.homepageURL);
                ImportantQuestions objImportantQuestions = new ImportantQuestions(driver);

                driver.findElement(By.linkText(question)).click();
                objImportantQuestions.waitForAnswer(expectedAnswer);

            }


    }

