package study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarStudy {

	public static void main(String[] args) {
		// ������ʾ��������ʱ��  
	    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println(str);

	}

}

