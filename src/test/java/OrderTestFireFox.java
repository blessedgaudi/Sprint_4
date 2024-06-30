import PageObject.OrderPage;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class OrderTestFireFox extends FireFoxTest {
    OrderPage page;

    @Test
    public void checkingOrderMethodDown() {
        page = new OrderPage(driver);

        page.getCookieButton().click();
        page.scrollDown();
        page.getOrderDown().click();

        page.getName().sendKeys("Гермиона");
        page.getSurname().sendKeys("Грейнджер");
        page.getAdress().sendKeys("г. Хогвартс, ул. Люпина, д.8");
        page.getStation().sendKeys("Арбатская");
        page.getStation().sendKeys(Keys.ARROW_DOWN);
        page.getStation().sendKeys(Keys.ENTER);

        page.getTelephone().sendKeys("+79264445566");

        page.getNext().click();

        page.getWhenToDeliver().sendKeys("31.07.2024");
        page.getWhenToDeliver().sendKeys(Keys.ENTER);
        page.getRentTerm().click();
        page.getSelectRentTerm().click();
        page.getBlackPerl().click();
        page.getComment().sendKeys("Положите зелье для заклинаний");

        page.getFinalOrder().click();

        page.getMakeOrderYes().click();

        assertTrue(page.getSuccessOrder().isDisplayed());
    }

    @Test
    public void checkingOrderMethodUp() {
        page = new OrderPage(driver);
        page.getCookieButton().click();
        page.getOrderUp().click();

        page.getName().sendKeys("Лорд");
        page.getSurname().sendKeys("Воландеморт");
        page.getAdress().sendKeys("г. Азкабан, ул. Седрика, д.7");
        page.getStation().sendKeys("Проспект Мира");
        page.getStation().sendKeys(Keys.ARROW_DOWN);
        page.getStation().sendKeys(Keys.ENTER);
        page.getTelephone().sendKeys("+79265554466");

        page.getNext().click();

        page.getWhenToDeliver().sendKeys("31.07.2024");
        page.getWhenToDeliver().sendKeys(Keys.ENTER);
        page.getRentTerm().click();
        page.getSelectRentTermSix().click();
        page.getGreyDespair().click();
        page.getComment().sendKeys("Нужен крестраж");

        page.getFinalOrder().click();

        page.getMakeOrderYes().click();

        assertTrue(page.getSuccessOrder().isDisplayed());
    }
}
