package test;

public class Test1 {
    int [] array = {1, 2, 3, 4, 8, 10};
    public static void main(String []args){
        new Test1().run();
    }
     
    public void run(){
         
        int startNum = 0;
        int endNum = array.length;
         
        for(int i = startNum ; i < endNum; i ++){
            String tempStr = "{ " + array[i] + ",";
            printStr(tempStr);
            int tempI = i;
            goOn(++ tempI, endNum, tempStr);
        }
    }
     
    public void goOn(int start, int end, String str){
         
        for(int i = start; i < end; i ++){
            String temp = str;
            temp += " " + array[i] + ",";
            printStr(temp);
            int tempI = i;
            goOn(++ tempI, end, temp);
        }
         
    }
     
    public void printStr(String str){
        str = str.substring(0, str.length() -1) + "}";
        System.out.println(str);
    }
}
//console
//{ 1}
//{ 1, 2}
//{ 1, 2, 3}
//{ 1, 2, 3, 4}
//{ 1, 2, 3, 4, 8}
//{ 1, 2, 3, 4, 8, 10}
//{ 1, 2, 3, 4, 10}
//{ 1, 2, 3, 8}
//{ 1, 2, 3, 8, 10}
//{ 1, 2, 3, 10}
//{ 1, 2, 4}
//{ 1, 2, 4, 8}
//{ 1, 2, 4, 8, 10}
//{ 1, 2, 4, 10}
//{ 1, 2, 8}
//{ 1, 2, 8, 10}
//{ 1, 2, 10}
//{ 1, 3}
//{ 1, 3, 4}
//{ 1, 3, 4, 8}
//{ 1, 3, 4, 8, 10}
//{ 1, 3, 4, 10}
//{ 1, 3, 8}
//{ 1, 3, 8, 10}
//{ 1, 3, 10}
//{ 1, 4}
//{ 1, 4, 8}
//{ 1, 4, 8, 10}
//{ 1, 4, 10}
//{ 1, 8}
//{ 1, 8, 10}
//{ 1, 10}
//{ 2}
//{ 2, 3}
//{ 2, 3, 4}
//{ 2, 3, 4, 8}
//{ 2, 3, 4, 8, 10}
//{ 2, 3, 4, 10}
//{ 2, 3, 8}
//{ 2, 3, 8, 10}
//{ 2, 3, 10}
//{ 2, 4}
//{ 2, 4, 8}
//{ 2, 4, 8, 10}
//{ 2, 4, 10}
//{ 2, 8}
//{ 2, 8, 10}
//{ 2, 10}
//{ 3}
//{ 3, 4}
//{ 3, 4, 8}
//{ 3, 4, 8, 10}
//{ 3, 4, 10}
//{ 3, 8}
//{ 3, 8, 10}
//{ 3, 10}
//{ 4}
//{ 4, 8}
//{ 4, 8, 10}
//{ 4, 10}
//{ 8}
//{ 8, 10}
//{ 10}