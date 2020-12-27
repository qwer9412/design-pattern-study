package adaptor;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIo f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			String a = f.getValue("year");
			System.out.println(a);
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
