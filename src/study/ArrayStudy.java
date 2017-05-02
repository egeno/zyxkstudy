package study;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayStudy {

	public static void main(String[] args) {
		
		//0.  声明一个数组（Declare an array） 
		String[] aArray = new String[5];  
		String[] bArray = {"a","b","c", "d", "e"};  
		String[] cArray = new String[]{"a","b","c","d","e"};  
		//1.  在Java中输出一个数组（Print an array in Java）
		int[] intArray = { 1, 2, 3, 4, 5 };  
		String intArrayString = Arrays.toString(intArray);  
		   
		// print directly will print reference value  
		System.out.println(intArray);  
		// [I@7150bd4d  
		   
		System.out.println(intArrayString);  
		// [1, 2, 3, 4, 5]  
		
		
		//2. 从数组中创建数组列表（Create an ArrayList from an array）
		
		String[] stringArray = { "a", "b", "c", "d", "e" };  
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));  
		System.out.println(arrayList);  
		// [a, b, c, d, e]  
		//3. 检查数组中是否包含特定值（Check if an array contains a certain value）
		
		String[] stringArray2 = { "a", "b", "c", "d", "e" };  
		boolean b = Arrays.asList(stringArray2).contains("a");  
		System.out.println(b);  
		// true  
		//4. 连接两个数组（ Concatenate two arrays）
		
		int[] intArray2 = { 1, 2, 3, 4, 5 };  
		int[] intArray3 = { 6, 7, 8, 9, 10 };  
		// Apache Commons Lang library  
//		int[] combinedIntArray = ArrayUtils.addAll(intArray2, intArray3);  
	//	5. 声明一个数组内链（Declare an array inline ）
		
//		method(new String[]{"a", "b", "c", "d", "e"});  
		//6. 将数组元素加入到一个独立的字符串中（Joins the elements of the provided array into a single String）

		
		// containing the provided list of elements  
		// Apache common lang  
//		String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");  
//		System.out.println(j);  
		// a, b, c  
		//7. 将数组列表转换成一个数组 （Covnert an ArrayList to an array） 
		
		String[] stringArray3 = { "a", "b", "c", "d", "e" };  
		ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(stringArray3));  
		String[] stringArr = new String[arrayList2.size()];  
		arrayList2.toArray(stringArr);  
		for (String s : stringArr)  
		    System.out.println(s);  
		//8. 将数组转换成一个集合（Convert an array to a set） 
		
		Set<String> set = new HashSet<String>(Arrays.asList(stringArray));  
		System.out.println(set);  
		//[d, e, b, c, a]  
		//9. 反向数组（Reverse an array）
		
//		int[] intArray4 = { 1, 2, 3, 4, 5 };  
//		ArrayUtils.reverse(intArray4);  
//		System.out.println(Arrays.toString(intArray4));  
		//[5, 4, 3, 2, 1]  
		//10. 删除数组元素（Remove element of an array）
		
//		int[] intArray5 = { 1, 2, 3, 4, 5 };  
//		int[] removed = ArrayUtils.removeElement(intArray5, 3);//create a new array  
//		System.out.println(Arrays.toString(removed));  
		
		
		//One more – convert int to byte array 
		byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();  
		for (byte t : bytes) {  
		   System.out.format("0x%x ", t);  
		}  
		
		
		
		
	}

}
