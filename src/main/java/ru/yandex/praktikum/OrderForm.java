package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderForm {
    private WebDriver driver;
    private By firstNameField = By.className("Input_InputContainer__3NykH[@placeholder='* Имя']");
    private By surNameField = By.className("Input_InputContainer__3NykH[@placeholder='* Фамилия']");
    private By addressField = By.className("Input_InputContainer__3NykH[@placeholder='* Адрес: куда привезти заказ']");
    private By stationField = By.className("select-search__value[@placeholder='* Станция метро']");
    private By phoneNumberField = By.className("Input_InputContainer__3NykH[@placeholder='* Телефон: на него позвонит курьер']");
    private By buttonNext = By.xpath(".//[@id=\"root\"]/div/div[2]/div[3]/button");
    private By dateField = By.className("react-datepicker__input-container[@placeholder='* Когда привезти самокат']");
    private By rentTimeField = By.xpath(".//[@id=\"root\"]/div/div[2]/div[2]/div[2]");
    private By rentTimeOneDayButton = By.className("Dropdown-option is-selected[text()='сутки']");
    private By buttonOrder= By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    private By confirmOrderYesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");

    public OrderForm(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setSurName(String surName){
        driver.findElement(surNameField).sendKeys(surName);
    }
    public void setAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void setStation(String station){
        driver.findElement(stationField).sendKeys(station);
    }
    public void setPhoneNumber(String phoneNumber){
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }
    public void clickNextButton(){
        driver.findElement(buttonNext).click();
    }
    public void waitForNextWindow(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Про аренду")));
    }
    public void setDate(String date){
        driver.findElement(dateField).sendKeys(date);
    }
    public void setRentTime(){
        driver.findElement(rentTimeField).click();
        driver.findElement(rentTimeOneDayButton).click();
    }
    public void clickOrderButton(){
        driver.findElement(buttonOrder).click();
    }
    public void waitForConfirmationWindow(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Хотите оформить заказ?")));
    }
    public void clickConfirmYes(){
        driver.findElement(confirmOrderYesButton).click();
    }
    public void waitForMessageWindow() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Заказ оформлен")));
    }

    public void passFirstWindow(String firstName, String surName, String address, String station, String phoneNumber){
        setFirstName(firstName);
        setSurName(surName);
        setAddress(address);
        setStation(station);
        setPhoneNumber(phoneNumber);
        clickNextButton();
    }
}
