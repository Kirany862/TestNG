package testNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_Title_Text {
	@Test
	public void titleTest() {
		SoftAssert softassert = new SoftAssert();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String exptitle = "Electronics, eCars, Fashion, Collectibles & More | eBay";
		String exptext = "Search";

		String acttitle = driver.getTitle();
		System.out.println("Verifying Title");
		softassert.assertEquals(acttitle, exptitle, "Title verification failed");

		String acttext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying Text");
		softassert.assertEquals(acttext, exptext, "Title verification failed");
		System.out.println("Closing Browser");
		softassert.assertAll();
		driver.close();
	}
}
