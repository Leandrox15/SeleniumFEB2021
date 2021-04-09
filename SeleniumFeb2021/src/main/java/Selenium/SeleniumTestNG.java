package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;

import comun.LeerProperties;

public class SeleniumTestNG {

	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");

	@BeforeTest
	public void startWebDriver() {

		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");

		switch (browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", path + "\\chromeDriver\\chromeDriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--Start-maximized");
			option.addArguments("--Incognito");
			driver = new ChromeDriver(option);
			driver.get(url);
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", path + "\\geckoDriver\\geckodriver.exe");
			FirefoxOptions foption = new FirefoxOptions();
			foption.addArguments("--Start-maximized");
			foption.addArguments("--Incognito");
			driver = new FirefoxDriver(foption);
			driver.get(url);
			break;

		case "edge":
			System.setProperty("webdriver.msedge.driver", path + "\\edgedriver\\msedgedriver.exe");
			EdgeOptions eoption = new EdgeOptions();
			eoption.addArguments("--Start-maximized");
			eoption.addArguments("--Incognito");
			driver = new EdgeDriver(eoption);
			driver.get(url);
			break;
			
			
			default: System.out.println("El driver [ "+ browser+" ] no esta configurado para funcionar en este proyecto");

		}//End switch
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	    catch(Exception e) {
	    	e.printStackTrace();
	    	System.out.println("El Driver no puede ser inicializado");
	    }
	}// End startWebDriver

}// End Class
