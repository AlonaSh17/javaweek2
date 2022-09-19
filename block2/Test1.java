package aqa.block2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class Test1 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
      //  System.setProperty("webdriver.geco.driver", "C:\\tools\\geckodriver.exe");
     //   driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait= new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    @Test
    public void firstTest(){

        driver.get("https://novaposhta.ua/");
        WebElement office =driver.findElement(By.xpath("//a[@href='/office']"));
        office.click();
       driver.findElement(By.xpath("//a[@href='/office']/parent::li//ul//li//a[@href = '/office/list']")).click();
       driver.findElement(By.id("oCityFilter")).click();
       driver.findElement(By.id("lidb5c88e0-391c-11dd-90d9-001a92567626")).click();
       driver.findElement(By.id("oWarehouseFilter")).click();
       driver.findElement(By.xpath("//li[@data-warehouse-number=\"6\"]")).click();
       driver.findElement(By.xpath("//a[@href=\"/office/view/id/6/city/Харків\"]")).click();
       String address = driver.findElement(By.xpath("//div[@class=\"text\"]")).getText();
       assertThat(address).contains("вул. Академіка Павлова, 120", "Вантажне", "До 1100 кг");

    }
    @Test
    public void secondTest() {
        driver.get("https://novaposhta.ua/");
        driver.findElement(By.xpath("//a[@class=\"cost\"]")).click();
        driver.findElement(By.name("yt0")).click();
        driver.findElement(By.id("DeliveryForm_senderCity")).click();
        driver.findElement(By.className("cdb5c88d0-391c-11dd-90d9-001a92567626")).click();
      //  driver.findElement(By.xpath("//li[@class=\"cdb5c88d0-391c-11dd-90d9-001a92567626\"]")).click();
        driver.findElement(By.id("DeliveryForm_recipientCity")).click();
       // driver.findElement(By.className("cdb5c88c6-391c-11dd-90d9-001a92567626")).click();
        driver.findElement(By.className("cdb5c88f0-391c-11dd-90d9-001a92567626")).click();
        driver.findElement(By.xpath("//div[@class=\"option_select\"]")).click();
        driver.findElement(By.xpath("//li[@data-value=\"Cargo\"]")).click();
        driver.findElement(By.id("add-pack")).click();
        driver.findElement(By.name("DeliveryForm[packing][1][packType]")).click();
        driver.findElement(By.xpath("//li[@data-value=\"eb8c268e-dcd6-11e8-ad0d-005056b24375\"]//span")).click();
        WebElement floor = driver.findElement(By.id("DeliveryForm_floorCountAsc"));
        floor.sendKeys("5");
        WebElement cost = driver.findElement(By.name("DeliveryForm[optionsSeat][1][weight]"));
        cost.sendKeys("3500");
        WebElement weight = driver.findElement(By.name("DeliveryForm[optionsSeat][1][weight]"));
        weight.sendKeys("25");
        driver.findElement(By.className("btn submit")).click();

    }

    @Test
    public void thirdTest() {
        driver.get("https://novaposhta.ua/");
        driver.findElement(By.xpath("//a[text()=\"Вакансії\"]")).click();
        driver.switchTo().frame("RUAFRAME");
        //driver.findElement(By.xpath("//a[@href=\"javascript:__doPostBack('GridView1$ctl04$btnViewVacancy','')\"]")).click();
        // driver.findElement(By.xpath("//a[@id=\"GridView1_ctl05_btnViewVacancy\"]")).click();
        driver.findElement(By.id("GridView1_ctl04_btnViewVacancy")).click();
        driver.findElement(By.className("vac_links_apply")).click();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        driver.findElement(By.xpath("//santa-button[@class='santa-mr-20']")).click();
        driver.findElement(By.className("primary-normal santa-block santa-typo-regular-bold")).click();
        driver.switchTo().frame(0);
        WebElement cv = driver.findElement(By.tagName("santa-file-upload"));
        cv.sendKeys("C:\\java\\Alona S._QA_Engineer.docx");
        WebElement name = driver.findElement(By.xpath("//form//input[0]"));
        name.sendKeys("Alona");
        WebElement surname = driver.findElement(By.xpath("//form//input[1]")); //id каждый раз меняется
        surname.sendKeys("Shamli");
        WebElement email = driver.findElement(By.xpath("//form//input[2]"));  //id каждый раз меняется
        email.sendKeys("anemnova94@gmail.com");

    }

   @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
