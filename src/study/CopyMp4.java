package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把D:\music\音乐\Beyond - 不再犹豫.mp3复制到当前项目目录下的copy.mp4中
 * 
 * 字节流四种方式复制文件：
 * 基本字节流一次读写一个字节：   
 * 基本字节流一次读写一个字节数组： 
 * 高效字节流一次读写一个字节： 
 * 高效字节流一次读写一个字节数组： 
 */
public class CopyMp4 {

    public static void main(String[] args) throws IOException {
    	 System.out.println("start");
        long start = System.currentTimeMillis();
        //分别针对四种方式各创建一个方法，
        //参数列表：String 数据源  String 目的地
        //返回类型 void
        method4("d:\\DingTalk_v3.4.2.exe","d:\\copy.exe");
//        method2("d:\\DingTalk_v3.4.2.exe","copy.exe");
//        method3("d:\\DingTalk_v3.4.2.exe","copy.exe");
//        method4("d:\\DingTalk_v3.4.2.exe","copy.exe");
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("一共耗时"+(end - start)+"毫秒");
        
    }

    private static void method4(String start , String end) throws IOException {
        //高效字节流一次读写一个字节数组4
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(start));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(end));
        byte[] by = new byte[1024*100];
        int lend = 0;
        while((lend = in.read(by)) != -1){
            out.write(by,0,lend);
        }
        in.close();
        out.close();
        
    }

    private static void method3(String start , String end) throws IOException {
        // 高效字节流一次读写一个字节61
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(start));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(end));
        int lend = 0;
        while(( lend = in.read()) != -1){
        out.write(lend);
        }
        in.close();
        out.close();
    }

    private static void method2(String start , String end) throws IOException {
        // 基本字节流一次读写一个字节数组10
        FileInputStream in = new FileInputStream(start);
        FileOutputStream out = new FileOutputStream(end);
        
        byte[] by = new byte[1024*100];
        int lend = 0;
        while((lend = in.read(by)) != -1){
            out.write(by,0,lend);
        }
        in.close();
        out.close();
        
    }

    private static void method1(String start , String end) throws IOException {
        // 基本字节流一次读写一个字节6583
        //创建基本字节输入流，以便从数据源读取文件
        FileInputStream in = new FileInputStream(start);
        //创建基本字节输出流，以便写入数据到目的地
        FileOutputStream out = new FileOutputStream(end);
        //复制目标文件
        int i = 0;
        while((i = in.read()) != -1){
            out.write(i);
        }
        in.close();
        out.close();
        
    }

}