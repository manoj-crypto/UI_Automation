package base;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseTest {
   public static WebDriver driver;
    Properties prop;

    public baseTest(){
        try{
            prop= new Properties();
            FileInputStream stream=new FileInputStream("C:\\Users\\2025531\\IdeaProjects\\UI_Automation\\src\\test" +
                    "\\java\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Initialisation(){
        String BrowserName= prop.getProperty("browser");
        if(BrowserName.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }else
            driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
    }
}
