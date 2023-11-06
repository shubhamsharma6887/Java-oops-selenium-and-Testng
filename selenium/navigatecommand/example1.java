package selenium.navigatecommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shivaconceptsolution.com/");
        Thread.sleep(1000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().forward();

    }
}
