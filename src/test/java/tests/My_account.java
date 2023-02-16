package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class My_account {
    //    String random_number = RandomStringUtils.random(5, false, true);
//    String random_barcode = RandomStringUtils.random(8, false, true);
//    public String random_string = RandomStringUtils.random(6, true, false);
    public String url ="http://tutorialsninja.com/demo/index.php?route=common/home";
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Test(priority = 0)
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        HomePage.click_on_myAccount(driver).click();
        HomePage.navigate_to_login(driver).click();
        HomePage.enter_email(driver).sendKeys("aya7777@gmail.com");
        HomePage.enter_password(driver).sendKeys("" + 123456789);
        HomePage.click_login(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_my_account() throws InterruptedException {
        HomePage.click_on_myAccount(driver).click();
        Thread.sleep(2000);
    }
}
