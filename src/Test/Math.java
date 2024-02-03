package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Math {
    int firstNo;
    int secondNo;

    public static final String UI_TEXT = "Sample string";
    public static final String LOGIN_BUTTON = "//dkfd/dfd";
    public static final String uierror = "Sample string";


    public Math() {

    }

    public Math(int a, int b) {
        firstNo = a;
        secondNo = b;
    }


    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void sum() {
        int c = firstNo + secondNo;
        System.out.println(c);
    }

    public void subtract() {
        int c = firstNo - secondNo;
        System.out.println(c);
    }

}
