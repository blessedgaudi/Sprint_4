import PageObject.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class QuestionsTestFirefox extends FireFoxTest {
    MainPage page;

    @Test
    public void checkingTextMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getHowMuch().click();
        Assert.assertEquals("Сколько это стоит? И как оплатить?",
                page.getHowMuch().getText());
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                page.getHowMuchText().getText());
    }

    @Test
    public void checkingNotOneMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getNotOne().click();
        Assert.assertEquals("Хочу сразу несколько самокатов! Так можно?",
                page.getNotOne().getText());
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. " +
                        "Если хотите покататься с друзьями, можете просто сделать " +
                        "несколько заказов — один за другим.",
                page.getNotOneText().getText());
    }

    @Test
    public void checkingRentTimeMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getRentTime().click();
        Assert.assertEquals("Как рассчитывается время аренды?",
                page.getRentTime().getText());
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. " +
                        "Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды " +
                        "начинается с момента, когда вы оплатите заказ курьеру. Если мы " +
                        "привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                page.getRentTimeText().getText());
    }

    @Test
    public void checkingJustTodayMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getJustToday().click();
        Assert.assertEquals("Можно ли заказать самокат прямо на сегодня?",
                page.getJustToday().getText());
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                page.getJustTodayText().getText());
    }

    @Test
    public void checkingExtensionPossibilityMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getExtensionPossibility().click();
        Assert.assertEquals("Можно ли продлить заказ или вернуть самокат раньше?",
                page.getExtensionPossibility().getText());
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно " +
                        "позвонить в поддержку по красивому номеру 1010.",
                page.getExtensionPossibilityText().getText());
    }

    @Test
    public void checkingChargeTransferMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getChargeTransfer().click();
        Assert.assertEquals("Вы привозите зарядку вместе с самокатом?",
                page.getChargeTransfer().getText());
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. " +
                        "Этого хватает на восемь суток — даже если будете кататься " +
                        "без передышек и во сне. Зарядка не понадобится.",
                page.getChargeTransferText().getText());
    }

    @Test
    public void checkingCancelPossibilityMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getCancelPossibility().click();
        Assert.assertEquals("Можно ли отменить заказ?",
                page.getCancelPossibility().getText());
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, " +
                        "объяснительной записки тоже не попросим. Все же свои.",
                page.getCancelPossibilityText().getText());
    }

    @Test
    public void checkingOutOfMoscowMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getOutOfMoscow().click();
        Assert.assertEquals("Я жизу за МКАДом, привезёте?",
                page.getOutOfMoscow().getText());
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                page.getOutOfMoscowText().getText());
    }
}
