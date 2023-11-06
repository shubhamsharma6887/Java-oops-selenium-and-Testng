package selenium.getcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eroomrent_pedding {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        WebDriver eroomrent = new ChromeDriver();
        eroomrent.manage().window().maximize();
        eroomrent.get("https://eroomrent.in/ownerreg.php");
        System.out.println("Margin and padding of owner-registration form of ERoomRent");

        WebElement logo = eroomrent.findElement(By.xpath("/html/body/nav/div/a/img"));
        int x = logo.getLocation().x;
        int y = logo.getLocation().y;
        System.out.println("X-axis = "+x+" Y-axis = "+y);

        WebElement title = eroomrent.findElement(By.xpath("/html/body/div[1]/div/h3"));
        int x1 = title.getLocation().x;
        int y1 = title.getLocation().y;
        System.out.println("X-axis = "+x1+" Y-axis = "+y1);

        WebElement name = eroomrent.findElement(By.xpath("//*[@id=\"txtfname\"]"));
        int x2 = name.getLocation().x;
        int y2 = name.getLocation().y;
        System.out.println("X-axis = "+x2+" Y-axis = "+y2);

        WebElement number = eroomrent.findElement(By.xpath("//*[@id=\"txtmobile1\"]"));
        int x3 = number.getLocation().x;
        int y3 = number.getLocation().y;
        System.out.println("X-axis = "+x3+" Y-axis = "+y3);

        WebElement password = eroomrent.findElement(By.xpath("//*[@id=\"txtpass\"]"));
        int x4 = password.getLocation().x;
        int y4 = password.getLocation().y;
        System.out.println("X-axis = "+x4+" Y-axis = "+y4);

        WebElement cpassword = eroomrent.findElement(By.xpath("//*[@id=\"txtcpass\"]"));
        int x5 = cpassword.getLocation().x;
        int y5 = cpassword.getLocation().y;
        System.out.println("X-axis = "+x5+" Y-axis = "+y5);

        WebElement email = eroomrent.findElement(By.xpath("/html/body/div[1]/div/form/div[5]/input"));
        int x6 = email.getLocation().x;
        int y6 = email.getLocation().y;
        System.out.println("X-axis = "+x6+" Y-axis = "+y6);

        WebElement submit = eroomrent.findElement(By.xpath("/html/body/div[1]/div/form/div[6]/input"));
        int x7 = submit.getLocation().x;
        int y7 = submit.getLocation().y;
        System.out.println("X-axis = "+x7+" Y-axis = "+y7);

        WebElement logo2 = eroomrent.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/a/img"));
        int x8 = logo2.getLocation().x;
        int y8 = logo2.getLocation().y;
        System.out.println("X-axis = "+x8+" Y-axis = "+y8);

        WebElement footer = eroomrent.findElement(By.xpath("/html/body/footer/div/div[2]/div[1]/p"));
        int x9 = footer.getLocation().x;
        int y9 = footer.getLocation().y;
        System.out.println("X-axis = "+x9+" Y-axis = "+y9);

    }
}
