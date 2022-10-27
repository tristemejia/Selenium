package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String URL=driver.getCurrentUrl();
        System.out.println("URL = " + URL);
        String title= driver.getTitle();
        System.out.println("title = " + title);


        driver.quit();
    }
}