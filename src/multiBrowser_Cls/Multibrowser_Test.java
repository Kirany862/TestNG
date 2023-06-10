package multiBrowser_Cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser_Test {
	@Parameters("browsername") // annotation
	@Test
	public void TC(String browsername) {// parameterized method
		
		// declare global variable
		WebDriver driver = null;// runtime polymorphism
		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\KIRAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\KIRAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
		}
		// driver.get("https://www.flipkart.com/");
	}
}
