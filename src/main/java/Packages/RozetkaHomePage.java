package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public WebElement getCategoriesProductsForGamers() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[3]/a"));
    }
    public List<WebElement> getCategoriesHomeTechnique() {
        return driver.findElements(By.xpath("//a[@class='menu-categories__link']"));
    }

    public WebElement getCategoriesToolsAndAuto() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[6]/a"));
    }

    public WebElement getCatalogEquipmentAndRepair() {
    return driver.findElements(By.cssSelector("[class='menu-categories__link']")).get(6) ;
    }

    public WebElement getCatalogCottageAndGarden() {
    return driver.findElements(By.cssSelector("[class='menu-categories__link']")).get(7);
    }
    public WebElement getSportsAndHobbies(){
        return driver.findElement(By.cssSelector("rz-sidebar-fat-menu > div > ul > li:nth-child(9) > a"));
    }

    public WebElement getCatalogClothesAndShoes() {
    return driver.findElement(By.cssSelector(" rz-sidebar-fat-menu > div > ul > li:nth-child(10) > a"));
    }

    public WebElement getHomeTechnique() {
        return driver.findElement(By.xpath("//section//h1[contains(text(), 'Товари для дому')]"));
    }

    public WebElement getBeautyAndHealth() {
        return driver.findElement(By.cssSelector(" rz-sidebar-fat-menu > div > ul > li:nth-child(11) > a"));
    }

    public WebElement getChildrensProducts() {
        return driver.findElement(By.cssSelector("rz-sidebar-fat-menu > div > ul > li:nth-child(12) > a"));
    }

    public WebElement getZooProducts() {
        return driver.findElement(By.cssSelector("rz-sidebar-fat-menu > div > ul > li:nth-child(13) > a"));
    }

    public WebElement getLowCostGoodsProducts() {
        return driver.findElement(By.cssSelector("rz-sidebar-fat-menu > div > ul > li:nth-child(14) > a"));
    }

    public WebElement getRozetkaTestCarte() {
        return driver.findElement(By.cssSelector("rz-cart > button > svg"));
    }
}
