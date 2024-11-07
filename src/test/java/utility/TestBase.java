package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	
	public TestBase(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver driverManager() throws IOException {
		
		FileInputStream  fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
	String url =	prop.getProperty("QAUrl");
	String browser = prop.getProperty("browser");
		if(driver== null) {
			if(browser.equalsIgnoreCase("chrome"))
			//if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();  //driver gets the life
			}
		else if(browser.equalsIgnoreCase("firefox")) {
		//else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver= new FirefoxDriver();
			}
//			
//			else if(prop.getProperty("browser")=="Edge") {
//				driver= new EdgeDriver();
//			}
			
			
			  driver.navigate().to(url);;
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		  return driver;
	}

}
