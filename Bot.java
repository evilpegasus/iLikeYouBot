import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bot{
    public static void main(String[] args) {
        // Set up ChromeDriver
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        

        String url = "https://www.instagram.com/";

        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("");
    }


}
