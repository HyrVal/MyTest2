package Tests;

import Packages.RozetkaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForJulia extends TeatInit {
    @Test
    public void testForJulia() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getCatalogCottageAndGarden().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/dacha-sad-ogorod/c2394297/"));
    }
    @Test
    public void testForJulia2() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getCatalogCottageAndGarden().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/dacha-sad-ogorod/c2394297/"));
    }
    @Test
    public void testForJulia3() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getCatalogCottageAndGarden().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/dacha-sad-ogorod/c2394297/"));
    }
    @Test
    public void testForJulia4() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getCatalogCottageAndGarden().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/dacha-sad-ogorod/c2394297/"));
    }
}

