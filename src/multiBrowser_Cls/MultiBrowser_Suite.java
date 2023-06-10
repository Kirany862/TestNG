package multiBrowser_Cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiBrowser_Suite {
	@Test
	public void TC() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KIRAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
