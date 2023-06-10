package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Single_Data_Provider {

	@Test(dataProvider = "supplier")
	public void sample(String One) {
		System.out.println(One);
	}

	@DataProvider(name = "supplier")
	public String[] supplier1() {
		String[] data = { "Kiran" };
		return data;
	}
}
