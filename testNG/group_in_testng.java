package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class group_in_testng {
    WebDriver driver;
    @Test (groups={"car"})
    public void ciaz(){
        System.out.println("maruti car ciaz");
    }
    @Test (groups = {"car"})
    public void nexon(){
        System.out.println("tata car nexon");
    }
    @Test (groups = {"car"})
    public void i20(){
        System.out.println("hundai car i20");
    }
    @Test (groups = {"moterbike"})
    public void hero(){
        System.out.println("hero moterbike");
    }
    @Test (groups = {"moterbike"})
    public void honda(){
        System.out.println("honda moterbike");
    }
    @Test (groups = {"moterbike"})
    public void bajaj(){
        System.out.println("bajaj moterbike");
    }
    @BeforeGroups("moterbike")
    public void yamaha(){
        System.out.println("before group");
    }
    @AfterGroups("car")
    public void tesla(){
        System.out.println("after group");
    }
}
