package iTestListener_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class Demo {
	public void ListenersTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/search?q=listeners");
		
		Assert.assertEquals(driver.getTitle(),"Maven Repository: listeners");
	}
}
