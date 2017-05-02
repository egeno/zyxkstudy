package test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import net.sf.json.JSONObject;
//import com.alibaba.fastjson.JSONObject;

public class AppAddTest {

//	public static final String ADD_URL = "http://www.cnblogs.com/snake-hand/p/3157332.html";
    public static final String ADD_URL = "http://localhost:8080/hbplatform/tenant/portal/MessageQueue/Push.do";

    public static void appadd() {

        try {
            //创建连接
            URL url = new URL(ADD_URL);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            connection.connect();

            //POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            JSONObject obj = new JSONObject();
            obj.element("MessageType", "Product");
            obj.element("app_ip", "10.21.243.234");
            obj.element("app_port", 8080);
            obj.element("app_type", "001");
            obj.element("app_area", "asd");

            out.writeBytes(obj.toString());
            out.flush();
            out.close();

            
            
//        	String Productjson = createjson(ID, Clientt, IsGetBomListt, PSize, PNumber, STime, ETime);
//    		// post请求
//    		String url = HbPropConfigurer.getProp("zhengyuanhosturll").toString() + "/Customer/GetList";
//    		String tickling = HttpUtils.post(Productjson, HbConstant.V_CONTENTTYPE_APPLICATION_JSON, url);
//            String TotalCount = "";
//    		if (Result.equals("200")) {
//    			String GetData = new JSONObject(JSON.parseObject(tickling)).getString("Data");
//
//    			String Page = new JSONObject(JSON.parseObject(GetData)).getString("Page");
//    			TotalCount = new JSONObject(JSON.parseObject(Page)).getString("TotalCount");
//    			String TotalPage = new JSONObject(JSON.parseObject(Page)).getString("TotalPage");
//    			String GetPageNumber = new JSONObject(JSON.parseObject(Page)).getString("PageNumber");
//    			String Order = new JSONObject(JSON.parseObject(Page)).getString("Order");
//
//    			String Rows = new JSONObject(JSON.parseObject(GetData)).getString("Rows");
//    			JSONArray Rowsdata = JSONArray.fromObject(Rows); // 首先把字符串转成JSONArray对象
//    			if (Rowsdata.size() > 0) {
//    				for (int i = 0; i < Rowsdata.size(); i++) {
//    					Timestamp nowtime = new Timestamp(new Date().getTime());
//    					net.sf.json.JSONObject job = Rowsdata.getJSONObject(i); // 遍历jsonarray数组，把每一个对象转成json对象
//    					String SalePlanID = job.get("SalePlanID") != null ? job.get("SalePlanID").toString() : "";
            
            
            
//            String jsondata = IOUtils.toString(request.getInputStream());
//    		try {
//    			if(StringUtils.isNotNull(jsondata)){
//    				String ID = HbPropConfigurer.getProp("zhengyuanuserid").toString();//UserID
//    				String Clientt = "";
//    				//Data里面的json数据
//    				String IsGetBomListt = "1";//是否获取配料明细数据，0表示否，1表示是。
//    				String PSize =  "10";//一页显示的条数
//    				String PNumber = "1";//页码
//    				//
//    				String STime = "";//开始时间
//    				String ETime = "";//结束时间
//    				String MessageType = new JSONObject(JSON.parseObject(jsondata)).getString("MessageType");
            
            //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            System.out.println(sb);
            reader.close();
            // 断开连接
            connection.disconnect();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        appadd();
    }

}