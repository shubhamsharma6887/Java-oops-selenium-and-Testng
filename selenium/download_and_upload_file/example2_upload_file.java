package selenium.download_and_upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_upload_file {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.id("uploadfile_0")).sendKeys("C://Users//yashk//photo.png");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();

    }
}
