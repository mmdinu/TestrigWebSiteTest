package Base;

import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.testrigtechnologies.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CheckPopUp();

    }

    public void CheckPopUp(){
        try {
            WebElement closeButton = driver.findElement(By.xpath("//i[@class='fa fa-close closebutton']"));
            if (closeButton.isDisplayed()) {
                closeButton.click();
            }
        }
        catch (NoSuchElementException ignored){}
    }

    public void CloseMessenger(){
        try {
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='drift-frame-controller']")));
            WebElement closeMess = driver.findElement(By.xpath("//div[@class='drift-controller-icon--close']"));
            if(closeMess.isDisplayed()){
                closeMess.click();
            }
        }
        catch (NoSuchElementException ignored){}
    }

    public void SwitchToDefaultFrame(){
        driver.switchTo().defaultContent();
    }


}