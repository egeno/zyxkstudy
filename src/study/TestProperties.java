package study;

import java.io.InputStream;

public class TestProperties {
	InputStream inStream = TestProperties.class.getClassLoader().getResourceAsStream("a.properties");  
}
