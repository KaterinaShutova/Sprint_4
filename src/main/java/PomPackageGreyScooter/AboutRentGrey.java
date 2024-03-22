package PomPackageGreyScooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class AboutRentGrey {
    private WebDriver driver;
    // поле Дата
    private By dateField = By.xpath("//input[@placeholder = '* Когда привезти самокат']");
    // выбор даты
    private By chooseDate = By.xpath("//div[contains(@aria-label, 'воскресенье, 31-е марта 2024 г.')]");
    // поле Срок аренды
    private By rent = By.className("Dropdown-placeholder");
    // выбор срока аренды
    private By daysRent = By.xpath("//div[@class='Dropdown-option' and text()='пятеро суток']");
    // выбор цвета
    private By colorPicker = By.id("grey");
    // поле Комментарий
    private By commentField = By.xpath("//input[@placeholder = 'Комментарий для курьера']");
    // кнопка Заказать в форме
    private By orderButtonForm = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    public AboutRentGrey(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnDateField() {
        driver.findElement(dateField).click();
    }
    public void setChooseDate() {
        driver.findElement(chooseDate).click();
    }
    public void clickOnRentField() {
        driver.findElement(rent).click();
    }
    public void setDaysRent() {
        driver.findElement(daysRent).click();
    }
    public void setColorPicker() {
        driver.findElement(colorPicker).click();
    }
    public void fillCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    public void clickOnOrderButtonForm() {
        driver.findElement(orderButtonForm).click();
    }

}
