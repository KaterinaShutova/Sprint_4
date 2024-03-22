package AllTest;
import PomPackageGreyScooter.*;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class OrderGreyScooterFor5days {
    @Rule
    public DriverFarm driverFarm = new DriverFarm();

    @Test
    public void testOrderButton() {

        WebDriver driver = driverFarm.getDriver();

        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderFormGrey orderFormGreyPage = new OrderFormGrey(driver);

        orderFormGreyPage.clickOnCookies();

        orderFormGreyPage.clickOnOrderButton();

        ForWhomScooterGrey forWhomScooterGreyPage = new ForWhomScooterGrey(driver);

        String name = "Михаил";
        String surname = "Высоцкий";
        String address = "Пирогова 78";
        String phone = "89123445678";

        forWhomScooterGreyPage.setName(name);

        forWhomScooterGreyPage.setSurname(surname);

        forWhomScooterGreyPage.setAddress(address);

        forWhomScooterGreyPage.clickOnMetroSelect();

        forWhomScooterGreyPage.clickOnStation();

        forWhomScooterGreyPage.setPhone(phone);

        forWhomScooterGreyPage.clickOnNextButton();

        AboutRentGrey aboutRentGreyPage = new AboutRentGrey(driver);
        String comment = "Очень нужно";

        aboutRentGreyPage.clickOnDateField();

        aboutRentGreyPage.setChooseDate();

        aboutRentGreyPage.clickOnRentField();

        aboutRentGreyPage.setDaysRent();

        aboutRentGreyPage.setColorPicker();

        aboutRentGreyPage.fillCommentField(comment);

        aboutRentGreyPage.clickOnOrderButtonForm();

        ModalPageGrey modalPageGreyPage = new ModalPageGrey(driver);

        modalPageGreyPage.checkVisibilityModal();

        modalPageGreyPage.clickOnYesButton();

        ModalPageSuccessGrey modalPageSuccessGreyPage = new ModalPageSuccessGrey(driver);

        modalPageSuccessGreyPage.checkVisibilityModalSuccess();

    }
}
