package test;

import java.io.File;
import java.util.ArrayList;

public class FileTest {
 private static ArrayList<String> filelist = new ArrayList<String>();
 
 public static void main(String[] args) throws Exception {
    
    String filePath = "D:\\testpt2\\hbweixin\\WebRoot\\WEB-INF\\lib";
    getFiles(filePath);
 } 
 /*
  * ͨ���ݹ�õ�ĳһ·�������е�Ŀ¼�����ļ�
  */
 static void getFiles(String filePath){
  File root = new File(filePath);
    File[] files = root.listFiles();
    for(File file:files){     
     if(file.isDirectory()){
      /*
       * �ݹ����
       */
      getFiles(file.getAbsolutePath());
      filelist.add(file.getAbsolutePath());
      System.out.println("��ʾ"+filePath+"��������Ŀ¼�����ļ�"+file.getAbsolutePath());
     }else{
      System.out.println("��ʾ"+filePath+"��������Ŀ¼"+file.getAbsolutePath());
     }     
    }
 }
}



