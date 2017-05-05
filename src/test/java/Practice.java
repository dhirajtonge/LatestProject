import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Sameer on 5/5/2017.
 */
public class Practice {
   @Test
    public void firstmethod() throws InterruptedException {
      System.out.println("inside test");
       WebDriver driver =new ChromeDriver();
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Sameer\\Desktop\\Drivers\\chromedriver.exe");
       driver.get("http://www.google.com");
       Thread.sleep(5000);
       driver.close();
   }
}
