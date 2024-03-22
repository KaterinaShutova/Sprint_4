package PomPackageBlackScooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ModalPage {
    private WebDriver driver;

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }
    // модалка
    private By modalWindow = By.className("Order_Modal__YZ-d3");
    // кнопка "Да" на согласие оформления заказа
    private By yesButton = By.xpath("//button[text()='Да']");

    public void checkVisibilityModal() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Modal__YZ-d3")));
        assert driver.findElement(modalWindow).isDisplayed();
    }
    public void clickOnYesButton() {

        driver.findElement(yesButton).click();
    }

}
