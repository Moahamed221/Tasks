package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class theSecondTask {
    ChromeDriver driver;

    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "E:\\programs\\chromedriver_win32_2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
        @Test
        public void secondTest () {
        driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/span/ul/li[18]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/span/ul/li[20]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/span/ul/li[2]/div/a/span")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement page1 = driver.findElement(By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[4]/a"));
        page1.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement page2 = driver.findElement(By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[5]/a"));
        page2.click();

        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[2]/div/div/a[3]/div")).click();
        driver.findElement(By.id("add-to-cart-button")).click();


        }
@AfterTest
    public void closeDriver(){

        driver.close();
}
}
