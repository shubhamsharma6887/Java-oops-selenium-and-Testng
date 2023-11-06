package selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class example2 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
        WebElement txt = driver.findElement(By.id("txt1"));
        Actions obj = new Actions(driver);
        Action ok = obj.moveToElement(txt).click().keyDown(Keys.SHIFT).sendKeys("shubham").doubleClick().contextClick().build();
        ok.perform();


    }
}
