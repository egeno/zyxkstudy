package study;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
		String time_end="201702230079";
		
		
		
//		String dateStr = "2010/05/04 12:34:23";  
		String dateStr = "20170222165228";  
        Date date = new Date();  
        //ע��format�ĸ�ʽҪ������String�ĸ�ʽ��ƥ��  
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");  
        try {  
            date = sdf.parse(dateStr);  
            System.out.println(date.toString());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		
		
		
		
        Long time = date.getTime();//Long���ͱ���
		
		Timestamp timestamp= new Timestamp(time);
		
		
		
		
		System.out.println(timestamp);
//		String userdir = System.getProperty("user.dir");
//		System.out.println(userdir);
//		String userdirName = new File(userdir).getName();
//		System.out.println(userdirName);
	}
}
