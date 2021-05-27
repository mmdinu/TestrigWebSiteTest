package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DomainsPage extends BaseTest {



        @Test
        public void DomainWeb(){


            CloseMessenger();
            SwitchToDefaultFrame();
            WebElement DomainWeb = driver.findElement(By.id("menu-item-dropdown-3295"));
            DomainWeb.click();

            CloseMessenger();
            SwitchToDefaultFrame();
            WebElement TravelWeb = driver.findElement(By.xpath("//a[@title='Travel Application Testing']/div[@class='traingle2']"));
            TravelWeb.click();
            driver.navigate().to("https://www.testrigtechnologies.com/domains/");

//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement SaasWeb = driver.findElement(By.xpath("//a[@title='SaaS Application Testing']/div[@class='traingle2']"));
//            SaasWeb.click();
//            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement RetailWeb = driver.findElement(By.xpath("//a[@title='Retail Application Testing']/div[@class='traingle2']"));
//            RetailWeb.click();
//            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement BankAppWeb = driver.findElement(By.xpath("//a[@title='BFSI Application Testing']/div[@class='traingle2']"));
//            BankAppWeb.click();
//            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
            CloseMessenger();
            SwitchToDefaultFrame();
            WebElement ErpWeb = driver.findElement(By.xpath("//a[@title='ERP Testing Services']/div[@class='traingle2']"));
            ErpWeb.click();
            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement PaymentWeb = driver.findElement(By.xpath("//a[@title='Payment Gateway Testing Services']/div[@class='traingle2']"));
//            PaymentWeb.click();
//            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement LearningWeb = driver.findElement(By.xpath("//a[@title='E-Learning Application Testing']/div[@class='traingle2']"));
//            LearningWeb.click();
//            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
            CloseMessenger();
            SwitchToDefaultFrame();
            WebElement RealWeb = driver.findElement(By.xpath("//a[@title='Real Estate Software Testing Company']//div[@class='traingle2']"));
            RealWeb.click();
            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement CommerceWeb = driver.findElement(By.xpath("//a[@title='e-Commerce Application Testing']/div[@class='traingle2']"));
//            CommerceWeb.click();
//            driver.navigate().to("https://www.testrigtechnologies.com/domains/");
//
//            CloseMessenger();
//            SwitchToDefaultFrame();
//            WebElement HealthcareWeb = driver.findElement(By.xpath("//a[@title='Healthcare Domain Testing']/div[@class='traingle2']"));
//            HealthcareWeb.click();

            driver.close();




    }
}
