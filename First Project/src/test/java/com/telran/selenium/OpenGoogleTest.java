package com.telran.selenium;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.navigate().to();
    }

    @Test
    public void searchJavaTest() throws InterruptedException{
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("java" + Keys.ENTER);
        Thread.sleep(5000);
    }

    @Test
    public void clickFeelingLucky() throws InterruptedException {
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}