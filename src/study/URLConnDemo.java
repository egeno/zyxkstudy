package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnDemo {
	public static void main(String [] args)
	   {
		
		try {
			URL url=new URL("http://www.boohee.com/shiwu/kaixinguo_shu");
			URLConnection urlConnection=url.openConnection();
			HttpURLConnection connection=null;
			if (urlConnection instanceof HttpURLConnection) {
				connection=(HttpURLConnection)urlConnection;
			}
			BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
//			 InputStream is=url.openStream();//获取页面信息流
//		        BufferedReader bfr=new BufferedReader(new InputStreamReader(is));//封装成字符流
//		        String len;
//		        while((len=bfr.readLine())!=null)
//		        {
//		            System.out.println(len);
//		        }
//		        bfr.close();
//		        is.close();
			
			String urlString="";
			String current;
			while ((current=in.readLine())!=null) {
				urlString+=current;
			}
			System.out.println(urlString);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//	      try
//	      {
//	         URL url = new URL("http://www.baidu.com");//runoob
//	         URLConnection urlConnection = url.openConnection();
//	         HttpURLConnection connection = null;
//	         if(urlConnection instanceof HttpURLConnection)
//	         {
//	            connection = (HttpURLConnection) urlConnection;
//	         }
//	         else
//	         {
//	            System.out.println("请输入 URL 地址");
//	            return;
//	         }
//	         BufferedReader in = new BufferedReader(
//	         new InputStreamReader(connection.getInputStream()));//,"UTF-8"
//	         String urlString = "";
//	         String current;
//	         while((current = in.readLine()) != null)
//	         {
//	            urlString += current;
//	         }
//	         System.out.println(urlString);
//	      }catch(IOException e)
//	      {
//	         e.printStackTrace();
//	      }
	   }
}
