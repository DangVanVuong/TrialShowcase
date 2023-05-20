package VuongDang;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StadaloneTest {

       public  static void main(String[] args){
           //Todo
           WebDriverManager.chromedriver().setup();
           WebDriver driver= new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://rahulshettyacademy.com/client");
       }
}
