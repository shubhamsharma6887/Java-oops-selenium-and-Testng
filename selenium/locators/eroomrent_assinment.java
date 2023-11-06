package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class eroomrent_assinment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://eroomrent.in/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        Select list1 = new Select(driver.findElement(By.cssSelector("select[name=\"ddlcat\"]")));
        list1.selectByValue("2");
        Thread.sleep(1000);
        Select list2 = new Select(driver.findElement(By.cssSelector("select[name=\"ddlsubcat\"]")));
        list2.selectByValue("7");
        Thread.sleep(1000);
        Select list3 = new Select(driver.findElement(By.cssSelector("select[name=\"ddllocation\"]")));
        list3.selectByValue("13");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"login.php?rid=204\"]")).click();

        String url = driver.getCurrentUrl();

        if (url.equals("https://eroomrent.in/searchroom.php#google_vignette")) {
            WebElement frame1 = driver.findElement(By.cssSelector("iframe[id=\"aswift_2\"]"));
            driver.switchTo().frame(frame1);
            WebElement frame2 = driver.findElement(By.cssSelector("iframe[id=\"ad_iframe\"]"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name=\"txtEmail\"]")).sendKeys("shubham9827@gmail.com");
            driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Shubham9827");
            driver.findElement(By.cssSelector("input[name=\"btnsubmit\"]")).click();
            //driver.findElement(By.cssSelector("input[value=\"Are You Sure for this booking?\"]")).click();
            //driver.switchTo().alert().accept();
            WebElement obj = driver.findElement(By.cssSelector("li.nav-item dropdown"));
            Actions dropdown = new Actions(driver);
            Action list = dropdown.moveToElement(obj).build();
            list.perform();
            driver.findElement(By.linkText("Logout")).click();
        } else {
            driver.findElement(By.cssSelector("input[name=\"txtEmail\"]")).sendKeys("shubham9827@gmail.com");
            driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Shubham9827");
            driver.findElement(By.cssSelector("input[name=\"btnsubmit\"]")).click();
            driver.findElement(By.cssSelector("input[value=\"Are You Sure for this booking?\"]")).click();
        }
    }
}
