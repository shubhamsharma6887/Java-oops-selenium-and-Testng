package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class example_explicit_wait {
    public static void main(String[] args) {
        System.setProperty("web.driver.chromedriver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.cssSelector("button[onclick=\"timedText()\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        String text = ele.getText();

        if (text.equals("WebDriver")) {
            System.out.println("Element is visible");
        } else {
            System.out.println("Element is not visible");
        }



    }
}
