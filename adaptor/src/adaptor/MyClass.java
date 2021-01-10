package adaptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MyClass extends Properties {
	
	public void readFromFile(String filename) throws IOException {
		File file = new File(filename);
		super.load(new FileInputStream(file));
	}

	public void writeToFile(String filename) throws IOException {
		File file = new File(filename);
		super.store(new FileOutputStream(file), "test");
	}

	public void setValue(String key, String value) {
		super.setProperty(key, value);
	}

	public String getValue(String key) {
		return super.getProperty(key);
	}
}
