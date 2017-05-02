package test;

import java.io.UnsupportedEncodingException;

import study.HttpRequest;

public class HttpTest {
public static void main(String[] args) {
	String url="http://localhost:8080/hbplatform/tenant/portal/MessageQueue/Push.do";
//	String	data="{"MessageType":"Payment"}";
	String	data="{\"MessageType\":\"Payment\"}";
//	String url="http://localhost:8080/hbplatform/tenant/portal/retrievePreDietRecommendList.do";
//	String	data="userId=89dfe9ae-ba92-46d7-916d-d9f37f8dd7f9&jgctbm=61fa4595-dd6b-437f-b5b3-941338e975f5&intaketype=3&datetime=2016-12-20";
	String AssessQuestion = HttpRequest.sendPost(url,data);
	System.out.println(AssessQuestion);
	
	 //GET 
//    String s=HttpRequest.sendGet("http://localhost:6144/Home/RequestString", "key=123&v=456");
//    System.out.println(s);
//    
//    // POST 
//    String sr=HttpRequest.sendPost("http://localhost:6144/Home/RequestPostString", "key=123&v=456");
//    System.out.println(sr);
	
	
//	try {
//		String charset="UTF-8";//"UTF-8"
//		String string= new String("脂肪".getBytes("UTF-8"), charset);
//		System.out.println(string);
//	} catch (UnsupportedEncodingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}  
	
	
	}
}
