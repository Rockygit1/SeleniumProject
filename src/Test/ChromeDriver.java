package Test;



public class ChromeDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("Open url in chrome browser");
    }
}
