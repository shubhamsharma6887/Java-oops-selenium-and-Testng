package selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class example1 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver eRoomRent = new ChromeDriver();
        eRoomRent.get("https://eroomrent.in/");
        WebElement owner_g = eRoomRent.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a"));
        Actions obj = new Actions(eRoomRent);
        Action ok = obj.moveToElement(owner_g).build();
        ok.perform();
        eRoomRent.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[3]/ul/li[2]/a")).click();

    }
}
