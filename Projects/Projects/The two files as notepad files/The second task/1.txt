package Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class theFirstOne {

    ChromeDriver driver;

    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "E:\\programs\\chromedriver_win32_2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
@Test
    public void secondTask(){
driver.findElement(By.cssSelector("#routeSlider > div > a.carousel-control-next > span.carousel-control-next-icon")).click();driver.findElement(By.cssSelector("#routeSlider > div > div:nth-child(2) > div > div > ul > li:nth-child(1) > a")).click();
driver.findElement(By.id("txtJourneyDate")).click();
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
driver.findElement(By.id("SrvcSelectBtnForward7")).click();
driver.findElement(By.id("BpFid")).click();
driver.findElement(By.id("BoardingPoint881")).click();
driver.findElement(By.id("DpFid")).click();
driver.findElement(By.id("DroppingPoint2486")).click();
driver.findElement(By.id("Forwardprofile-tab")).click();
driver.findElement(By.id("mobileNo")).sendKeys("6789125987");
driver.findElement(By.id("email")).sendKeys("moha123@gmail.com");
driver.findElement(By.id("Forward26")).click();
driver.findElement(By.id("passengerNameForward0")).sendKeys("Mohamed");
driver.findElement(By.id("id=\"genderCodeIdForward0\"")).click();
driver.findElement(By.id("passengerAgeForward0")).sendKeys("18");
driver.findElement(By.id("concessionIdsForward0")).click();
driver.findElement(By.id("PgBtn")).click();

}
 @AfterTest
    public void closeDriver(){

        driver.close();
    }

}
