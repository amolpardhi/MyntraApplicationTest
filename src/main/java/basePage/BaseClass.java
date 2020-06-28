package basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.TestUtils;

public class BaseClass {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;

	public BaseClass() {

		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			config.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = config.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\Drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}

		else {
			System.out.println("Enter browser name");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.Pageload_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(config.getProperty("testSiteURL"));
		
	}
}
