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
    sleep(2);
    }

    @Test
    public void categoiesLaptops () {
    rozetkaHomePage.getCategoriesLaptops().click();
   sleep(2);
//        Assert.assertTrue(rozetkaHomePage.getCategoriesLaptops().isDisplayed());
    Assert.assertTrue(driver.getCurrentUrl().contains("computers-notebooks/c80253/"));
   }

     @Test
     public void categoriesNotebook (){
         rozetkaHomePage.getCategoriesNotebook().click();
         Assert.assertTrue(rozetkaHomePage.getCategoriesNotebook().isDisplayed());
//         Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/"));
    }

    @Test
    public void categoriesProductsForGamers(){
        rozetkaHomePage.getcategoriesProductsForGamers();
        Assert.assertTrue(rozetkaHomePage.getcategoriesProductsForGamers().isDisplayed());
    }

    @Test
    public void categoriesHomeTechnique(){
        rozetkaHomePage.getCategoriesHomeTechnique().click();
        sleep(2);
        Assert.assertTrue(rozetkaHomePage.getCategoriesHomeTechnique().isDisplayed());
    }

    @Test
    public void categoriesToolsAndAuto(){
        rozetkaHomePage.getCategoriesToolsAndAuto();
        sleep(2);
        Assert.assertTrue(rozetkaHomePage.getCategoriesToolsAndAuto().isDisplayed());
    }
    @Test
    public void catalogEquipmentAndRepair(){
        rozetkaHomePage.getCatalogEquipmentAndRepair().click();
        sleep(2);
//   Assert.assertTrue(rozetkaHomePage.getCatalogEquipmentAndRepair().isDisplayed());
  Assert.assertTrue(driver.getCurrentUrl().contains("/santekhnika-i-remont/c4628418/"));
   }
   @Test
   public void catalogCottageAndGarden(){
       rozetkaHomePage.getcatalogCottageAndGarden().click();
       sleep(2);
       Assert.assertTrue(driver.getCurrentUrl().contains("/dacha-sad-ogorod/c2394297/"));
     }
}
