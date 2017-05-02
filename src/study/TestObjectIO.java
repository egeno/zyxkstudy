package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.activation.FileDataSource;
import javax.print.attribute.standard.Finishings;

public class TestObjectIO {  
    public static void main(String args[]) throws Exception{  
        T t = new T();  
        t.c = 8;  
        
        FileOutputStream fos=new FileOutputStream("e:\\a.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();
        
//        FileOutputStream fos = new FileOutputStream("e:\\a.txt");  
//        ObjectOutputStream oos = new ObjectOutputStream(fos);  
//        oos.writeObject(t);  
//        oos.flush();  
//        oos.close();  
          
        FileInputStream fis=new FileInputStream("e:\\a.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        T tReaded=(T)ois.readObject();
        
//        FileInputStream fis = new FileInputStream("e:\\a.txt");  
//        ObjectInputStream ois = new ObjectInputStream(fis);  
//        T tReaded = (T)ois.readObject();  
        System.out.println("tReaded.a"+tReaded.a+" "+"tReaded.b"+tReaded.b+" "+"tReaded.c"+tReaded.c+" "+"tReaded.d"+tReaded.d+" ");  
    }  
  
}  
class T implements Serializable{  
    int a = 1;  
    int b = 2;  
    int c = 3;  
    double d = 4.5;  
}  