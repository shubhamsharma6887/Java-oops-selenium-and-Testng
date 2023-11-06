package selenium.switchcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver ref = new ChromeDriver();
        ref.get("http://output.jsbin.com/usidix/1");
        ref.findElement(By.xpath("/html/body/input")).click();
        String msg = ref.switchTo().alert().getText();
        ref.switchTo().alert().accept();
        System.out.println(msg);
    }
}
