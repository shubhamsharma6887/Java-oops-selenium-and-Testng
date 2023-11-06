package selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class assinment2 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://shivaconceptdigital.com/");
        Actions obj = new Actions(driver);
        WebElement heading = driver.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/h1"));
        Action text = obj.moveToElement(heading).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").build();
        text.perform();
        driver.navigate().to("https://www.shivaconceptsolution.com/backupmain/test.html");
        WebElement textfield = driver.findElement(By.id("txt1"));
        Action paste = obj.moveToElement(textfield).click().keyDown(Keys.CONTROL).sendKeys("v").build();
        paste.perform();
    }
}
