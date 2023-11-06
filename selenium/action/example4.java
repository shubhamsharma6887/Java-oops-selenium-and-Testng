package selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dragabble");
        WebElement ele = driver.findElement(By.id("dragBox"));
        System.out.println(ele.getLocation().x);
        System.out.println(ele.getLocation().y);
        Actions obj = new Actions(driver);
        obj.dragAndDropBy(ele,100+ele.getLocation().x,100+ele.getLocation().y).perform();
    }
}
