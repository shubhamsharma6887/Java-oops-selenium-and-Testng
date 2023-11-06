package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class example_Implicit_wait {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver ref = new ChromeDriver();
        ref.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjGoIXgyduAAxUCxjgGHV0gCycQPAgI");
        //ref.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);   // this method is deprecated.
        ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //
        ref.findElement(By.cssSelector("a[href=\"https://policies.google.com/privacy?hl=en-IN&fg=1\"]")).click();
        ref.navigate().to("https://www.indiamart.com/shiv-digital-web-website-design-digital-marketing-agency/");
        ref.findElement(By.name("rishabh"));

    }
}
