package WebAutomation;

import Base.BaseTestAutomation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebAutomationTest extends BaseTestAutomation {

    @Test
    public void Automation(){
        WebElement UrlInWeb = driver.findElement(By.name("url"));
        UrlInWeb.click();
        String UrlInValue = "https://www.testrigtechnologies.com/";
        UrlInWeb.sendKeys(UrlInValue);

        WebElement StartTest = driver.findElement(By.xpath("//*[@id='analytical-review']/ul/li[1]/button"));
        StartTest.click();




    }
}
