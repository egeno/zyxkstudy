package test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.attribute.DateTimeSyntax;

import utils.DateCalcUtils;
import utils.StringUtils;


//enum FoodCategory {
//	GS("������"), RD("�⵰��"), SC("�߲���"),DR("������"), SG("ˮ����"), YZ("��֬��");
//	private String desc;
//
//	FoodCategory(String _desc) {
//		desc = _desc;
//	}
//
//	public String getDesc() {
//		return desc;
//	}
//}
public class Test {

	public static void main(String[] args) throws IOException, ParseException {
		
		 datetest();
		
		
//		String idcard,idcardencode;
//		idcard="34220119850314881X";
//		idcardencode=idcard.substring(0, idcard.length()-8)+"****"+idcard.substring(idcard.length()-4);
//		System.out.println(idcard);
//		System.out.println(idcardencode);
//		new Timestamp(new Date().getTime())
//		Timestamp timestamp;
//		timestamp=Timestamp.valueOf("2011-05-09 11:49:45");
//		System.out.println(timestamp);
		
//		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		format.setLenient(false);
//		//Ҫת���ַ� str_test
//		String str_test ="2011-04-24"; 
//		try {
//		Timestamp ts = new Timestamp(format.parse(str_test).getTime());
//		System.out.println(ts.toString());
//		} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
		
//		  File directory = new File("");// ����Ϊ��
//	         String courseFile = directory.getCanonicalPath();
//	         System.out.println(courseFile);
//	         
////	         File f2 = new File(this.getClass().getResource("").getPath());
////	         System.out.println(f2);
//	         
//	         File file = new File(".\\src\\baidu");
//	         System.out.println(file.getAbsolutePath());
//	         try
//	         {
//	             System.out.println(file.getCanonicalPath());
//	         } catch (IOException e)
//	         {
//	             e.printStackTrace();
//	         }
		
		
//		String[] foodCategorys={"1","2","3","4","5","6"};  //ʳ�����
//		int index=Arrays.binarySearch(foodCategorys, "2");
//		System.out.println(index);
//		for (FoodCategory foodCategory : FoodCategory.values()) {
//			
//			System.out.println(foodCategory);
//			System.out.println(foodCategory.getDesc());
//			System.out.println(foodCategory.ordinal());
//			
//		}
		
//		System.out.println(Math.ceil(25.9)); //26
//		System.out.println(Math.ceil(25.5)); //26
//		System.out.println(Math.ceil(25.1)); //26
//		System.out.println(Math.round(25.9)); //26
//		System.out.println(Math.round(25.5)); //26
//		System.out.println(Math.round(25.1)); //25
//		System.out.println(Math.floor(25.9)); //25
//		System.out.println(Math.floor(25.5)); //25
//		System.out.println(Math.floor(25.1)); //25
		
//		String s1="������Ѫ��,����Ѫ��,����θ��,���˰���,��˥��,�ƺ�����,��������,��θ,�ɸ��ƺڰ߼�ȸ��,����,Ԥ����ð,�ٽ�ѪҺѭ";
//		String [] sarrary=s1.split(",");
//		for (int i = 0; i < sarrary.length; i++) {
//			System.out.println(sarrary[i]);
//		}
//		System.out.println(Arrays.toString(sarrary));
	}
	
	
	static void datetest() throws ParseException
	{

		Date date = new Date();
		System.out.println(date);
		String days = "1";
		if (StringUtils.isNotNull(days) && StringUtils.isNumeric(days)) {
			date = DateCalcUtils.dateAdd(Integer.valueOf(days));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(date);

			System.out.println(sdf.format(date));
			Date d1 = sdf.parse("2017-04-28");
			System.out.println(d1);
		}
	}

}
