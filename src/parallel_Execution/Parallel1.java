package parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32 (2)109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
