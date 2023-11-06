package selenium.getcommand;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getcommand {
    public static void main(String[] args) {

        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shivaconceptdigital.com/digital1/");

        //getting the title of the webpage
        String title = driver.getTitle();
        if (title!=""){
            if (title.length()>0 && title.length()<=72){
                System.out.println("Title lenth is correct"+" "+title+" "+title.length());
            }
            else{
                System.out.println("Tittle lenth is incorrect"+" "+title+" "+title.length());
            }
        }
        else {
            System.out.println("Title is not set");
        }

        //getting current url of the web page
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //getting attributes of the current web element
        WebElement art = driver.findElement(By.id("first_logo_1"));
        String src = art.getAttribute("src");
        String width = art.getAttribute("width");
        System.out.println("source of the element is "+src+" "+"width of element is "+width);

        //getting page source of the webpage
        String source = driver.getPageSource();
        System.out.println("Source of the current webpage\n"+source);

        //getting the internal text of the web page
        String heading_text = driver.findElement(By.tagName("h1")).getText();
        if (heading_text!="") {
            System.out.println("Heading text is set = "+heading_text);
        } else {
            System.out.println("heading text of website is not set");
        }

        String paragraph = driver.findElement(By.tagName("p")).getText();
        System.out.println(paragraph);

        // finding total number of heading in current website by FindElements
        List<WebElement> ok= driver.findElements(By.tagName("h1"));
        System.out.println("total number of heading in this website is = "+ok.size());
        if (ok.size()==1){
            System.out.println("valid heading text");
        } else {
            System.out.println("invalid heading text");
        }

        //
        







    }
}
