package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			String fileName="/a.properties";
//			InputStream in = new BufferedInputStream(new FileInputStream(fileName));
//			InputStream in = this.getClass().getClassLoader()					.getResourceAsStream("/testcase/test.txt");
//			  InputStream in = Object.class.getClassLoader().getResourceAsStream(fileName); 
//			  InputStream in = TestProperties.class.getClassLoader().getResourceAsStream("a.properties");  
			  InputStream inStream = new FileInputStream(new File("filePath"));
//			InputStream in = 
//			prop.load(in);
//			Iterator<String> it = prop.stringPropertyNames().iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				System.out.println(key + ":" + prop.getProperty(key));
//
//			}
//			in.close();

			FileOutputStream oFile = new FileOutputStream("b.properties", true);// true表示追加打开
			prop.setProperty("phole", "10086");
			prop.store(oFile, "The New propertise file");
			oFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

