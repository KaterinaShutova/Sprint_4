package PomPackageGreyScooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class ModalPageSuccessGrey {
    private WebDriver driver;

    public ModalPageSuccessGrey(WebDriver driver) {
        this.driver = driver;
    }
    // кнопка Посмотреть
    private By lookButton = By.xpath("//button[contains(@class, 'Button_Button__ra12g') and text()='Посмотреть статус']");

    public void checkVisibilityModalSuccess() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'Button_Button__ra12g') and text()='Посмотреть статус']")));
        assert driver.findElement(lookButton).isDisplayed();
    }
}
