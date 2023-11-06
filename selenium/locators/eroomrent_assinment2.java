package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class eroomrent_assinment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eroomrent.in/");
        WebElement dropdown = driver.findElement(By.cssSelector("li[class=\"nav-item dropdown\"]"));
        Actions obj = new Actions(driver);
        Action ok = obj.moveToElement(dropdown).build();
        ok.perform();
        driver.findElement(By.linkText("Register Here")).click();
        driver.findElement(By.cssSelector("input[name=\"txtfname\"]")).sendKeys("Shubham Sharma");
        driver.findElement(By.cssSelector("input[name=\"txtmobile1\"]")).sendKeys("6265202613");
        driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Shubham1234");
        driver.findElement(By.cssSelector("input[name=\"txtConfirmPassword\"]")).sendKeys("Shubham1234");
        driver.findElement(By.cssSelector("input[name=\"txtEmail\"]")).sendKeys("shubhsharma431155@gmail.com");
        driver.findElement(By.cssSelector("input[value=\"Submit\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        WebElement dropdown2 = driver.findElement(By.cssSelector("li[class=\"nav-item dropdown\"]"));
        Actions obj2 = new Actions(driver);
        Action ok2 = obj2.moveToElement(dropdown2).build();
        ok2.perform();
        driver.findElement(By.linkText("Login Here")).click();
        driver.findElement(By.cssSelector("input[name=\"txtEmail\"]")).sendKeys("shubhsharma431155@gmail.com");
        driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Shubham1234");
        driver.findElement(By.cssSelector("input[name=\"btnsubmit\"]")).click();
        driver.findElement(By.linkText("Add Room")).click();
        Select loction = new Select(driver.findElement(By.id("ddllocation")));
        loction.selectByVisibleText("Vijay Nagar");
        Select category = new Select(driver.findElement(By.id("ddlcat")));
        category.selectByVisibleText("Flat");
        Thread.sleep(1000);
        Select size = new Select(driver.findElement(By.id("subcat")));
        size.selectByValue("7");
        driver.findElement(By.name("txtdesc")).sendKeys("This ad is posted throw automation testing, it is not a real ad.");
        driver.findElement(By.cssSelector("input[type=\"file\"]")).sendKeys("C://Users//yashk//photo.png");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name=\"txtamount\"]")).sendKeys("16000");
        driver.findElement(By.cssSelector("input[name=\"txtfacility\"]")).sendKeys("wifi");
        //driver.findElement(By.cssSelector("input[name=\"btnsubmit\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"viewroom.php\"]")).click();




    }
}
