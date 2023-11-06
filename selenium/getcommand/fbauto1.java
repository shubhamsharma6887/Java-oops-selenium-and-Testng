package selenium.getcommand;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;

public class fbauto1 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver google = new ChromeDriver(options);
        google.manage().window().maximize();
        google.get("https://www.google.com/");
        google.findElement(By.id("APjFqb")).click();
        WebElement text = google.findElement(By.id("APjFqb"));
        text.sendKeys("facebook.com");
        google.findElement(By.className("gNO89b")).click();
        google.findElement(By.className("LC20lb")).click();
        google.findElement(By.id("email")).click();
        WebElement id = google.findElement(By.id("email"));
        id.sendKeys("8817431155");
        google.findElement(By.id("pass")).click();
        WebElement pwd = google.findElement(By.id("pass"));
        pwd.sendKeys("Shubham9827@");
        google.findElement(By.className("_42ft")).click();
        google.findElement(By.className("x19gujb8")).click();
        WebElement search = google.findElement(By.className("x1i10hfl"));
        search.sendKeys("rishabh sortha");
        google.findElement(By.className("xifccgj")).click();
        google.findElement(By.className("xh8yej3")).click();
        Actions obj = new Actions(google);
        WebElement ele = google.findElement(By.cssSelector("span.xuxw1ft"));
        Action ok = obj.moveToElement(ele).click().build();
        ok.perform();
    }
}
