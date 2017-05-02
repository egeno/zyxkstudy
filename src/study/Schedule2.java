package study;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;



public class Schedule2 {
	Calendar calendar = Calendar.getInstance();   
//	calendar.add(Calendar.SECOND,-3);
	
//    Timestamp time = new Timestamp(calendar.getTimeInMillis());
//    
//	Timestamp tmp = new Timestamp((new Date()).getTime());//当前时间
	
}


//Calendar cal = Calendar.getInstance();
////每天定点执行
//cal.set(Calendar.HOUR_OF_DAY,12);
//cal.set(Calendar.MINUTE,0);
//cal.set(Calendar.SECOND,0);
//Timer timer = new Timer();
//timer.schedule(new TimerTask() {
//public void run() {
////执行的内容
//}
//},cal.getTime(), 24*60*60*1000);