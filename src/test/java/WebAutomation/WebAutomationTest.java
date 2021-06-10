package WebAutomation;

import Base.BaseTestAutomation;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WebAutomationTest extends BaseTestAutomation {

    @Test
    public void Automation() throws InterruptedException, AWTException {

        driver.get("https://www.webpagetest.org/result/210306_Ai58_ad51e71a7b3df983174f4888617ced7d/1/details/#waterfall_view_step1");
        driver.manage().window().maximize();
          Robot robot = new Robot();
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        Thread.sleep(1000);
        ScrollPage(50);
        Thread.sleep(1000);


        driver.get("https://www.webpagetest.org/result/210306_AiNV_48bbc445855593364b7124dc5743c43a/1/details/#waterfall_view_step1");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        ScrollPage(60);
        Thread.sleep(1000);


        driver.get("https://nibbler.silktide.com/en_US/reports/www.testrigtechnologies.com");
        driver.manage().window().maximize();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        Thread.sleep(1000);
        ScrollPage(60);
        Thread.sleep(1000);



        driver.get("C:\\Users\\mmdin\\OneDrive\\Automation Testing\\Testare Testrig_Home_Page cu Lighthouse din inspect - Crome.pdf");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        ScrollPage(20);
        Thread.sleep(1000);



        driver.close();






    }
}
