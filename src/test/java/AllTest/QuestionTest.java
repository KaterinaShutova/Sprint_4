package AllTest;
import PomPackageQuestions.OpenQuestions;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class QuestionTest {

    @Rule
    public DriverFarm driverFarm = new DriverFarm();

    private final int id;

    public QuestionTest(int id) {
        this.id = id;
    }

    @Parameterized.Parameters
    public static Object[][] getId() {
        return new Object[][]{
                {0},
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
        };
    }

    @Test
    public void clickQuestion() {
        WebDriver driver = driverFarm.getDriver();

        // перешли на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OpenQuestions objQuestionPage = new OpenQuestions(driver);

        WebElement questionElement = objQuestionPage.getQuestion(id);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionElement);

        questionElement.click();


        WebElement answerElement = objQuestionPage.getAnswer(id);

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(answerElement));

        String answerText = objQuestionPage.getAnswerText(id);


        String expectedAnswer = getExpectedAnswerById(id);

        MatcherAssert.assertThat(answerText, is(expectedAnswer));
    }

    public static String getExpectedAnswerById(int id) {
        switch (id) {
            case 0:
                return "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
            case 1:
                return "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
            case 2:
                return "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
            case 3:
                return "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
            case 4:
                return "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
            case 5:
                return "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
            case 6:
                return "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
            case 7:
                return "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
            default:
                return "";
        }
    }
}