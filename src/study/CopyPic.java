package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPic {

    /** 
     *  图片的拷贝 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
          
        //创建文件夹  
        File fileDir = new File("F:/yang");  
        fileDir.mkdir();  
          
        //创建两个对象 分别为将要复制的和被复制的  
        File f = new File("F:/my_pic.png");  
        File fileNew = new File("F:/yang/my_pic.png");  
          
        //如果文件不存在则创建一个和将要被复制的文件名字一样的文件  
        if(!fileNew.exists())  
        {  
            try {  
                fileNew.createNewFile();  
                System.out.println("创建成功");  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
          
        //创建字节  图片只有使用字节流的形式来进行拷贝  
        byte data[] = new byte[1024];  
        int n = 0; //n为读取文件的大小  
          
        //读取文件到字符数组内  然后从字符数组内写到目标文件内  
        FileOutputStream foutput = null;   
        FileInputStream finput = null;  
        try {  
            finput = new FileInputStream(f);  
            foutput = new FileOutputStream(fileNew);  
        //循环的一直把文件读完  直到为-1时（-1时表示读完了）    
        while((n = finput.read(data)) != -1)  
            foutput.write(data,0,n);  
               
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }   
        //try catch为异常情况的处理   try后放的是可能出现异常的语句  
        //catch后面放的是异常情况下的提示性语句  
        finally{  
         try {  
            finput.close();  
             foutput.close();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        }  
    System.out.println(" 复  制  完  毕  ");  
    }   
}
