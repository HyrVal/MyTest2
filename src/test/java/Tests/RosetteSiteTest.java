package Tests;

import Packages.RozetkaHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RosetteSiteTest extends TeatInit{

    RozetkaHomePage rozetkaHomePage;
   @BeforeMethod
    public void beforeStart (){
      rozetkaHomePage=new RozetkaHomePage(driver);
      rozetkaHomePage.getSite();
    }

    @Test
    public void categoiesLaptops () {
//      " post up to BeforeMethod "
//        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//        rozetkaHomePage.getSite();
        rozetkaHomePage.getCategoriesLaptops().click();
        Assert.assertTrue(rozetkaHomePage.getCategoriesLaptops().isDisplayed());
//        sleep(2);
// Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/ua/computers-notebooks/c80253/"));
    }

     @Test
     public void categoriesNotebook (){
//         RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//         rozetkaHomePage.getSite();
         sleep(2);
         rozetkaHomePage.getCategoriesNotebook().click();
         Assert.assertTrue(rozetkaHomePage.getCategoriesNotebook().isDisplayed());
//         Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/"));
    }
    @Test
    public void categoriesProductsForGamers(){
//        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//        rozetkaHomePage.getSite();
        sleep(2);
        rozetkaHomePage.getcategoriesProductsForGamers();
        Assert.assertTrue(rozetkaHomePage.getcategoriesProductsForGamers().isDisplayed());

    }
    @Test
    public void categoriesHomeTechnique(){
//        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//        rozetkaHomePage.getSite();
        sleep(2);
        rozetkaHomePage.getCategoriesHomeTechnique();
        Assert.assertTrue(rozetkaHomePage.getCategoriesHomeTechnique().isDisplayed());

    }
    @Test
    public void categoriesToolsAndAuto(){
//        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//        rozetkaHomePage.getSite();
        sleep(2);
        rozetkaHomePage.getCategoriesToolsAndAuto();
        Assert.assertTrue(rozetkaHomePage.getCategoriesToolsAndAuto().isDisplayed());

    }
}
