import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void logInTest(){
        //click on "logIn"
        click(By.id("pt-login"));
        //fill logIn form
        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("asd@asd.com");

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("1234");

        click(By.id("wpLoginAttempt"));

    }


}
