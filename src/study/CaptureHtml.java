package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.lang.model.util.Elements;

import org.w3c.dom.Document;

public class CaptureHtml {

	public static void main(String[] args)  {
		try {
			captureHtml("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void captureHtml(String ip) throws Exception {  
//	    String strURL = "http://ip.chinaz.com/?IP=" + ip;  
	String strURL = "http://www.boohee.com/food/group/5";  
	    URL url = new URL(strURL);  
	    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();  
	    InputStreamReader input = new InputStreamReader(httpConn  
	            .getInputStream(), "utf-8");  
	    BufferedReader bufReader = new BufferedReader(input);  
	    String line = "";  
	    StringBuilder contentBuf = new StringBuilder();  
	    while ((line = bufReader.readLine()) != null) {  
	        contentBuf.append(line);  
	    }  
	    String buf = contentBuf.toString();  
	    System.out.println(buf);  
	    
//	    int beginIx = buf.indexOf("查询结果[");  
//	    int endIx = buf.indexOf("上面四项依次显示的是");  
//	    String result = buf.substring(beginIx, endIx);  
//	    System.out.println("captureHtml()的结果：\n" + result);  
	}  
	
	public static void captureJavascript(String postid) throws Exception {  
	    String strURL = "http://www.kiees.cn/sf.php?wen=" + postid  
	            + "&channel=&rnd=0";  
	    URL url = new URL(strURL);  
	    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();  
	    InputStreamReader input = new InputStreamReader(httpConn  
	            .getInputStream(), "utf-8");  
	    BufferedReader bufReader = new BufferedReader(input);  
	    String line = "";  
	    StringBuilder contentBuf = new StringBuilder();  
	    while ((line = bufReader.readLine()) != null) {  
	        contentBuf.append(line);  
	    }  
	    System.out.println("captureJavascript()的结果：\n" + contentBuf.toString());  
	}  
	
//	public static void capture(String url){
//		
//		//构造client  
//		HttpClient client = new HttpClient();  
//		
//		//构建GetMethod对象  
//		GetMethod temp_get = new GetMethod(URL);  
//		client.executeMethod(temp_get);  
//		
//		//获取返回的网页信息  
//		String webResult=temp_get.getResponseBodyAsString();  
//		
//		
//		Document doc = Jsoup.parse(htmlString);  
//		Elements dls = doc.select("#queryform .listinfo").select("dl");  
//		Elements xhdds=dls.get(0).select("dd");//序号  
//		Elements grbmdds=dls.get(1).select("dd");//个人编码 
//		
////	WebClient webClient = new WebClient()  
////			HtmlPage page = webClient.getPage("http://some_url");  
////			final HtmlDivision div = page.getHtmlElementById("some_div_id");  
//		
//		
//		
//	}
	
	
	
	
	
	
	

}
