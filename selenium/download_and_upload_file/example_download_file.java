package selenium.download_and_upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class example_download_file {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver","f://chromedriver.exe");
        String baseUrl = "https://demo.guru99.com/test/yahoo.html";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c F:\\wget.exe -P F: --no-check-certificate " + sourceLocation;

        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
        driver.close();
    }

}