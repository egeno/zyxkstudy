package study;

public class Client2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
//		Thread2 my = new Thread2();
//        new Thread(my, "C").start();//ͬһ��mt��������Thread�оͲ����ԣ������ͬһ��ʵ�����mt���ͻ�����쳣   
//        new Thread(my, "D").start();
//        new Thread(my, "E").start();
//		thread2 my=new thread2();
//		new Thread(my,"C").start();		
//		new Thread(my,"D").start();		
//		new Thread(my,"E").start();		
		
//		Thread fThread=new Thread(my,"F");
//		try {
//			fThread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		thread1 mTh1=new thread1("A");
		thread1 mTh2=new thread1("B");
		mTh1.start();
		mTh2.start();
		
		try {
			mTh1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mTh2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
		
//		new Thread(new thread2("C")).start();
//		new Thread(new thread2("D")).start();
		
		
//		thread1 mTh1=new thread1("A");
//		thread1 mTh2=new thread1("B");
////		thread1 mTh2=mTh1;
//		mTh1.start();
//		mTh2.start();
//		
		
		
		
//		SafeStopThread t=new SafeStopThread();
//		System.out.println(t.getPriority());
//		t.setPriority(Thread.MIN_PRIORITY);
//		t.start();
//		SafeStopThread t2=new SafeStopThread();
////		t2.start();
//		
////		for(int i=0 ;i<990000;i++)
////			System.out.println(i);
//		String smain = Thread.currentThread().getName();
//		System.out.println(smain);
//		
//		
//		t.setName("xc1");
//		
//		System.out.println(t.getPriority());
//		System.out.println(t.getName());
		
//		t.terminate();
//		try {
//			t2.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t2.stop();
//		Mt mt= new Mt();
//		Thread thread= new Thread(mt);
//		
//		thread.start();
//		for(int i= 0;i<5;i++){
//			new Thread(mt).start();
//		}
//		thread.stop();
		
//		MultiThread t = new MultiThread();
//		Thread t1 = new Thread(t);
//		// ����t1�߳�
//		t1.start();
//		for (int i = 0; i < 5; i++) {
//			new Thread(t).start();
//		}
//		// ֹͣt1�߳�
//		t1.stop();
	}

}




class thread2 implements Runnable{
	private int count =5;
	private String name;
	
	thread2(){
	}
	
	thread2(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"start");
		for(int i=0;i<5;i++){
//			System.out.println(name+"=run:"+i);
			System.out.println(name+"=run..count="+count--);
			
			try {
				Thread.sleep((int)Math.random()*10);  //
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+"end");
	}
	
}


class thread1 extends Thread{
	private int count=5;
	private String name;
	
	thread1(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){
//			System.out.println(name+"=run:"+i);
			System.out.println(name+"=run..count="+count--);
			
			try {
				sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class SafeStopThread extends Thread{
	private volatile boolean stop=false;
	@Override
	public void run() {
		int i=1022;
		while (!stop && i<0) {
			i--;
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void terminate(){
		stop=true;
	}
	
}

class Mt implements Runnable{
int a=0;
	@Override
	public void run() {
		synchronized ("") {
			
			a++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a--;
			String tn=Thread.currentThread().getName();
			System.out.println(tn+":a="+a);
		}
	}
	
}



//class MultiThread implements Runnable {
//	int a = 0;
//
//	@Override
//	public void run() {
//		// ͬ������飬��֤ԭ�Ӳ���
//		synchronized ("") {
//			// ����
//			a++;
//			try {
//				// �߳�����0.1��
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			// �Լ�
//			a--;
//			String tn = Thread.currentThread().getName();
//			System.out.println(tn + ":a =" + a);
//		}
//	}
//}