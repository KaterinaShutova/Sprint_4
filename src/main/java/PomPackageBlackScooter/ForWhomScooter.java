package PomPackageBlackScooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class ForWhomScooter {
    private WebDriver driver;
    // поле Имя
    private By nameField = By.xpath("//input[@placeholder = '* Имя']");
    // поле Фамилия
    private By surnameField = By.xpath("//input[@placeholder = '* Фамилия']");
    // поле Адрес
    private By addresField = By.xpath("//input[@placeholder = '* Адрес: куда привезти заказ']");
    // поле Выбор станции
    private By selectField = By.className("select-search__input");
    // выбор станции из выпадающего списка
    private By pickUpStation = By.xpath("//li[@class='select-search__row' and @data-index='3']");
    // поле Телефон
    private By phoneField = By.xpath("//input[@placeholder = '* Телефон: на него позвонит курьер']");
    // кнопка Далее
    private By nextButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Далее']");

    public ForWhomScooter(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnMetroSelect() {
        driver.findElement(selectField).click();
    }
    public void clickOnStation() {
        driver.findElement(pickUpStation).click();
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAddress(String address) {
        driver.findElement(addresField).sendKeys(address);
    }
    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }
    public void clickOnNextButton() {
        driver.findElement(nextButton).click();
    }

}
