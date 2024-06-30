import PageObject.OrderPage;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class OrderTest extends BaseTest {
    OrderPage page;

    @Test
    public void checkingOrderMethodDown() {
        page = new OrderPage(driver);

        page.getCookieButton().click();
        page.scrollDown();
        page.getOrderDown().click();

        page.getName().sendKeys("Гарри");
        page.getSurname().sendKeys("Поттер");
        page.getAdress().sendKeys("г. Хогвартс, ул. Дамблдора , д.12");
        page.getStation().sendKeys("Дубровка");
        page.getStation().sendKeys(Keys.ARROW_DOWN);
        page.getStation().sendKeys(Keys.ENTER);

        page.getTelephone().sendKeys("+79854536885");

        page.getNext().click();

        page.getWhenToDeliver().sendKeys("31.07.2024");
        page.getWhenToDeliver().sendKeys(Keys.ENTER);
        page.getRentTerm().click();
        page.getSelectRentTerm().click();
        page.getBlackPerl().click();
        page.getComment().sendKeys("Положите волшебную палочку");

        page.getFinalOrder().click();

        page.getMakeOrderYes().click();

        assertTrue(page.getSuccessOrder().isDisplayed());
    }

    @Test
    public void checkingOrderMethodUp() {
        page = new OrderPage(driver);
        page.getCookieButton().click();
        page.getOrderUp().click();

        page.getName().sendKeys("Альбус");
        page.getSurname().sendKeys("Дамблдор");
        page.getAdress().sendKeys("г. Хогсмит, ул. Уизли, д.1");
        page.getStation().sendKeys("Печатники");
        page.getStation().sendKeys(Keys.ARROW_DOWN);
        page.getStation().sendKeys(Keys.ENTER);
        page.getTelephone().sendKeys("+79250001122");

        page.getNext().click();

        page.getWhenToDeliver().sendKeys("31.07.2024");
        page.getWhenToDeliver().sendKeys(Keys.ENTER);
        page.getRentTerm().click();
        page.getSelectRentTermSix().click();
        page.getGreyDespair().click();
        page.getComment().sendKeys("Положите нимбус 2000");

        page.getFinalOrder().click();

        page.getMakeOrderYes().click();

        assertTrue(page.getSuccessOrder().isDisplayed());
    }
}
