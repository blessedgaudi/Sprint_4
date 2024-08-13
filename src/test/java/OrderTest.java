import PageObject.OrderPage;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class OrderTest extends BaseTest {
    OrderPage page;

    @Test
    public void checkingOrderMethodDown() {
        commonTest(true);
    }

    @Test
    public void checkingOrderMethodUp() {
        commonTest(false);
    }

    private void commonTest(Boolean isDownButton) {
        page = new OrderPage(driver);
        page.getCookieButton().click();

        if (isDownButton) {
            page.scrollDown();
            page.getOrderDown().click();
        } else {
            page.getOrderUp().click();
        }

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
