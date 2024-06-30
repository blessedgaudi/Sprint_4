package PageObject;
import org.openqa.selenium.*;

public class MainPage extends BasePage {

    public String url = "https://qa-scooter.praktikum-services.ru/";
    // Вопросы о важном
    // Сколько это стоит? И как оплатить?
    private final By howMuch = By.id("accordion__heading-0");
    private final By howMuchText = By.id("accordion__panel-0");
    // Хочу сразу несколько самокатов! Так можно?
    private final By notOne = By.id("accordion__heading-1");
    private final By notOneText = By.id("accordion__panel-1");
    // Как рассчитывается время аренды?
    private final By rentTime = By.id("accordion__heading-2");
    private final By rentTimeText = By.id("accordion__panel-2");
    // Можно ли заказать самокат прямо на сегодня?
    private final By justToday = By.id("accordion__heading-3");
    private final By justTodayText = By.id("accordion__panel-3");
    // Можно ли продлить заказ или вернуть самокат раньше?
    private final By extensionPossibility = By.id("accordion__heading-4");
    private final By extensionPossibilityText = By.id("accordion__panel-4");
    // Вы привозите зарядку вместе с самокатом?.
    private final By chargeTransfer = By.id("accordion__heading-5");
    private final By chargeTransferText = By.id("accordion__panel-5");
    // Можно ли отменить заказ?
    private final By cancelPossibility = By.id("accordion__heading-6");
    private final By cancelPossibilityText = By.id("accordion__panel-6");
    // Я живу за МКАДом, привезёте?
    private final By outOfMoscow = By.id("accordion__heading-7");
    private final By outOfMoscowText = By.id("accordion__panel-7");
    // Куки
    private final By cookieButton = By.xpath(" //button[@id='rcc-confirm-button']");

    public WebElement getHowMuch() {

        return driver.findElement(howMuch);
    }

    public WebElement getHowMuchText() {

        return driver.findElement(howMuchText);
    }

    public WebElement getNotOne() {

        return driver.findElement(notOne);
    }

    public WebElement getNotOneText() {

        return driver.findElement(notOneText);
    }

    public WebElement getRentTime() {
        return driver.findElement(rentTime);
    }

    public WebElement getRentTimeText() {
        return driver.findElement(rentTimeText);
    }

    public WebElement getJustToday() {
        return driver.findElement(justToday);
    }

    public WebElement getJustTodayText() {
        return driver.findElement(justTodayText);
    }

    public WebElement getExtensionPossibility() {
        return driver.findElement(extensionPossibility);
    }

    public WebElement getExtensionPossibilityText() {
        return driver.findElement(extensionPossibilityText);
    }

    public WebElement getChargeTransfer() {
        return driver.findElement(chargeTransfer);
    }

    public WebElement getChargeTransferText() {

        return driver.findElement(chargeTransferText);
    }

    public WebElement getCancelPossibility() {

        return driver.findElement(cancelPossibility);
    }

    public WebElement getCancelPossibilityText() {

        return driver.findElement(cancelPossibilityText);
    }

    public WebElement getOutOfMoscow() {

        return driver.findElement(outOfMoscow);
    }

    public WebElement getOutOfMoscowText() {

        return driver.findElement(outOfMoscowText);
    }

    public WebElement getCookieButton() {
        return driver.findElement(cookieButton);
    }

    public void scrollDown() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(howMuch));
    }

    public MainPage(WebDriver driver) {
        super(driver);
        driver.get(url);
    }
}