import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RosetteSiteTest extends TeatInit{
    RozetkaHomePage rozetkaHomePage;
    @BeforeMethod
    public void startUp (){
        rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getSite();

    }
    @Test
    public void categoriesNotebookTest(){
        rozetkaHomePage.getCategoriesBTNTest().click();
//        Assert.assertTrue(Boolean.parseBoolean(driver.getTitle()));
//        Assert.assertTrue();
        Assert.assertTrue(rozetkaHomePage.equals(" Каталог "));
    }
}
