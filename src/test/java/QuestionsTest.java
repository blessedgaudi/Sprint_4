import PageObject.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuestionsTest extends BaseTest {

    private MainPage page;
    private final By question;
    private final By answer;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {By.id("accordion__heading-0"), By.id("accordion__panel-0")},
                {By.id("accordion__heading-1"), By.id("accordion__panel-1")},
                {By.id("accordion__heading-2"), By.id("accordion__panel-2")},
                {By.id("accordion__heading-3"), By.id("accordion__panel-3")},
                {By.id("accordion__heading-4"), By.id("accordion__panel-4")},
                {By.id("accordion__heading-5"), By.id("accordion__panel-5")},
                {By.id("accordion__heading-6"), By.id("accordion__panel-6")},
                {By.id("accordion__heading-7"), By.id("accordion__panel-7")}
        });
    }

    public QuestionsTest(By question, By answer) {
        this.question = question;
        this.answer = answer;
    }

    @Test
    public void checkingQuestionMethod() {
        page = new MainPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        driver.findElement(question).click();

        WebElement questionElement = driver.findElement(question);
        WebElement answerElement = driver.findElement(answer);

        Assert.assertEquals(getQuestionText(questionElement), questionElement.getText());
        Assert.assertEquals(getAnswerText(answerElement), answerElement.getText());
    }

    private String getQuestionText(WebElement element) {
        return element.getText();
    }

    private String getAnswerText(WebElement element) {
        return element.getAttribute("innerText");
    }

}
