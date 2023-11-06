package selenium.getcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eroomrent_login {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver eroomrent = new ChromeDriver();
        eroomrent.manage().window().maximize();
        eroomrent.get("https://eroomrent.in/ownerlogin.php");
        System.out.println("Margin and padding of owner-login form of ERoomRent");

        WebElement logo = eroomrent.findElement(By.xpath("/html/body/nav/div/a/img"));
        int x = logo.getLocation().x;
        int y = logo.getLocation().y;
        System.out.println("X-axis = "+x+" Y-axis = "+y);

        WebElement title = eroomrent.findElement(By.xpath("/html/body/div[1]/div/center/h4"));
        int x1 = title.getLocation().x;
        int y1 = title.getLocation().y;
        System.out.println("X-axis = "+x1+" Y-axis = "+y1);

        WebElement email = eroomrent.findElement(By.xpath("/html/body/div[1]/div/center/form/input[1]"));
        int x2 = email.getLocation().x;
        int y2 = email.getLocation().y;
        System.out.println("X-axis = "+x2+" Y-axis = "+y2);

        WebElement password = eroomrent.findElement(By.xpath("/html/body/div[1]/div/center/form/input[2]"));
        int x3 = password.getLocation().x;
        int y3 = password.getLocation().y;
        System.out.println("X-axis = "+x3+" Y-axis = "+y3);

        WebElement login = eroomrent.findElement(By.xpath("/html/body/div[1]/div/center/form/center/input"));
        int x4 = login.getLocation().x;
        int y4 = login.getLocation().y;
        System.out.println("X-axis = "+x4+" Y-axis = "+y4);

        WebElement logo2 = eroomrent.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/a/img"));
        int x5 = logo2.getLocation().x;
        int y5 = logo2.getLocation().y;
        System.out.println("X-axis = "+x5+" Y-axis = "+y5);

        WebElement footer = eroomrent.findElement(By.xpath("/html/body/footer/div/div[2]/div[1]/p"));
        int x6 = footer.getLocation().x;
        int y6 = footer.getLocation().y;
        System.out.println("X-axis = "+x6+" Y-axis = "+y6);

    }
}
