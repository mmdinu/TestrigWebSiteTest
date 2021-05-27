package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlogPage extends BaseTest {

    @Test
    public void BlogWeb(){


        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement PopularWeb = driver.findElement(By.xpath("//*[@id='blogs']/div/div/div[1]/div/div/a"));
        PopularWeb.click();

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement Top3ApiWeb = driver.findElement(By.xpath("//*[@id='blogs']/div/div[1]/div[1]/h6/a"));
        Top3ApiWeb.click();
        driver.navigate().back();

//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement TopQAAutoWeb = driver.findElement(By.xpath("//*[@id='blogs']/div/div[1]/div[2]/h6/a"));
//        TopQAAutoWeb.click();
//        driver.navigate().back();
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement TopMobileAppWeb = driver.findElement(By.xpath("//*[@id='blogs']/div/div[1]/div[9]/h6/a"));
//        TopMobileAppWeb.click();
//        driver.navigate().back();
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement BlogPg4Web = driver.findElement(By.xpath("//*[@id='blogs']/div/div[2]/ul/li[4]/a"));
//        BlogPg4Web.click();
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement GuideTPTWeb = driver.findElement(By.xpath("//*[@id='blogs']/div/div[1]/div[1]/h6/a"));
//        GuideTPTWeb.click();


        driver.close();

    }
}
