import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaHomePage extends BasePage {


    RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public void getSite() {
        driver.get("https://rozetka.com.ua/");
    }

//    public void getCategoriesNotebookTest() {
//        return driver.findElements(By.xpath("//div[@class='fat-wrap']//li[1]//a[1]"));
//    }

//    public WebElement getCategoriesBTNTest() {
//        return (WebElement) driver.findElements(By.xpath("//div[@class='fat-wrap']//li[1]//a[1]"));
//
//    }
    public WebElement getCategoriesBTNTest() {
        return (WebElement) driver.findElements(By.xpath("//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']"));
    }
}
