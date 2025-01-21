import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cosmetic {

    private WebDriver driver;

    @Before
    public void inicio(){
        System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mdcparis.com.mx/");
    }

    @Test
    public void cosmetico() throws InterruptedException {

        driver.findElement(By.linkText("CUIDADO CAPILAR")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".header-display-desktop .header-title-logo img")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("SKINCARE")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".header-display-desktop .header-title-logo img")).click();
        Thread.sleep(2000);
        driver.close();


      /*  @After
        public void cierre () {
            driver.quit();
        }*/

    }
}
