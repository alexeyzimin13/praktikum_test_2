package ru.yandex.praktikum;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Praktikum {

    private WebDriver driver;
    //private WebDriverWait wait;
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Button_Button__ra12g")));
        driver.findElement(By.className("Button_Button__ra12g")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input")).sendKeys("Алексей");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input")).sendKeys("Мартов");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input")).sendKeys("г. Псков, ул. Ленина 5");
        driver.findElement(By.className("select-search__input")).click();
        driver.findElement(By.className("select-search__input")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.className("select-search__input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input")).sendKeys("+748583747473");

        driver.findElement(By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_NextButton__1_rCA > button")).click();
        driver.findElement(By.cssSelector(".react-datepicker__input-container > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".react-datepicker__input-container > input:nth-child(1)")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".Dropdown-placeholder")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]")).click();
        driver.findElement(By.id("black")).click();
        driver.findElement(By.cssSelector("div.Input_InputContainer__3NykH:nth-child(4) > input:nth-child(1)")).sendKeys("быстрее привози");
        driver.findElement(By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)")).click();

        driver.findElement(By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".Order_NextButton__1_rCA > button:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement finish = driver.findElement(By.cssSelector("button.Button_Button__ra12g:nth-child(15)"));
        Assert.assertTrue(finish.isDisplayed());
        driver.quit();
    }
}
