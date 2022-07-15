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
         sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/"));
    }

    @Test
    public void categoriesProductsForGamers(){
        rozetkaHomePage.getCategoriesProductsForGamers();
        Assert.assertTrue(rozetkaHomePage.getCategoriesProductsForGamers().isDisplayed());
    }

    @Test
    public void categoriesHomeTechnique(){
        rozetkaHomePage.getCategoriesHomeTechnique().get(4).click();
        sleep(2);
        Assert.assertTrue(rozetkaHomePage.getHomeTechnique().isDisplayed());
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
       rozetkaHomePage.getCatalogCottageAndGarden().click();
       sleep(2);
       Assert.assertTrue(driver.getCurrentUrl().contains("/dacha-sad-ogorod/c2394297/"));
     }
     @Test
    public void catalogSportsAndHobbies (){
       rozetkaHomePage.getSportsAndHobbies().click();
       sleep(2);
       Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/sport-i-uvlecheniya/c4627893/"));
   }
   @Test
    public void catalogClothesAndShoes(){
       rozetkaHomePage.getCatalogClothesAndShoes().click();
       sleep(2);
       Assert.assertTrue(driver.getCurrentUrl().contains("/shoes_clothes/c1162030/"));
    }
    @Test
    public void beautyAndHealth (){
        rozetkaHomePage.getBeautyAndHealth().click();
        sleep(2);
    Assert.assertTrue(driver.getCurrentUrl().contains("ua/krasota-i-zdorovje/c4629305/"));
   }
    @Test
    public void childrensProducts (){
        rozetkaHomePage.getChildrensProducts().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/kids/c88468/"));
    }
    @Test
    public void zooProducts (){
        rozetkaHomePage.getZooProducts().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/zootovary/c3520929/"));
    }
    @Test
    public void lowCostGoodsProducts (){
        rozetkaHomePage.getLowCostGoodsProducts().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("rasprodaja/c83850/"));
    }
}
