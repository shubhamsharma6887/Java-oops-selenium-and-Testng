package selenium.getcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assinment1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://shivaconceptdigital.com/digital1/");
        //d.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[1]")).click();
       // d.navigate().back();
        d.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[2]")).click();
        d.navigate().back();
        d.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[3]")).click();
        d.navigate().back();
        d.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[4]")).click();
        d.navigate().back();
        d.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[5]")).click();
        d.navigate().back();
        d.findElement(By.xpath("//*[@id=\"shopping_dropdown_toggle\"]")).click();
        d.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/div/a")).click();
        d.navigate().back();
        d.findElement(By.xpath("d.findElement(By.xpath(\"\")).click();")).click();
        d.navigate().back();
        d.findElement(By.xpath("//*[@id=\"enrol_now\"]")).click();
        d.navigate().back();
        Thread.sleep(1000);





    }
}
