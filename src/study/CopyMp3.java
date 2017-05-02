package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyMp3 {
	public static void main(String[] args) throws Exception {
		copy1();
		// copy2();
	}

	/**
	 * 不通过缓存区。自定义字节数组存放数据。
	 */
	public static void copy1() throws Exception {
		FileInputStream fis = new FileInputStream("d:\\DingTalk_v3.4.2.exe");
		FileOutputStream fos = new FileOutputStream("e:\\DingTalk_v3.4.2.exe");

		byte[] by = new byte[1024 * 4];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

	/**
	 * 方式二，使用字节缓冲区，字节缓冲区自带字节数组存放数据，就可以不再写数组。
	 */
	public static void copy2() throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\DingTalk_v3.4.2.exe"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\DingTalk_v3.4.2.exe"));
		int num = 0;
		while ((num = bis.read()) != -1)// 注意此时的read就不用传参数。
		{
			bos.write(num);
		}
		bis.close();
		bos.close();
	}
}
