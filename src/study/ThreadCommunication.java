package study;

public class ThreadCommunication {
	public static void main(String[] args) {
		final Business business = new Business();
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 50; i++) {
					business.sub(i);
				}
			}

		}).start();

		for (int i = 1; i <= 50; i++) {
			business.main(i);
		}
	}
}

class Business {
	private boolean bShouldSub = true;

	public synchronized void sub(int i) {
		while (!bShouldSub) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int j = 1; j <= 10; j++) {
			System.out.println("sub sequence is :" + j + "   main loop is :" + i);
		}
		bShouldSub = false;
		this.notify();
	}

	public synchronized void main(int i) {
		while (bShouldSub) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int j = 1; j <= 100; j++) {
			System.out.println("main sequence is :" + j + "   main loop is :" + i);
		}
		bShouldSub = true;
		this.notify();
	}
}