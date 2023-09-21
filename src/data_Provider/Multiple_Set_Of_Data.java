package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Set_Of_Data {
	
	@Test(dataProvider="dataSupplierSampleMethod")
	public void sampleLoginTest(String username, String password) {
		System.out.println("User got Logged in using "+username+"and "+password);
	}
	
	@DataProvider
	public Object[][] dataSupplierSampleMethod() {
		Object[][] data = {{"Kiran","123"},{"Raj","456"},{"Sachin","789"}};
		return data;
	}
}