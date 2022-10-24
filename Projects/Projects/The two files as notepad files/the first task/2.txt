
package Task1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class theFirstTask {
    ChromeDriver driver;

    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "E:\\programs\\chromedriver_win32_2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
    @Test
    public void firstTest () {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("car accessories");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/span/a/div/img")).click();
        driver.findElement(By.name("submit.add-to-cart")).click();
        //product detail page
        String detail_page=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/span/a/div/img']")).getText();
        //cart page
        String cart_page=driver.findElement(By.xpath("//*[@id=\"sc-item-Cc32e4609-a270-43fb-ab86-7c49877c2853\"]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")).getText();
        Assert.assertEquals(detail_page, cart_page);
    }


@AfterTest
    public void closeDriver(){
      driver.close();

}
}



