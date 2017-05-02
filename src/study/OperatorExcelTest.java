package study;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class OperatorExcelTest {
	public static void main(String[] args) throws BiffException, IOException {
		String sFilePath = "C:/副本推荐主题—功效食物原材料.xls";
		String sFileSql="C:/sql.txt";
		File file=new File(sFileSql);
		FileWriter out=new FileWriter(file);
		
//            FileReader in = new FileReader(f);  
//            char [] buf = new char[1024];  
//            int len = in.read(buf);  
//            System.out.println(new String(buf,0,len));  

		InputStream is = new FileInputStream(sFilePath);
		Workbook rwb = Workbook.getWorkbook(is);
		Sheet oFirstSheet = rwb.getSheet(0);
		int rows = oFirstSheet.getRows();
		int columns = oFirstSheet.getColumns();
		String gx="";
		String yl="";
		String sql="";
		for (int j = 0; j < columns; j+=2) {
			
//			for (int i = 0; i < rows; i++) {
				int i=0;
				Cell ocCell = oFirstSheet.getCell(j, i);
				gx=ocCell.getContents();
//				if (!ocCell.getContents().isEmpty()) {
//					System.out.println(gx+">>" );
//				}
					for ( i = 0; i < rows; i++) {
						Cell ocCell2 = oFirstSheet.getCell(j+1, i);
						yl=ocCell2.getContents();
						if (!ocCell2.getContents().isEmpty()) {
//							System.out.println(yl );
							sql="update xzmaterial set cltjzt=case when isnull(cltjzt,'')='' then '' else cltjzt+','  end+'"+gx+"' where swclmc='"+yl+"' "+"\r\n GO\r\n ";
							System.out.println(sql );
							out.write(sql);
							
						}
					}
//			}
		}
		out.close();
	}

}
