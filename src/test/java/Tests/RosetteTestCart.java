package Tests;

import Packages.RozetkaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RosetteTestCart extends TeatInit{

 @Test
    public void testCart(){
        RozetkaHomePage rozetkaTestCarte=new RozetkaHomePage(driver);
        rozetkaTestCarte.getSite();
            sleep(2);
       rozetkaTestCarte.getRozetkaTestCarte().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/ua/cart/"));

    }

}
