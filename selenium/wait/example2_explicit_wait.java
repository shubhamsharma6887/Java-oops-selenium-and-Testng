package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class example2_explicit_wait {
    public static void main(String[] args) {
        System.setProperty("web.driver.chromedriver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // wait when alert is present
        driver.findElement(By.id("alert")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        // wait when visibility of element occur after some time
        driver.findElement(By.id("populate-text")).click();
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='h2' and text()='Selenium Webdriver']")));
        String text = ele.getText();

        if (text.equals("Selenium Webdriver")) {
            System.out.println(text+" "+"Element is visible");
        } else {
            System.out.println("Element is not visible");
        }

        // wait when element to be clickable display after some time
        driver.findElement(By.id("display-other-button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("hidden"))).click();

        driver.findElement(By.id("enable-button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("disable"))).click();

        // wait when element to selected is select after some time
        driver.findElement(By.id("checkbox")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.id("ch")));

        driver.navigate().to("https://omayo.blogspot.com/");

        // wait until the element is invisible
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("deletesuccess")));
        driver.findElement(By.id("alert2")).click();

    }
}
