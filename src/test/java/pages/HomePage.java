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
    // //*[@id="content"]/div/div[1]/ul[2]/li[2]/a
    public static WebElement click_specification(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[2]/li[2]/a"));
        return element;
    }
    // //*[@id="content"]/div/div[1]/ul[1]/li[4]/a/img
    public static WebElement open_product_img(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[4]/a/img"));
        return element;
    }
    // /html/body/div[2]/div/button[2]
    public static WebElement scroll_product_img(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[2]/div/button[2]"));
        return element;
    }
    // /html/body/div[2]/div/div[1]/div/button
    public static WebElement close_product_img(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button"));
        return element;
    }
    // //*[@id="input-quantity"]
    public static WebElement enter_quantity(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
        return element;
    }
    // //*[@id="button-cart"]
    public static WebElement ADD_to_cart(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
        return element;
    }
    // //*[@id="cart"]/button
    public static WebElement open_my_cart(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
        return element;
    }
}
