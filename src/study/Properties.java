package study;

import java.io.InputStream;

public class Properties {
	String fileName="/a.properties";
	 InputStream in = Object.class.getClassLoader().getResourceAsStream(fileName); 
}
