package selenium.switchcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Index")).click();
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("Action")).click();

    }
}
