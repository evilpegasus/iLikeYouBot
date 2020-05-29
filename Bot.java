import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Scanner;
import java.util.List;
import java.util.NoSuchElementException;

public class Bot {
    public static void main(String[] args) throws InterruptedException {
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
        Actions actions = new Actions(driver);

        //Open Instagram login page
        String url = "https://www.instagram.com/";
        driver.get(url);


        //Get the username and password from console input
        String[] credentials = getCredentials();
        String username = credentials[0];
        String password = credentials[1];
        try {
            dependecies.DriverAPI.parseCredentials(username, password);
        } catch (Exception e) {
            System.out.println("Text input failed");
        }

        //Login to Instagram
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(5000);

        //Click "Not Now" Button When Asked to Save Password
        try {
            driver.findElement(By.className("sqdOP")).click();
        } catch (NoSuchElementException e) {}

        

        //Wait for page load and login to complete
        Thread.sleep(5000);
        driver.findElement(By.className("HoLwm")).click();
        

        //Like posts on feed
        for (int i = 0; i < 5; i++) {
            List<WebElement> possibleHeartButton = driver.findElements(By.className("_8-yf5"));
            for (WebElement element : possibleHeartButton) {
                if (element.getAttribute("aria-label").equals("Like") && element.getSize().getWidth() == 24) {  
                    element.click();
                    System.out.println("Post liked!");
                    Thread.sleep(1000);
                }
            }
        }
        
        
        //Like my posts
        /*
        driver.get("https://www.instagram.com/mingyfong/");
        Thread.sleep(6000);
        List<WebElement> posts = driver.findElements(By.className("eLAPa"));
        for (WebElement post : posts) {
            post.click();
            Thread.sleep(3000);
            //Like post if not yet liked
            List<WebElement> possibleHeartButton = driver.findElements(By.className("_8-yf5"));
            for (WebElement element : possibleHeartButton) {
                if (element.getAttribute("aria-label").equals("Like") && element.getSize().getWidth() == 24) {  //element.getSize().getWidth() == 24 prevents liking comments (width = 12)
                    element.click();
                    System.out.println("Post liked!");
                    Thread.sleep(2000);
                }
            }
            //Close post
            actions.sendKeys(Keys.ESCAPE).perform();
            Thread.sleep(3000);
        }
        */
    }

    public static String[] getCredentials() {
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
