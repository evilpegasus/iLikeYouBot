import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bot{
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String url = "https://evilpegasus.github.io/";
        String title = "";

        // launch Chrome and direct it to the Base URL
        driver.get(url);

        // get the actual value of the title
        title = driver.getTitle();
        System.out.println("The title of the page is" + title);
       
        //close Chrome
        //driver.close();
       
    }


}
