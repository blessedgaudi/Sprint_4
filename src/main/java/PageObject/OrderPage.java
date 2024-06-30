package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends BasePage {

    public String url = "https://qa-scooter.praktikum-services.ru/";

    // ФОРМА ЗАКАЗА
    // Кнопка "Заказать" вверху страницы
    private final By orderUp = By.className("Button_Button__ra12g");
    // Кнопка "Заказать" внизу страницы
    private final By orderDown = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");

    // <<ФОРМА ЗАКАЗА 1>>
    // Поле "Имя"
    private final By name = By.xpath("//input[@placeholder='* Имя']");
    // Поле "Фамилия"
    private final By surname = By.xpath("//input[@placeholder='* Фамилия']");
    // Поле "Адрес: куда привезти заказ"
    private final By adress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле "Станция метро"
    private final By station = By.xpath("//input[@placeholder='* Станция метро']");
    // Поле "Телефон: на него позвонит курьер"
    private final By telephone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    private final By next = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    // <<ФОРМА ЗАКАЗА 2>>
    // Поле "Когда привезти самокат"
    private final By whenToDeliver = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    // Поле "Срок аренды"
    private final By rentTerm = By.xpath("//div[@class='Dropdown-placeholder']");

    private final By selectRentTerm = By.xpath("//div[@role='option'][contains(text(),'двое суток')]");
    private final By selectRentTermSix = By.xpath("//div[@role='option'][contains(text(),'шестеро суток')]");
    // Поле "чёрный жемчуг"
    private final By blackPerl = By.xpath("//input[@id='black']");
    // Поле "серая безысходность"
    private final By greyDespair = By.xpath("//input[@id='grey']");
    // Поле "Комментарий для курьера"
    private final By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    // Кнопка "Заказать" в заполненное форме
    private final By finalOrder = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    // Поле "Назад" в заполненное форме
    private final By finalBack = By.xpath("/html/body/div/div/div[2]/div[3]/button[1]");

    // <<ФОРМА "Хотите оформить заказ?">>
    // Кнопка "Да"
    private final By makeOrderYes = By.xpath(" //button[contains(text(),'Да')]");
    // Кнопка "Нет"
    private final By makeOrderNo = By.xpath("//button[contains(text(),'Нет')]");
    // Куки
    private final By cookieButton = By.xpath(" //button[@id='rcc-confirm-button']");

    private final By successOrder = By.cssSelector(".Order_NextButton__1_rCA > button:nth-child(1)");

    public WebElement getOrderUp() {

        return driver.findElement(orderUp);
    }

    public WebElement getOrderDown() {

        return driver.findElement(orderDown);
    }

    public WebElement getName() {

        return driver.findElement(name);
    }

    public WebElement getSurname() {

        return driver.findElement(surname);
    }

    public WebElement getAdress() {

        return driver.findElement(adress);
    }

    public WebElement getStation() {

        return driver.findElement(station);
    }

    public WebElement getTelephone() {

        return driver.findElement(telephone);
    }

    public WebElement getNext() {

        return driver.findElement(next);
    }

    public WebElement getWhenToDeliver() {

        return driver.findElement(whenToDeliver);
    }

    public WebElement getRentTerm() {

        return driver.findElement(rentTerm);
    }

    public WebElement getBlackPerl() {

        return driver.findElement(blackPerl);
    }

    public WebElement getGreyDespair() {

        return driver.findElement(greyDespair);
    }

    public WebElement getComment() {

        return driver.findElement(comment);
    }

    public WebElement getFinalOrder() {

        return driver.findElement(finalOrder);
    }

    public WebElement getFinalBack() {

        return driver.findElement(finalBack);
    }

    public WebElement getMakeOrderYes() {

        return driver.findElement(makeOrderYes);
    }

    public WebElement getMakeOrderNo() {

        return driver.findElement(makeOrderNo);
    }

    public WebElement getCookieButton() {
        return driver.findElement(cookieButton);
    }

    public WebElement getSelectRentTerm() {
        return driver.findElement(selectRentTerm);
    }
    public WebElement getSelectRentTermSix() {
        return driver.findElement(selectRentTermSix);
    }

    public WebElement getSuccessOrder() {
        return driver.findElement(successOrder);
    }
    public void scrollDown() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[4]/div[1]")));
    }


    public OrderPage(WebDriver driver) {
        super(driver);
        driver.get(url);
    }

}
