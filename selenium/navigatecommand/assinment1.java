package selenium.navigatecommand;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assinment1 {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shivaconceptdigital.com/");
        List <WebElement> obj = driver.findElements(By.tagName("a"));
        System.out.println("Total Hyperlinks in web page = "+obj.size());
        ArrayList <String> arr = new ArrayList<String>();
        for (WebElement a :obj){
            String data = a.getAttribute("href");
            System.out.println(data);
            arr.add(data);
        }
        int on = 0,off = 0;
        for (String url:arr){
            try {
                if (url!=null) {
                    driver.navigate().to(url);
                    Thread.sleep(2000);
                    driver.navigate().back();
                    on++;
                }
            } catch (Exception a){
                off++;
            }
        }
        System.out.println("Total Hyperlinks in web page = "+obj.size());
        System.out.println("Total working links = "+on);
        System.out.println("Total not working links = "+off);

    }
}
