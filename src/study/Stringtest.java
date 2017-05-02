package study;


public class Stringtest {
	
	public static void main(String[] args) {
		
	String osspath ="dmfkgkdkg/";
		
		if (osspath.endsWith("/")) {
			osspath=osspath.substring(0, osspath.length()-1);
		}
	System.out.println(osspath);
	}
}
	
