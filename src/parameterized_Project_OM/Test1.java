package parameterized_Project_OM;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	Sheet sh;
	LoginPage l;
	HomePage h;

	@BeforeClass
	public void openbrowser() throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\KIRAN\\Pictures\\Saved Pictures\\ActiTime.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32 (2)109\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		// we need to create obj
		l = new LoginPage(driver);
		h = new HomePage(driver);
	}

	@BeforeMethod
	public void openApp() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUn(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPwd(password);
		l.clickLoginBtn();
	}

	@Test
	public void verifyText() {
		Reporter.log("Running Verify Text", true);
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		String actText = h.verifyText();
		Assert.assertEquals(expText, actText);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout from App", true);
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the browser", true);
	}
}