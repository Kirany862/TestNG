package parameterized_Project_OM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
	@FindBy(xpath = "//input[@id='username']")private WebElement Un;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement Pwd;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUn(String username) {
		Un.sendKeys(username);
	}

	public void enterPwd(String password) {
		Pwd.sendKeys(password);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	Reporter.log("Login Successful",true);
	}
}