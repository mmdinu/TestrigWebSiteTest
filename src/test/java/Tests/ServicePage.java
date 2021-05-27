package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ServicePage extends BaseTest {


    @Test
    public void ServiceWeb() {

        WebElement ServiceWeb = driver.findElement(By.id("menu-item-69"));
        ServiceWeb.click();

        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//section[@id='serviceslist']//a[@title]")));
        List<WebElement> servicesOptionsList = driver.findElements(By.xpath("//section[@id='serviceslist']//a[@title]"));
        int initialSize = (3);
//        servicesOptionsList.size();
        for(int index=0;index<initialSize;index++){
            new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//section[@id='serviceslist']//a[@title]")));
            List<WebElement> newServicesOptionsList = driver.findElements(By.xpath("//section[@id='serviceslist']//a[@title]"));
            CloseMessenger();
            SwitchToDefaultFrame();
            newServicesOptionsList.get(index).click();
            driver.navigate().to("https://www.testrigtechnologies.com/services/");
        }

//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement WebAppTesting = driver.findElement(By.linkText("Web Application Testing"));
//        WebAppTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement MobileAppTesting = driver.findElement(By.linkText("Mobile Application Testing"));
//        MobileAppTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement SecurityTesting = driver.findElement(By.linkText("Security Testing"));
//        SecurityTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//
////        After running the test three times, this item page cracked / blocked (bug)
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement WebApiTesting = driver.findElement(By.xpath("//a[@title='Web API Testing Services']/div[@class='traingle2']"));
////        Sometimes works! Sometimes not!
//        WebApiTesting.click();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement AutomationTesting = driver.findElement(By.xpath("//a[@title='Cloud Testing']/div[@class='traingle2']"));
//        AutomationTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement UsabilityTesting = driver.findElement(By.xpath("//a[@title='Usability Testing']/div[@class='traingle2']"));
//        UsabilityTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement PerformanceTesting = driver.findElement(By.xpath("//a[@title='Performance Testing']/div[@class='traingle2']"));
//        PerformanceTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement CloudTesting = driver.findElement(By.xpath("//a[@title='Cloud Testing']/div[@class='traingle2']"));
//        CloudTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement CompatibilityTesting = driver.findElement(By.xpath("//a[@title='Compatibility Testing']/div[@class='traingle2']"));
//        CompatibilityTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement AndroidTesting = driver.findElement(By.xpath("//a[@title='Android App Testing']/div[@class='traingle2']"));
//        AndroidTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement IOSTesting = driver.findElement(By.xpath("//a[@title='iOS Application Testing']/div[@class='traingle2']"));
//        IOSTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement WebAutTesting = driver.findElement(By.xpath("//a[@title='Web Automation Testing']/div[@class='traingle2']"));
//        WebAutTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement MobileAutTesting = driver.findElement(By.xpath("//a[@title='Mobile Automation Testing']/div[@class='traingle2']"));
//        MobileAutTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement FunctionalTesting = driver.findElement(By.xpath("//a[@title='Functional Testing']/div[@class='traingle2']"));
//        FunctionalTesting.click();
//        driver.navigate().to("https://www.testrigtechnologies.com/services/");
//
//        CloseMessenger();
//        SwitchToDefaultFrame();
//        WebElement RegressionTesting = driver.findElement(By.xpath("//a[@title='Regression Testing']/div[@class='traingle2']"));
//        RegressionTesting.click();

        driver.close();


    }


}
