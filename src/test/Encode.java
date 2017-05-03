package test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Encode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		  String defaultCharsetName=Charset.defaultCharset().displayName();   
	        System.out.println("defaultCharsetName:"+defaultCharsetName);  
		String hz = new String("汉字".getBytes(), "ISO-8859-1");
		System.err.println(hz);
		String hz2 = new String(hz.getBytes("ISO-8859-1"), "utf-8");
		System.err.println(hz2);
		
//		byte[] b_gbk = "中".getBytes("GBK"); 
//		byte[] b_utf8 = "中".getBytes("UTF-8"); 
//		byte[] b_iso88591 = "中".getBytes("ISO8859-1"); 
//
//		String s_gbk = new String(b_gbk,"GBK"); 
//		String s_utf8 = new String(b_utf8,"UTF-8"); 
//		String s_iso88591 = new String(b_iso88591,"ISO8859-1"); 

	}
}
