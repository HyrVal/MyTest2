package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {


    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public void getSite() {
        driver.get("https://rozetka.com.ua/");
    }
    public WebElement getCategoriesLaptops() {
        return driver.findElement(By.xpath("//div[@class='fat-wrap']//li[1]//a[1]"));
    }

    public WebElement getCategoriesNotebook() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[2]"));
    }

    public WebElement getcategoriesProductsForGamers() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[3]/a"));
    }

    public WebElement getCategoriesHomeTechnique() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[5]/a"));
    }

    public WebElement getCategoriesToolsAndAuto() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[6]/a"));

    }

    public WebElement getCatalogEquipmentAndRepair() {
    return driver.findElements(By.cssSelector("[class='menu-categories__link']")).get(6) ;
    }

    public WebElement getcatalogCottageAndGarden() {
    return driver.findElements(By.cssSelector("[class='menu-categories__link']")).get(7);
    }
}
