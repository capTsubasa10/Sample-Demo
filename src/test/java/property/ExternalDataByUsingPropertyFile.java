package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExternalDataByUsingPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("testdata.properties");

		prop.load(fis);

		String value = prop.getProperty("browser");

		System.out.println(value);

	}

}
