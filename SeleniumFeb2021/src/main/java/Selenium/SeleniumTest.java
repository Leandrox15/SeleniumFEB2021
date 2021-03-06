package Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import comun.LeerProperties;

public class SeleniumTest {
public static Logger log = Logger.getLogger(SeleniumTest.class);
static LeerProperties prop = new LeerProperties();
static WebDriver driver;
static String path = System.getProperty("user.dir");
	
	public static void main(String[] arg) {

		//String path = System.getProperty("user.dir") + "\\chromeDriver\\chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// Options para abrir
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--Start-maximized");
//		option.addArguments("--Incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		prop.getSystemProperties();

		String url = System.getProperty("URL");

		driver.get(url);
//		driver.findElement(By.id("txtUsername"));

		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_usernamebyName = driver.findElement(By.name("txtUsername"));
		WebElement txt_usernamebyXpath = driver.findElement(By.xpath("//div[@id='divUsername']/input"));

		txt_usernameById.sendKeys("Admin");
		WebElement txt_password = driver.findElement(By.id("txtPassword"));
		txt_password.sendKeys("admin123");
		WebElement btn_login = driver.findElement(By.id("btnLogin"));
		btn_login.click();

		try {

			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));

			if (link_welcome.getSize() != null) {

				System.out.println("El login fue Exitoso");
			}

		} catch (NoSuchElementException e) {

			System.out.println("El Login no fue Exitoso");

		}
		
	}//End Main

	public static WebDriver startDriver(String url) {
//		WebDriver driver = new ChromeDriver();
		prop.getSystemProperties();
		
		String browser = System.getProperty("BROWSER");
		
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
		
		    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		    
		    
		}
	
		
		
		
		

		return driver;
	}
	
	
}//End Class
