import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    WebDriver driver;
    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(Long.parseLong("3000"));
        driver.quit();
    }
}
