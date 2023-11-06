package selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class assinment4 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[id=\"login-button\"]")).click();
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Actions obj = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//html/body/div/div/div/div[2]/div/div/div[1]/img"));
        System.out.println(ele.getLocation().x+" "+ele.getLocation().y);
        Action ok = obj.moveToElement(ele).clickAndHold().dragAndDropBy(ele,300+ele.getLocation().x,300+ele.getLocation().y).build();
        ok.perform();

    }
}
