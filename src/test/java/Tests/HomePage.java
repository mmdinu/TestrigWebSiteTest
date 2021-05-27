package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {


    @Test
    public void TestAutomat(){

        CloseMessenger();
        SwitchToDefaultFrame();
//        WebElement OurCompanyWeb = driver.findElement(By.linkText("software-testing-company-in-texas"));
        WebElement OurCompanyWeb = driver.findElement(By.linkText("QA Company in Texas"));
//        WebElement OurCompanyWeb = driver.findElement(By.xpath("//*[@id='about_us']/div/div/div[1]/p[2]/a"));
        //*[@id="about_us"]/div/div/div[1]/p[2]/a/strong/em
        OurCompanyWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement WhyUsWeb = driver.findElement(By.className("link"));
        WhyUsWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement OurClientWeb = driver.findElement(By.className("linkss"));
        OurClientWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/");

//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement CaseStudyWeb = driver.findElement(By.id("menu-item-1308"));
//        CaseStudyWeb.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement CareerWeb = driver.findElement(By.id("menu-item-3576"));
//        CareerWeb.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement PopularWeb = driver.findElement(By.id("menu-item-3574"));
//        PopularWeb.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement PrivacyPolicyWeb = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
//        PrivacyPolicyWeb.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement SitemapWeb = driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]"));
        SitemapWeb.click();


        driver.close();



    }
}
