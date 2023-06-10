package testNG_Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter_Annotation {
@BeforeTest
	public void loginToApplication() {
	System.out.println("Before Test");
}
@AfterTest
public void LogoutFromApplication() {
	System.out.println("Afrer Test");
}
@Test(priority=1)
public void connectToDB() {
	System.out.println("DB Connected");
}
@Test(priority=2,description="LoginApp")
	public void Login() {
	System.out.println("Login to Application");
}
@Test(priority=3,description="LogoutApp")
	public void Logout() {
	System.out.println("Logout from Application");
}
@Test(priority=4)
public void disconnectFromDB() {
	System.out.println("DB Disconnected");
}
@Test
	public void Error() {
	Assert.fail();
}
}