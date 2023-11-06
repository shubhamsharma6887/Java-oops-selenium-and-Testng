package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_guru {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr519379");
        driver.findElement(By.name("password")).sendKeys("dysUdug");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.linkText("New Customer")).click();
        WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
        driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.id("ad_iframe"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        driver.switchTo().defaultContent();

    }
}


