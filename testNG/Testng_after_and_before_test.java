package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
public class Testng_after_and_before_test {
    WebDriver driver;
    @BeforeTest
    public void setep(){
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void shivadigital(){
        driver.get("http://shivaconceptdigital.com/");
        List <WebElement> obj = driver.findElements(By.tagName("a"));
        ArrayList <String> data = new ArrayList<String>();
        System.out.println("Total Hyperlinks in Webpage : "+obj.size());
        for (WebElement a : obj){
            String href = a.getAttribute("href");
            data.add(href);
        }
        for (String links : data){
            try {
                if (links!=null){
                    driver.navigate().to(links);
                    driver.navigate().back();
                }
            }catch (Exception r){

            }

        }
    }
    @AfterTest
    public void aftertest(){
        driver.navigate().to("https://www.google.com");
    }

    @BeforeSuite
    public void bsuit(){
        System.out.println("before suit file of a and b");
    }
    @AfterSuite
    public void asuit(){
        System.out.println("after suit file of a and b");
    }
    @BeforeClass
    public void bclass(){
        System.out.println("before class file of a and b");
    }
    @AfterClass
    public void aclass(){
        System.out.println("after class file of a and b");
    }
}
