package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.shaft.driver.SHAFT;

import pages.HomePage;

import java.io.IOException;

public class scrollingInHome {
//    private static final ThreadLocal<SHAFT.GUI.WebDriver> driver = new ThreadLocal<>();
//    private static final double defaultElementIdentificationTimeout = SHAFT.Properties.timeouts.defaultElementIdentificationTimeout();
    By click_my_account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");

    //    String random_number = RandomStringUtils.random(5, false, true);
//    String random_barcode = RandomStringUtils.random(8, false, true);
//    public String random_string = RandomStringUtils.random(6, true, false);
      public String url ="http://tutorialsninja.com/demo/index.php?route=common/home";
    //public WebDriver driver;
    SHAFT.GUI.WebDriver driver;

//    public static final Dialect W3C = null;
@Test(priority = 0)
    @BeforeMethod(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/Documents/chromedriver_linux64 (4)/chromedriver");
        driver = new SHAFT.GUI.WebDriver();
    }
    @Test(priority = 1)
    public void Valid_login() throws InterruptedException, IOException {
        driver.browser().maximizeWindow();
        driver.browser().navigateToURL(url).performElementAction().click(click_my_account);
//        Runtime.getRuntime().exec("D:\\Data_Personal\\ProxyAuthentication.exe");

//        driver.element().clickUsingJavascript((By) HomePage.click_on_myAccount((WebDriver) driver));

//        HomePage.navigate_to_login(driver).click();
//        HomePage.enter_email(driver).sendKeys("aya7777@gmail.com");
//        HomePage.enter_password(driver).sendKeys("" + 123456789);
//        HomePage.click_login(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_productsToChart() throws InterruptedException {

//      driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a")).click();
//        driver.navigate().to(url);
//        Actions a = new Actions(driver);
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
//        HomePage.add_favorite1(driver).click();
//        HomePage.add_favorite2(driver).click();
//        HomePage.click_compare(driver).click();
//        HomePage.open_product(driver).click();
//        Thread.sleep(2000);
//        HomePage.click_specification(driver).click();
//        HomePage.open_product_img(driver).click();
//        HomePage.scroll_product_img(driver).click();
//        Thread.sleep(1000);
//        HomePage.scroll_product_img(driver).click();
//        HomePage.close_product_img(driver).click();
//        HomePage.enter_quantity(driver).sendKeys(Keys.BACK_SPACE);
//        HomePage.enter_quantity(driver).sendKeys("2");
//        HomePage.ADD_to_cart(driver).click();
//        HomePage.open_my_cart(driver).click();


    }
}
