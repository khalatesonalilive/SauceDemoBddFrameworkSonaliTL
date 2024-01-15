package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {

		File f = new File(System.getProperty("user.dir") + "//src//main//java//ConfigurationLayer//config.properties");

		try {
			fis = new FileInputStream(f);
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//AllDriversFolder//chromedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		String url = prop.getProperty("URL");
		driver.get(url);

	}
}
