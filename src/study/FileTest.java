package study;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("hello.txt");
		try {
			FileWriter out = new FileWriter(f);
			out.write("www.it315.org");
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			FileReader in = new FileReader(f);
			char[] buf = new char[1024];
			int len = in.read(buf);
			System.out.println(new String(buf, 0, len));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
