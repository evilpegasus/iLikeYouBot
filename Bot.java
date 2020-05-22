import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner.*;

public class Bot{
    public static void main(String[] args) {
        
        // Set up ChromeDriver
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        

        String url = "https://www.instagram.com/";

        //driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("");

    }
     
    public String getUsername(){
        Scanner scan = new Scanner(System.in);
        String username;
        System.out.println("Enter your username: ");
        username = scan.next();
        return username;
        scan.close();
    }

    public String getPassword(){
        Scanner scan = new Scanner(System.in);
        String password;
        System.out.println("Enter your password: ");
        password = scan.next();
        return password;
        scan.close();
    }


}
