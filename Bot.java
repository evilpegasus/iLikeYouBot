import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class Bot{
    public static void main(String[] args) {
		if (System.getProperty("os.name").toLowerCase() == "windows") {
			// Set up ChromeDriver
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        } else if (System.getProperty("os.name").toLowerCase() == "mac"){
            System.setProperty("webdriver.chrome.driver","chromedriver");
        } else {
            System.exit(0);
        }
        WebDriver driver = new ChromeDriver();

        //open Instagram login page
        String url = "https://www.instagram.com/";
        driver.get(url);

        //get the username and password from console input
        String username = getUsername();
        String password = getPassword();
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(username);
        System.out.println(password);
    }
     
    public static String getUsername(){
        Scanner scan = new Scanner(System.in);
        String username;
        System.out.println("Enter your username: ");
        username = scan.next();
        scan.close();
        return username;
        
    }

    public static String getPassword(){
        Scanner scan = new Scanner(System.in);
        String password;
        System.out.println("Enter your password: ");
        password = scan.next();
        scan.close();
        return password;
    }
}
