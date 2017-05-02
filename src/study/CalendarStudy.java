package study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarStudy {

	public static void main(String[] args) {
		// 完整显示今天日期时间  
	    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println(str);

	}

}

