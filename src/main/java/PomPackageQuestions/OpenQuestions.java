package PomPackageQuestions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class OpenQuestions {

    private WebDriver driver;

    public OpenQuestions(WebDriver driver){

        this.driver = driver;
    }

    public String getAnswerText(int id) {

        return driver.findElement(By.id("accordion__panel-" + id)).getText();
    }
    public WebElement getQuestion(int id) {
        return driver.findElement(By.id("accordion__heading-" + id));
    }

    public WebElement getAnswer(int id) {
        return driver.findElement(By.id("accordion__panel-" + id));
    }

}

