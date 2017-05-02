package test;

class Thread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println(Thread.currentThread().getId());
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		while (true) {
			if (!false) {
				new Thread1().start();
			}
		}
	}

}
