package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {
    public ClickButton(){

    }

    public static <Select> void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.testleaf.com/";
        driver.get(baseUrl);


        WebElement course = driver.findElement(By.xpath("//*[@id=\'main-menu\']/div/ul/li[2]/a"));
        course.click();
        WebElement dev = driver.findElement(By.xpath("/html/body/section[2]/div[2]/ul[1]/li[3]/a"));
        dev.click();
        int txtValue= dev.getSize().getHeight();

        System.out.println(txtValue);
        WebElement linkAbout = driver.findElement(By.xpath("//*[@id=\'main-menu\']/div/ul/li[4]/a"));
        linkAbout.click();
        //WebElement crossx = driver.findElement(By.className("engt-sheet-header-close engt-visible"));
       // crossx.click();
        //WebElement btnContact = driver.findElement(By.id("btn page-btn"));
        //btnContact.click();
        //Select dropdown = new Select();




        //driver.close();
        ClickButton cb = new ClickButton();//System.exit(0);

        sum(2,3);


    }

    public static int sum(int a , int b){
        int c = a+b;
        return c;
    }

}
