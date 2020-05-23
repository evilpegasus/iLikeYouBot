import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class Bot{
    public static void main(String[] args) {
        // Detect OS (Windows or Mac only) and set up ChromeDriver
        System.out.println("Detected operating system: " + System.getProperty("os.name"));
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            System.setProperty("webdriver.chrome.driver","chromedriver");
        } else {
            System.exit(0);
        }
        WebDriver driver = new ChromeDriver();

        //Open Instagram login page
        String url = "https://www.instagram.com/";
        driver.get(url);

        //Get the username and password from console input
        String[] credentials = getCredentials();
        String username = credentials[0];
        String password = credentials[1];
        //this broken
        //driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(username);

    }

    public static String[] getCredentials(){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println();
        System.out.println("Enter your password: ");
        String password = scan.next();
        System.out.println();
        scan.close();
        return new String[] {username, password};
    }
}
