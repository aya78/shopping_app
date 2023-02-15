package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebElement element=null;

    // public int randomInt ;
    static WebDriver driver = null;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public static WebElement click_on_myAccount(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        return element;
    }
    // //*[@id="top-links"]/ul/li[2]/ul/li[2]/a
    public static WebElement navigate_to_login(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        return element;
    }
    // //*[@id="input-email"]
    public static WebElement enter_email(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        return element;
    }
    // //*[@id="input-password"]
    public static WebElement enter_password(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        return element;
    }
    // //*[@id="content"]/div/div[2]/div/form/input
    public static WebElement click_login(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        return element;
    }
    // //*[@id="content"]/div[2]/div[1]/div/div[3]/button[2]
    public static WebElement add_favorite1(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]"));
        return element;
    }
    // //*[@id="content"]/div[2]/div[3]/div/div[3]/button[2]
    public static WebElement add_favorite2(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]"));
        return element;
    }
    // //*[@id="content"]/div[2]/div[2]/div/div[3]/button[3]
    public static WebElement click_compare(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[3]"));
        return element;
    }
    // //*[@id="content"]/div[2]/div[1]/div/div[1]/a/img
    public static WebElement open_product(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"));
        return element;
    }
}
