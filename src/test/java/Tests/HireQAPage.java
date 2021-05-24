package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HireQAPage extends BaseTest {

    @Test
    public void HireQAWeb(){



        WebElement HireQAWeb = driver.findElement(By.id("menu-item-dropdown-3584"));
        HireQAWeb.click();

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement YourNameWeb=driver.findElement(By.name("yourName"));
        YourNameWeb.click();
        String YourNameValue="Jone Smith";
        YourNameWeb.sendKeys(YourNameValue);

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement YourMailWeb=driver.findElement(By.name("your-email"));
        YourMailWeb.click();
        String YourMailValue="jone.smith.1964@yahoo.com";
        YourMailWeb.sendKeys(YourMailValue);

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement YourPhoneWeb=driver.findElement(By.name("Phone"));
        YourMailWeb.click();
        String YourPhoneValue="+40755648845";
        YourPhoneWeb.sendKeys(YourPhoneValue);

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement YourMessageWeb=driver.findElement(By.name("your-message"));
        YourMessageWeb.click();
        String YourMessageValue= " I have not message to write here! \n I filled in, just for the requirement";
        YourMessageWeb.sendKeys(YourMessageValue);
        YourMessageWeb.sendKeys(Keys.ENTER);

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement ApiWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire API Tester')]"));
        ApiWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/hire-tester/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement PerformanceWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire Performance Testers')]"));
        PerformanceWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/hire-tester/");


        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement SecurityWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire Security Tester')]"));
        SecurityWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/hire-tester/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement SeleniumWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire Selenium Tester')]"));
        SeleniumWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/hire-tester/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement ManualWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire Manual Tester')]"));
        ManualWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/hire-tester/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement AppiumWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire Appium Testers')]"));
        AppiumWeb.click();
        driver.navigate().to("https://www.testrigtechnologies.com/hire-tester/");

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement FunctionalWeb = driver.findElement(By.xpath("//section[@id='hire_tester_pages']//a[contains(@title,'Hire Functional Testers')]"));
        FunctionalWeb.click();


        driver.close();

    }
}
