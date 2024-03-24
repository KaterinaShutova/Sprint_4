package AllTest;
import PomPackageBlackScooter.*;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OrderBlackScooterFor3days {

    @Rule
    public DriverFarm driverFarm = new DriverFarm();

    @Test
    public void testOrderButton() {

        WebDriver driver = driverFarm.getDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderForm orderFormPage = new OrderForm(driver);

        orderFormPage.clickOnCookies();

        orderFormPage.clickOnOrderButton();

        ForWhomScooter forWhomScooterPage = new ForWhomScooter(driver);

        String name = "Василий";
        String surname = "Петров";
        String address = "Пирогова 5";
        String phone = "89123445678";

        forWhomScooterPage.setName(name);

        forWhomScooterPage.setSurname(surname);

        forWhomScooterPage.setAddress(address);

        forWhomScooterPage.clickOnMetroSelect();

        forWhomScooterPage.clickOnStation();

        forWhomScooterPage.setPhone(phone);

        forWhomScooterPage.clickOnNextButton();

        AboutRent aboutRentPage = new AboutRent(driver);
        String comment = "Быстрая доставка";

        aboutRentPage.clickOnDateField();

        aboutRentPage.setChooseDate();

        aboutRentPage.clickOnRentField();

        aboutRentPage.setDaysRent();

        aboutRentPage.setColorPicker();

        aboutRentPage.fillCommentField(comment);

        aboutRentPage.clickOnOrderButtonForm();

        ModalPage modalPagePage = new ModalPage(driver);

        modalPagePage.checkVisibilityModal();

        modalPagePage.clickOnYesButton();

        ModalPageSuccess modalPageSuccessPage = new ModalPageSuccess(driver);

        modalPageSuccessPage.checkVisibilityModalSuccess();

    }
}
