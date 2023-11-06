package selenium.download_and_upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_upload_file {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C://Users//yashk//photo.png");
        driver.findElement(By.id("file-submit")).click();
    }
}
