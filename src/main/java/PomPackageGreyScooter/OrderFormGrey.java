package PomPackageGreyScooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class OrderFormGrey {
    private WebDriver driver;
    // кнопка Заказать
    private By orderButton = By.xpath("//button[contains(@class, 'Button_Button__ra12g') and contains(text(), 'Заказать')]");
    // кнопка Закрытия куки
    private By cookies = By.className("App_CookieButton__3cvqF");


    public OrderFormGrey(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnOrderButton() {

        driver.findElement(orderButton).click();
    }

    public void clickOnCookies() {

        driver.findElement(cookies).click();
    }
}
