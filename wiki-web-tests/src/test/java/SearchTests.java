import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTests<Public> extends TestBase {

    @Test
    public void SearchWikiTestJava() {
        //Find and type "Java"
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Java");
        //Slick on loupe
        click(By.name("go"));
    }

    @Test
    public void SearchWikiTestQA() {
            //Find and type "QA"
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
            driver.findElement(By.name("search")).sendKeys("QA");
            //Slick on loupe
        click(By.name("go"));
    }
 }



