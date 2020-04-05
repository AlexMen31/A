import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //Define web browser for the test
        driver = new ChromeDriver();
        //Open URL wikipedia
        driver.get("https://en.wikipedia.org/");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        //pause
        Thread.sleep(5000);
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}

