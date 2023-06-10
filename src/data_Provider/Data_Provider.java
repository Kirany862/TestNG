package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider = "supplierOne")
	public void sample(String One, String Two, String Three) {
		System.out.println(One + "-" + Two + "-" + Three);
	}

	@DataProvider(name = "supplierOne")
	public String[][] supplier1() {
		String data[][] = { { "Kiran", "Yadav", "Tester" }, 
				{ "Viru", "Jadhav", "Developer" },
				{ "Sachin", "Kumar", "Manager" } };
		return data;
	}

	@DataProvider(name = "supplierTwo")
	public String[][] supplier2() {
		String[][] data = { { "Kishor", "Kumar", "Singer" }, 
							{ "Karan", "Rao", "Dancer" } };
		return data;
	}
}
