import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public static final String CHROME = "chrome";


    @Before
    public void setBrowser() {
        if (CHROME.equals(System.getProperty("browser"))) {
            setChromeDriver();
        } else {
            setFireFoxDriver();
        }
    }

    @After
    public void teardown() {
        driver.quit();
    }

    private void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private void setFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
