package Base;

import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestAutomation {

    public WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    public void ScrollPage(int maxNumber) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for(int index=0;index<maxNumber;index++) {
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,200)");
        }
    }
}
