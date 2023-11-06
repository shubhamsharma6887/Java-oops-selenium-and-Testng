package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assinment1 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
        driver.findElement(By.id("txt1")).sendKeys("shubham sharma");
        driver.findElement(By.id("txt2")).sendKeys("Shubham121@");
        driver.findElement(By.id("txt3")).sendKeys("shubham.testing@gmail.com");
        WebElement date = driver.findElement(By.xpath("/html/body/input[4]"));
        date.sendKeys("02");
        date.sendKeys("02");
        date.sendKeys("1998");
        driver.findElement(By.id("txt4")).sendKeys("8817431155");
        driver.findElement(By.linkText("Click")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("shivaconcept")).click();
        driver.navigate().back();
    }
}
