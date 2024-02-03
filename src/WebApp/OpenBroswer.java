package WebApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBroswer {
    public static void main(String[] args) {
        System.out.println("Rajesh");
        // to open a chrome browser
        System.setProperty("Webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        //driver.close();
    }
}
