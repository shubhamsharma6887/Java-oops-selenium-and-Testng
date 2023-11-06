package selenium.switchcommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assinment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver ref = new ChromeDriver();
        ref.get("https://www.shivaconceptsolution.com/backupmain/test3.html");
        ref.findElement(By.xpath("/html/body/input[1]")).click();
        ref.switchTo().alert().accept();
        ref.findElement(By.xpath("/html/body/input[2]")).click();
        ref.switchTo().alert().accept();
        ref.findElement(By.xpath("/html/body/input[3]")).click();
        Thread.sleep(2000);
        ref.switchTo().alert().sendKeys("ok");
        Thread.sleep(2000);
        ref.switchTo().alert().accept();

    }
}
