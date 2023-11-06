package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssselect_example {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
        driver.findElement(By.cssSelector("input#txt1")).sendKeys("shubham sharma");
        driver.findElement(By.cssSelector("input#txt2")).sendKeys("shubham121");
        driver.findElement(By.cssSelector("input[placeholder=\"enter email\"]")).sendKeys("shubham@gmail.com");
        WebElement date = driver.findElement(By.cssSelector("input[placeholder=\"enter date\"]"));
        date.sendKeys("12-12-1998");
        driver.findElement(By.cssSelector("input[placeholder=\"enter number\"]")).sendKeys("8817431155");
        driver.findElement(By.cssSelector("input.abc")).sendKeys("ok");
        driver.findElement(By.cssSelector("input#b")).sendKeys("okkk");
        driver.findElement(By.cssSelector("input[style=\"color:red; width:300px; height:50px; background-color:gray;\"]")).clear();
        driver.findElement(By.cssSelector("input[style=\"color:red; width:300px; height:50px; background-color:gray;\"]")).sendKeys("ok ok ok ok");
        driver.findElement(By.cssSelector("input[value=\"hello\"]")).clear();
        driver.findElement(By.cssSelector("input[value=\"hello\"]")).sendKeys("shiva concept");
        driver.findElement(By.cssSelector("input[value=\"FeMale\"]")).click();
        WebElement msg = driver.findElement(By.tagName("p"));
        System.out.println(msg.getText());
        driver.findElement(By.cssSelector("input[name=\"chk1\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"chk2\"]")).click();
        Select option = new Select(driver.findElement(By.name("c")));
        option.selectByIndex(2);


    }
}
