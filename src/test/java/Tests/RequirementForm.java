package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RequirementForm extends BaseTest {


    @Test
    public void FormWeb() {

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement YourNameWeb=driver.findElement(By.name("your-name"));
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
        WebElement YourSubjectWeb=driver.findElement(By.name("your-subject"));
        YourSubjectWeb.click();
        String YourSubjectValue="I filled in just for the requirement";
        YourSubjectWeb.sendKeys(YourSubjectValue);

        CloseMessenger();
        SwitchToDefaultFrame();
        WebElement YourMessageWeb=driver.findElement(By.name("your-message"));
        YourMessageWeb.click();
        String YourMessageValue="I have not message to write here!";
        YourMessageWeb.sendKeys(YourMessageValue);

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        I didn't notice any difference for the timer!

        CloseMessenger();
        SwitchToDefaultFrame();

          driver.close();


    }


}
